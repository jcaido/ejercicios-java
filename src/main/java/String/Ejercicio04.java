package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio04 {

    /*
        Escriba una aplicación que reciba como entrada una línea de texto, que divida la línea en tokens mediante un
        objeto de la clase StringTokenizer que muestre los tokens en orden inversoo. Use caracteres de espacio como
        delimitadores.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca linea de texto");
        String entrada = scanner.nextLine();

        StringTokenizer tokens = new StringTokenizer(entrada);
        String[] arrayTokens = new String[tokens.countTokens()];

        int i = 0;
        while (tokens.hasMoreTokens()) {
            arrayTokens[i] = tokens.nextToken();
            i++;
        }

        for (int contador = arrayTokens.length -1; contador>=0; contador--) {
            System.out.println(arrayTokens[contador]);
        }

    }
}
