package JDBC.Aplicacion_consulta_MVC;

import JDBC.Aplicacion_consulta_MVC.vista.MarcoAplicacion;

import javax.swing.*;

public class AplicacionConsultaMVC {

    public static void main(String[] args) {

        JFrame miMarco = new MarcoAplicacion();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}
