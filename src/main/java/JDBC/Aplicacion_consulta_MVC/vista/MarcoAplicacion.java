package JDBC.Aplicacion_consulta_MVC.vista;

import javax.swing.*;
import java.awt.*;

public class MarcoAplicacion extends JFrame {

    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;

    public MarcoAplicacion() {
        setTitle("Consulta BBDD");
        setBounds(500, 300, 400, 400);
        setLayout(new BorderLayout());
        JPanel menus = new JPanel();
        menus.setLayout(new FlowLayout());
        this.secciones = new JComboBox();
        this.secciones.setEditable(false);
        this.secciones.addItem("Todos");
        this.paises = new JComboBox();
        this.paises.setEditable(false);
        this.paises.addItem("Todos");
        this.resultado = new JTextArea(4, 50);
        this.resultado.setEditable(false);
        add(resultado);
        menus.add(secciones);
        menus.add(paises);
        add(menus, BorderLayout.NORTH);
        add(resultado, BorderLayout.CENTER);
        JButton botonConsulta = new JButton("Consulta");
        add(botonConsulta, BorderLayout.SOUTH);
    }
}
