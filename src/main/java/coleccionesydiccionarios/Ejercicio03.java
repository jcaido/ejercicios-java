package coleccionesydiccionarios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03 {

    /*
        Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en un objeto de la
        case ArrayList.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> miArrayList = new ArrayList<>();

        for (int i=0; i<10; i++) {
            System.out.println("Introduza un numero entero");
            int numero = scanner.nextInt();
            miArrayList.add(numero);
        }

        Collections.sort(miArrayList);

        for (int elemento: miArrayList)
            System.out.println(elemento);
    }
}
