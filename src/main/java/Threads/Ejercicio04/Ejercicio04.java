package Threads.Ejercicio04;

public class Ejercicio04 {

    /*
        Utilizar varios hilos que muestren los numeros del  al 20
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
