package Colecciones.Ejercicio06;

public class Articulo implements Comparable<Articulo>{

    private int numeroArticulo;
    private String descripcion;

    public Articulo(int numeroArticulo, String descripcion) {
        this.numeroArticulo = numeroArticulo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public int compareTo(Articulo o) {
        return this.numeroArticulo - o.numeroArticulo;
    }
}
