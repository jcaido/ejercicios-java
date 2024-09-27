package Threads.Ejercicio02;

public class Ejercicio02 {

    /*
        Sincronización de  hilos
     */

    public static void main(String[] args) {

        /*HilosVarios hilo1 = new HilosVarios();
        HilosVarios hilo2 = new HilosVarios();

        hilo1.start();

        try {
            hilo1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        hilo2.start();

        try {
            hilo2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Terminadas las tareas");*/

        HilosVarios hilo1 = new HilosVarios();
        HilosVarios2 hilo2 =new HilosVarios2(hilo1);

        hilo1.start();
        hilo2.start();

        System.out.println("Tareas terminadas");
    }
}
