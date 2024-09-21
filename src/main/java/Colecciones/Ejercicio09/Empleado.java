package Colecciones.Ejercicio09;

public class Empleado {

    private String nombre;
    private double sueldo;

    public Empleado(String nombre) {
        this.nombre= nombre;
        this.sueldo = 2000;
    }

    public String toString() {
        return "[Nombre = " + this.nombre + ", Sueldo = "  + this.sueldo + "]";
    }
}
