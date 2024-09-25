package Threads.Ejercicio01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoRebote extends JFrame {

    private LaminaPelota lamina;
    private Thread t1, t2, t3;
    private JButton arranca1, arranca2, arranca3, detener1, detener2, detener3, salir;

    public MarcoRebote() {
        setBounds(600, 300, 700, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();

        /*ponerBoton(laminaBotones, "Dale!", new ActionListener() {
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
        });*/

        this.arranca1 = new JButton("Hilo1");
        arranca1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca1);

        this.arranca2 = new JButton("Hilo2");
        arranca2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca2);

        this.arranca3 = new JButton("Hilo3");
        arranca3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca3);

        this.detener1 = new JButton("Detener1");
        detener1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener1);

        this.detener2 = new JButton("Detener2");
        detener2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener2);

        this.detener3 = new JButton("Detener3");
        detener3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener3);

        this.salir = new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        laminaBotones.add(salir);

        add(laminaBotones, BorderLayout.SOUTH);
    }

    /*public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }*/

    public void comienza_el_juego(ActionEvent e) {
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

        if (e.getSource().equals(arranca1)) {
            this.t1 = new Thread(r);
            t1.start();
        } else if (e.getSource().equals(arranca2)) {
            this.t2 = new Thread(r);
            t2.start();
        } else if (e.getSource().equals(arranca3)) {
            this.t3 = new Thread(r);
            t3.start();
        }

    }

    public void detener(ActionEvent e) {

        //this.t.stop();

        if (e.getSource().equals(detener1))
            this.t1.interrupt();
        else if (e.getSource().equals(detener2))
            this.t2.interrupt();
        else if (e.getSource().equals(detener3))
            this.t3.interrupt();
    }
}
