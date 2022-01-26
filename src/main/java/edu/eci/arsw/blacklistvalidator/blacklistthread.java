package edu.eci.arsw.blacklistvalidator;

import java.util.LinkedList;
import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

public class blacklistthread extends Thread {
    private static final int LIMIT_BLACK_LIST = 5;
    private String ip;
    private int start;
    private int end;
    private int count;
    private int blacklistedCount;
    private LinkedList<Integer> servers;

    public blacklistthread(int inicio, int fin, String ip){
        this.start = inicio;
        this.end = fin;
        this.ip = ip;
        this.count=0;
        this.blacklistedCount = 0;
        servers = new LinkedList<Integer>();
    }

    public int getServersAmount(){
        return servers.size();
    }

    public void run() {
        HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
        for (int i=start; i<=end && blacklistedCount < LIMIT_BLACK_LIST; i++) {
            count++;
            if (skds.isInBlackListServer(i, ip)) {
                servers.add(i);
                blacklistedCount++;
            }
        }
    }

    public int getBlacklistedCount(){
        return blacklistedCount;
    }
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getIpAddress() {
        return ip;
    }

    public void setIpAddress(String ipAddress) {
        this.ip = ipAddress;
    }

    public LinkedList<Integer> getServers() {
        return servers;
    }

    public void setServers(LinkedList<Integer> servers) {
        this.servers = servers;
    }

}
