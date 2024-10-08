package coleccionesydiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04 {

    /*
        Escribe un programa que ordene 10 palabras introducidos por teclado y almacenadas en un objeto de la
        case ArrayList.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> miArrayList = new ArrayList<>();

        for (int i=0; i<10; i++) {
            System.out.println("Introduzca una palabra");
            String palabra = scanner.next();
            miArrayList.add(palabra);
        }

        Collections.sort(miArrayList);

        for (String elemento: miArrayList)
            System.out.println(elemento);
    }
}
