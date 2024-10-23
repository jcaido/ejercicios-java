package JDBC.Aplicacion_consulta;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

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

        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin");
            Statement miSentencia = miConexion.createStatement();

            String consulta = "SELECT DISTINCTROW SECCION FROM productos";
            ResultSet rs = miSentencia.executeQuery(consulta);
            while (rs.next()) {
                secciones.addItem(rs.getString(1));
            }
            rs.close();

            consulta = "SELECT DISTINCTROW PAISORIGEN FROM productos";
            rs = miSentencia.executeQuery(consulta);
            while (rs.next()) {
                paises.addItem(rs.getString(1));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
