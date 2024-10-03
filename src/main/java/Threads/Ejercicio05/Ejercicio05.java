package Threads.Ejercicio05;

public class Ejercicio05 {

    /*
        Crear tres hilos de ejecución que muestren los numeros del 1 al 20 sin utilizar la interfaz Runnable.
        Se ejecutará primero el hilo 1,después el hilo 2 y por último el hilo 3. Al final del programa debe aparecer un
        mensaje indicando que las tareas han terminado.
     */

    public static void main(String[] args) throws InterruptedException {

        Thread hilo1 = new MuestraNumeros();
        Thread hilo2 = new MuestraNumeros2(hilo1);
        Thread hilo3 = new MuestraNumeros2(hilo2);
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo3.join();
        System.out.println("tareas terminadas");

    }
}
