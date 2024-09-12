package programacion_generica.Ejercicio06;

public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String dameDatos() {
        return "El empleado se llama " + this.nombre + ". Tiene " + this.edad + " anios de edad y un salario de " + this.salario;
    }
}
