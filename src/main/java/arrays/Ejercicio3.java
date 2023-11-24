package arrays;

import java.util.Scanner;

public class Ejercicio3 {

        /*
            Escribe un programa que lea 10 numeros por teclado y que luego los muestre en orden inverso, es decir,
            el primero que se introduce es el ultimo en mostrarse y viceversa
         */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca numero:");
            array[i] = Integer.parseInt(s.next());
        }

        for (int i = array.length - 1; i >= 0; i-- ) {
            System.out.println(array[i]);
        }
    }
}
