package Threads.Ejercicio02;

public class HilosVarios extends Thread{

    @Override
    public void run() {

        for (int i=0; i<15; i++) {
            System.out.println("Ejecutando hilo " + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
