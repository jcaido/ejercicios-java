package JDBC.Aplicacion_consulta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class MarcoAplicacion extends JFrame {

    private JComboBox secciones;
    private JComboBox paises;
    private JTextArea resultado;
    private Connection miConexion;
    private PreparedStatement enviaConsultaSeccion;
    private PreparedStatement enviaConsultaPais;
    private PreparedStatement enviaConsultaSeccionPais;
    private final String consultaSeccion  = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM productos WHERE SECCION = ?";
    private final String consultaPais  = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM productos WHERE PAISORIGEN = ?";
    private final String consultaSeccionPais  = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISORIGEN FROM productos WHERE SECCION = ? AND PAISORIGEN = ?";

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
        botonConsulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarConsulta();
            }
        });
        add(botonConsulta, BorderLayout.SOUTH);


        try {
            this.miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin");
            Statement miSentencia = this.miConexion.createStatement();

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

    private void ejecutarConsulta() {

        ResultSet rs = null;

        try {
            resultado.setText("");
            String seccion = (String)secciones.getSelectedItem();
            String pais = (String)paises.getSelectedItem();

            if (!seccion.equals("Todos") && pais.equals("Todos")) {
                this.enviaConsultaSeccion = this.miConexion.prepareStatement(this.consultaSeccion);
                this.enviaConsultaSeccion.setString(1, seccion);
                rs = this.enviaConsultaSeccion.executeQuery();
            } else if (seccion.equals("Todos") && !pais.equals("Todos")) {
                this.enviaConsultaPais = this.miConexion.prepareStatement(this.consultaPais);
                this.enviaConsultaPais.setString(1, pais);
                rs = this.enviaConsultaSeccion.executeQuery();
            } else if (!seccion.equals("Todos") && !pais.equals("Todos")) {
                this.enviaConsultaSeccionPais = this.miConexion.prepareStatement(this.consultaSeccionPais);
                this.enviaConsultaSeccionPais.setString(1, seccion);
                this.enviaConsultaSeccionPais.setString(2, pais);
                rs = this.enviaConsultaSeccionPais.executeQuery();
            }


            while (rs.next()) {
                resultado.append(rs.getString(1));
                resultado.append(", ");
                resultado.append(rs.getString(2));
                resultado.append(", ");
                resultado.append(rs.getString(3));
                resultado.append(", ");
                resultado.append(rs.getString(4));
                resultado.append("\n");
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
