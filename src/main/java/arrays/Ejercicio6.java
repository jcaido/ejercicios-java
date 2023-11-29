package arrays;

import java.util.Scanner;

public class Ejercicio6 {

    /*
        Escribe un programa que pida 20 numeros enteros. Estos numeros se deben introducir en un array de
        4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y de columnas igual que
        si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha
     */


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //pedir los 20 numeros y se almacenan en el array
        int[][] array = new int[4][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Introduzca numero:");
                array[i][j] = Integer.parseInt(s.next());
            }
        }

        // imprimir cuadrante y la suma de las filas
        int[] fila = new int[5];

        for (int i = 0; i < array.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10d", array[i][j]);
                fila[j] = array[i][j];
            }

            for (int elemento: fila) {
                sumaFila += elemento;
            }

            System.out.printf("S = ");
            System.out.printf("%-10d", sumaFila);
            System.out.println();
        }

        //imprimir suma de las columnas
        int[] columna = new int[4];

        for (int i = 0; i < 5; i++) {
            int sumaColumna = 0;
            for (int j = 0; j < 4; j++) {
                columna[j] = array[j][i];
            }

            for (int element : columna) {
                sumaColumna += element;
            }

            System.out.printf("S = %-6s", sumaColumna);
        }

        //imprimir suma total de los elementos del array
        int totalArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalArray += array[i][j];
            }
        }

        System.out.printf("T = %-6s", totalArray);
    }
}
