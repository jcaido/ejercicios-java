package arrays;

public class Ejercicio1 {

    /* Define un array de 12 numero enteros con nombre num y asigna los siguientes valores:
        Indice 0 = 39
        Indice 1 = -2
        Indice 4 = 0
        Indice 6 = 14
        Indice 8 = 5
        Indice 9 = 120
        Muestra el contenido de todos los elementos del array. ¿Que sucede con los valores de los elementos que
        no han sido inicializados?
     */

    public static void main(String[] args) {

        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int element: num) {
            System.out.println(element);
        }

    }
}
