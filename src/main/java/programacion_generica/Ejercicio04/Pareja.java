package programacion_generica.Ejercicio04;

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
}
