package Colecciones.Ejercicio06;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int numeroArticulo;
    private String descripcion;

    public Articulo() {}

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

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcionA = o1.getDescripcion();
        String descripcionB = o2.getDescripcion();

        return descripcionA.compareTo(descripcionB);
    }
}
