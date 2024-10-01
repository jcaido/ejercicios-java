package busquedas_y_ordenamiento.Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    /*
        Búsqueda lineal
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayLineal array = new ArrayLineal(10);
        int enteroBusqueda;
        int posicion;

        System.out.println(array);

        System.out.println("Escriba un valor entero, -1 para terminar");
        enteroBusqueda = scanner.nextInt();

        while (enteroBusqueda != -1) {
            posicion = array.busquedaLineal(enteroBusqueda);
            if (posicion == -1)
                System.out.println("El entero " + enteroBusqueda + " no se encuentra");
            else
                System.out.println("El entero " + enteroBusqueda + " se encuentra en la posicion " + posicion);

            System.out.println("Escriba un valor entero, -1 para terminar");
            enteroBusqueda = scanner.nextInt();
        }
    }
}
