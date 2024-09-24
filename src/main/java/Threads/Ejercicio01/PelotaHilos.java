package Threads.Ejercicio01;

import java.awt.*;

public class PelotaHilos implements Runnable{

    private Pelota pelota;
    private Component componente;

    public PelotaHilos(Pelota pelota, Component componente) {
        this.pelota = pelota;
        this.componente = componente;
    }

    @Override
    public void run() {

        System.out.println("Estado del hilo al comenzar: " + Thread.currentThread().isInterrupted());

        /*for (int i=1; i<=3000; i++) {
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        while (!Thread.currentThread().isInterrupted()) {
            pelota.mueve_pelota(componente.getBounds());
            componente.paint(componente.getGraphics());
        }

        System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
    }
}
