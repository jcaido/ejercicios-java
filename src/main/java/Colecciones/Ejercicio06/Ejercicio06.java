package Colecciones.Ejercicio06;

import java.util.TreeSet;

public class Ejercicio06 {

    /*
        TreeSet. Método compateTo() de la interfaz Comparable para ordenar objetos
     */

    public static void main(String[] args) {

        /*TreeSet<String> ordenaPersonas = new TreeSet<>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        for (String persona : ordenaPersonas) {
            System.out.println(persona);
        }*/

        TreeSet<Articulo> ordenaArticulos = new TreeSet<>();
        ordenaArticulos.add(new Articulo(2, "Segundo articulo"));
        ordenaArticulos.add(new Articulo(3, "Tercer articulo"));
        ordenaArticulos.add(new Articulo(1, "Primer articulo"));

        for (Articulo articulo: ordenaArticulos) {
            System.out.println(articulo.getDescripcion());
        }
    }
}