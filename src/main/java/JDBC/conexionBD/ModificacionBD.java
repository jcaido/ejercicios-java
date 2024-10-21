package JDBC.conexionBD;

import java.sql.*;

public class ModificacionBD {

    public static void main(String[] args) {

        try {
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin");
            Statement miStatement = miConexion.createStatement();

            String instruccionSql = "INSERT INTO productos (CODIGOARTICULO, NOMBREARTICULO) VALUES ('AR77', 'PANTALON')";
            miStatement.executeUpdate(instruccionSql);
            System.out.println("Datos insertados correctamente");

            String instruccionSql2 = "UPDATE productos SET NOMBREARTICULO = 'NINGUNO' WHERE CODIGOARTICULO = 'AR01'";
            miStatement.executeUpdate(instruccionSql2);
            System.out.println("Datos modificados correctamente");

            String instruccionSql3 = "DELETE FROM productos WHERE CODIGOARTICULO = 'AR77'";
            miStatement.executeUpdate(instruccionSql3);
            System.out.println("Datos eliminados correctamente");
        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }

    }
}
