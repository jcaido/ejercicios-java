package Threads.Ejercicio01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoRebote extends JFrame {

    private LaminaPelota lamina;
    private Thread t;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();

        ponerBoton(laminaBotones, "Dale!", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                comienza_el_juego();
            }
        });

        ponerBoton(laminaBotones, "Detener", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener();
            }
        });

        ponerBoton(laminaBotones, "Salir!", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(laminaBotones, BorderLayout.SOUTH);
    }

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    public void comienza_el_juego() {
        Pelota pelota = new Pelota();
        lamina.add(pelota);

        /*for (int i=1; i<=3000; i++) {
            pelota.mueve_pelota(lamina.getBounds());
            lamina.paint(lamina.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/

        Runnable r = new PelotaHilos(pelota, lamina);
        //Thread t = new Thread(r);
        this.t = new Thread(r);
        t.start();
    }

    public void detener() {

        //this.t.stop();

        this.t.interrupt();
    }
}
