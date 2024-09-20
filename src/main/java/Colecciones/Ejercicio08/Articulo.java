package Colecciones.Ejercicio08;

public class Articulo {

    private int numeroArticulo;
    private String descripcion;

    public Articulo(int numeroArticulo, String descripcion) {
        this.numeroArticulo = numeroArticulo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
