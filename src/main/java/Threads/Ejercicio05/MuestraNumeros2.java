package Threads.Ejercicio05;

public class MuestraNumeros2 extends Thread{

    private Thread hilo;

    public MuestraNumeros2(Thread hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        try {
            this.hilo.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i=1; i<=20; i++) {
            System.out.println("hilo: " + getName() + " numero: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
