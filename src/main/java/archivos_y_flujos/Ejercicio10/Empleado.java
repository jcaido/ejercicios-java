package archivos_y_flujos.Ejercicio10;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable {

    private String nombre;
    private double sueldo;
    private Date fechaContrato;

    public Empleado(String n, double s, int agno, int mes, int dia) {
        this.nombre = n;
        this.sueldo = s;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        this.fechaContrato = calendario.getTime();
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empleado setSueldo(double sueldos) {
        this.sueldo = sueldos;
        return this;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public Empleado setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
        return this;
    }

    public void subirSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje/100;
        this.sueldo +=  aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}
