package Colecciones.Ejercicio07;

import java.util.Comparator;

public class ComparadorArticulos implements Comparator<Articulo> {
    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcion1 = o1.getDescripcion();
        String descripcion2 = o2.getDescripcion();

        return descripcion1.compareTo(descripcion2);
    }
}
