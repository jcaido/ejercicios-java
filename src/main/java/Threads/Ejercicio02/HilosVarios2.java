package Threads.Ejercicio02;

public class HilosVarios2 extends Thread{

    private Thread hilo;

    public HilosVarios2(Thread hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        try {
            this.hilo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i=0; i<15; i++){
            System.out.println("Ejecutando hilo " + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
