package Colecciones.Ejercicio04;

import java.util.LinkedList;
import java.util.ListIterator;

public class Ejercicio04 {

    /*
        LinkedList
     */

    public static void main(String[] args) {

        LinkedList<String> personas = new LinkedList<>();
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");

        System.out.println(personas.size());

        ListIterator<String> it = personas.listIterator();
        it.next();
        it.add("Juan");

        for (String persona: personas){
            System.out.println(persona);
        }
    }
}
