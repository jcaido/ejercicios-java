package String;

import java.util.Scanner;

public class Ejercicio01 {

    /*
        Escriba una aplicación que utilice el método compareTo de la clase String para comparar dos cadenas
        introducidas por el usuario. Muestre si la primera cadena es mayor, menor o igual a la segunda.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la primera cadena");
        String primeraCadena = scanner.next();

        System.out.println("Introduzca la segunda cadena");
        String segundaCadena = scanner.next();

        if (primeraCadena.compareTo(segundaCadena) < 0)
            System.out.println("la primera cadena es mayor que la segunda cadena");
        else if (primeraCadena.compareTo(segundaCadena) > 0)
            System.out.println("La primera cadena es menor que la segunda cadena");
        else
            System.out.println("la primera cadena es igual a la segunda cadena");
    }
}
