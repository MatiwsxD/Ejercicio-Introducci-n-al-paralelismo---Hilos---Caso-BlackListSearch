### Escuela Colombiana de Ingeniería
### Arquitecturas de Software - ARSW
## Ejercicio Introducción al paralelismo - Hilos - Caso BlackListSearch


### Descripción
  Este ejercicio contiene una introducción a la programación con hilos en Java, además de la aplicación a un caso concreto.
  

**Parte I - Introducción a Hilos en Java**

>**Resultado  ```CountMainThreads``` con ```start()```**
>Muestra los números intercalados ya que ejecuta los hilos intercaladamente hasta que llega al final de cada uno. 

>**Resultado  ```CountMainThreads``` con ```run()```**
>Muestra en orden los números debido a que el run ejecuta todo el primer hilo y cuando acaba, pasa al segundo y así con cada uno hasta acabar con todos los hilos. 


**Parte II y III - Evaluación de Desempeño**

1. Un solo hilo.

![](img/Imagen1 - 1Hilo.PNG)

2.Tantos hilos como núcleos de procesamiento

![](img/Imagen2 - 4Hilos.PNG)

3. Tantos hilos como el doble de nucleos de procesamiento

![](img/Imagen3 - 8Hilos.PNG)

4. 50 hilos

![](img/Imagen4 - 50Hilos.PNG)

5. 100 hilos

![](img/Imagen - 100Hilos.PNG)

Grafico tiempo vs hilos

![](img/Imagen6 - tablaGrafica.PNG)

![](img/Imagen7 - Grafico.PNG)

**Parte IV Ejercicio Black List Search**

1. De acuerdo con el resultado obtenido se puede decir que entre mas hilos se utilicen menor es el tiempo de solución. En cuanto al tiempo que se gasta utilizando 500 hilos y 200 hilos, se aprecia que la diferencia no es mucha. 
2. En ambos casos se demoran una gran cantidad de tiempo, sin embargo, utilizando 8 hilos que es el doble de núcleos de procesamiento tiende a tomar un poco mas de tiempo en dar una solución  
3. Como se menciono anteriormente realmente a mas hilos mejor el rendimiento por lo que si se usan 100 maquinas, pero en cada maquina se usa un solo hilos, el gasto en tiempo y en recursos será mucho mayor a lo que realmente se podría gastar manejando más hilos. 

