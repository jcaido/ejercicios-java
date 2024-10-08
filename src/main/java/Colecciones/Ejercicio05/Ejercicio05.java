package Colecciones.Ejercicio05;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ejercicio05 {

    /*
        Ejercicio LinkedList
     */

    public static void main(String[] args) {

        LinkedList<String> paises = new LinkedList<>();
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");
        ListIterator<String> iterA = paises.listIterator();

        LinkedList<String> capitales = new LinkedList<>();
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");
        ListIterator<String> iterB = capitales.listIterator();

        while (iterB.hasNext()) {
            if (iterA.hasNext()) {
                iterA.next();
            }
            iterA.add(iterB.next());
        }

        System.out.println(paises);

        iterB = capitales.listIterator();
        while (iterB.hasNext()) {
            iterB.next();
            if (iterB.hasNext()) {
                iterB.next();
                iterB.remove();
            }
        }

        System.out.println(capitales);

        paises.removeAll(capitales);
        System.out.println(paises);
    }
}
