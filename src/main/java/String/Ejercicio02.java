package String;

import java.util.Scanner;

public class Ejercicio02 {

    /*
        Escriba una aplicación que utilice el método regionMatches de la clase String para comparar dos cadenas
        introducidas por el usuario. La aplicación deberá recibir como entrada el número de caracteres a comparar
        y el índice inicial de la comparación. La aplicación deberá indicar si las cadenas son iguales. Ignore si los
        caracteres están en mayúsculas o minúsculas al momento de realizar la comparación.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la primera cadena");
        String primeraCadena = scanner.nextLine();

        System.out.println("Introduzca la segunda cadena");
        String segundaCadena = scanner.nextLine();

        System.out.println("numero de caracteres a comparar");
        int numeroCaracteres = scanner.nextInt();

        System.out.println("indice inicial de la comparación");
        int indiceInicial = scanner.nextInt();

        if (primeraCadena.regionMatches(true, indiceInicial, segundaCadena, 0, numeroCaracteres) == true)
            System.out.println("Las cadenas son iguales");
        else
            System.out.println("las cadenas no son iguales");
    }
}
