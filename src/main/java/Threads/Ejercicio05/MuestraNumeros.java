package Threads.Ejercicio05;

public class MuestraNumeros extends Thread{

    @Override
    public void run() {
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
