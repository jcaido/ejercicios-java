package Threads.Ejercicio04;

public class MuestraNumeros implements Runnable{

    @Override
    public void run() {
        for (int i=1; i<=20; i++) {
            System.out.println("numero : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
