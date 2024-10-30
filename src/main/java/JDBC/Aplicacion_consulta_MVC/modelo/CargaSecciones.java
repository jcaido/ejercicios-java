package JDBC.Aplicacion_consulta_MVC.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CargaSecciones {

    private Conexion miConexion;
    private Productos miProducto;
    private ResultSet rs;

    public CargaSecciones() {
        miConexion = new Conexion();
    }

    public String ejecutarConsulta() {

        try {
            Connection accesoBBDD = miConexion.dameConexion();
            Statement secciones = accesoBBDD.createStatement();
            this.rs = secciones.executeQuery("SELECT DISTINCROW SECCION FROM productos");

            while (this.rs.next()) {
                this.miProducto = new Productos();
                this.miProducto.setSeccion(rs.getString(1));
                return this.miProducto.getSeccion();
            }
            this.rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return this.miProducto.getSeccion();
    }
}
