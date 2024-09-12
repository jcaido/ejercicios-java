package programacion_generica.Ejercicio06;

public class Pareja <T> {

    private T primero;

    public Pareja() {
        this.primero = null;
    }

    public void setPrimero(T nuevoValor) {
        this.primero = nuevoValor;
    }

    public T getPrimero() {
        return this.primero;
    }

    public static void imprimirEmpleado(Pareja<? extends  Empleado> p) {
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }
}
