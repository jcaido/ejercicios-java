package JDBC.conexionBD;

import java.sql.*;

public class ConexionPruebas {

    public static void main(String[] args) {

        try {
            //Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin" );
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost/pruebas", "root", "admin" );
            Statement miStatement = miConexion.createStatement();
            ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM productos");

            while (miResultSet.next()) {
                //System.out.println(miResultSet.getString("CODIGOARTICULO") + " " + miResultSet.getString("NOMBREARTICULO"));
                System.out.println(miResultSet.getString(2) + " " + miResultSet.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
    }
}
