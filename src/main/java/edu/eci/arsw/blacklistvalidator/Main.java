/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.blacklistvalidator;

import java.util.List;

/**
 *
 * @author hcadavid
 */
public class Main {
    
    public static void main(String a[]){
        long startTime = System.currentTimeMillis();
        HostBlackListsValidator hblv=new HostBlackListsValidator();
        int cores = Runtime.getRuntime().availableProcessors();
        List<Integer> blackListOcurrences=hblv.checkHost("200.24.34.55",500);
        long endTime = System.currentTimeMillis();
        System.out.println("The host was found in the following blacklists:"+blackListOcurrences);
        System.out.println("Tiempo de ejecución: " + (endTime - startTime) + " milisegundos.");
        
    }
    
}
