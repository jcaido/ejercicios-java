package JDBC.Aplicacion_consulta_MVC.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection miConexion;

    public Connection dameConexion() {

        try {
            this.miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return this.miConexion;
    }
}
