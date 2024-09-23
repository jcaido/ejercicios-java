package Threads.Ejercicio01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarcoRebote extends JFrame {

    private LaminaPelota lamina;

    public MarcoRebote() {
        setBounds(600, 300, 400, 350);
        setTitle("Rebotes");
        lamina = new LaminaPelota();
        add(lamina, BorderLayout.CENTER);
        JPanel laminaBotones = new JPanel();

        ponerBoton(laminaBotones, "Dale!", e -> comienza_el_juego());

        ponerBoton(laminaBotones, "Salir!", e -> System.exit(0));

    }

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }

    public void comienza_el_juego() {
        Pelota pelota = new Pelota();
        lamina.add(pelota);
        for (int i=0; i<=3000; i++) {
            pelota.mueve_pelota(lamina.getBounds());
            lamina.paint(lamina.getGraphics());
            try {
                Thread.sleep(4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
