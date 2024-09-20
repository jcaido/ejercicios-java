package Colecciones.Ejercicio07;

import java.util.TreeSet;

public class Ejercicio07 {

    /*
        Ordenar objetos creando una clase Comparador para no obligar a la clase que construye los objetos (Articulo)
        a tener que implementar la intefaz Comparator<>. La clase Comparador creada se la pasamos como argumento al
        instanciar el TreeSet
     */

    public static void main(String[] args) {

        ComparadorArticulos comparaArticulos = new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos = new TreeSet<>(comparaArticulos);

        ordenaArticulos.add(new Articulo(2, "Aegundo articulo"));
        ordenaArticulos.add(new Articulo(3, "Tercer articulo"));
        ordenaArticulos.add(new Articulo(1, "Primer articulo"));

        for (Articulo articulo: ordenaArticulos) {
            System.out.println(articulo.getDescripcion());
        }
    }
}
