package arrays;

public class Ejercicio5 {

    /*
        Define un array de numeros enteros de 3 filas por 6 columnas con nombre "num" y asigna los valores segun la
        siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma de tabla.

                Columna 0       Columna 1       Columna 2       Columna 3       Columna 4        Columna 5
        Fila 0  0               30              2                                                5
        Fila 1  75                                                              0
        Fila 2                                  -2              9                                11
     */

    public static void main(String[] args) {

        int[][] array = new int[3][6];
        array[0][0] = 0;
        array[0][1] = 30;
        array[0][2] = 2;
        array[0][5] = 5;
        array[1][0] = 75;
        array[1][4] = 0;
        array[2][2] = -2;
        array[2][3] = 9;
        array[2][5] = 11;

        System.out.println("          Columna 0 Columna 1 Columna 2 Columna 3 Columna 4 Columna 5");
        for (int i = 0; i < array.length; i++) {
            System.out.print("fila " + i + "    ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%-10d", array[i][j]);
            }
            System.out.println();
        }

    }
}
