package Threads.Ejercicio04;

public class Ejercicio04 {

    /*
        Crear dos hilos de ejecución que muestren los numeros del 1 al 20 utilizando la interfaz Runnable.
        Se ejecutará primero el hilo 1 y por último el hilo dos. Al final del programa debe aparecer un
        mensaje indicando que las tareas han terminado.
     */

    public static void main(String[] args) throws InterruptedException {

        Runnable r = new MuestraNumeros();
        Thread hilo1 = new Thread(r);
        Thread hilo2 = new Thread(r);
        hilo1.start();
        hilo1.join();
        hilo2.start();
        hilo2.join();
        System.out.println("tareas terminadas");
    }
}
