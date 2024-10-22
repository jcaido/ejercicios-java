package JDBC.conexionBD;

import java.sql.*;

public class ConsultaPreparada {

    public static void main(String[] args) {

        Connection miConexion = null;
        try {
            miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin");
            String instruccionSql =  "SELECT NOMBREARTICULO, SECCION, PAISORIGEN FROM productos WHERE SECCION = ? AND PAISORIGEN = ?";
            PreparedStatement miSentencia = miConexion.prepareStatement(instruccionSql);
            miSentencia.setString(1, "FERRETERIA");
            miSentencia.setString(2, "ESPAÑA");
            ResultSet rs = miSentencia.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("NOMBREARTICULO") + " " + rs.getString("SECCION") + " " +
                        rs.getString("PAISORIGEN"));
            }
            rs.close();

            System.out.println("===============================");
            miSentencia.setString(1, "CONFECCION");
            miSentencia.setString(2, "ITALIA");
            rs = miSentencia.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("NOMBREARTICULO") + " " + rs.getString("SECCION") + " " +
                        rs.getString("PAISORIGEN"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
