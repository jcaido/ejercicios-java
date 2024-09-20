package Colecciones.Ejercicio08;

import java.util.Comparator;
import java.util.TreeSet;

public class Ejercicio08 {

    /*
        Ordenar objetos en un TreeSet utilizando una clase anónima. No imlementamos la interfaz Comparator<> en la clase
        creadora de objetos (Articulo) ni utilizamos una clase Comparador
     */

    public static void main(String[] args) {

        TreeSet<Articulo> ordenaArticulos = new TreeSet<>(new Comparator<Articulo>() {
            @Override
            public int compare(Articulo o1, Articulo o2) {
                String descripcion1 = o1.getDescripcion();
                String descripcion2 = o2.getDescripcion();

                return descripcion1.compareTo(descripcion2);
            }
        });

        ordenaArticulos.add(new Articulo(2, "Aegundo articulo"));
        ordenaArticulos.add(new Articulo(3, "Tercer articulo"));
        ordenaArticulos.add(new Articulo(1, "Primer articulo"));

        for (Articulo articulo: ordenaArticulos) {
            System.out.println(articulo.getDescripcion());
        }
    }
}
