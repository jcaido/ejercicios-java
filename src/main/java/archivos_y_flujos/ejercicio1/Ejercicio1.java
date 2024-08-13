package archivos_y_flujos.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    /*
        La aplicación debe perdir al usuario que introduzca el nombre de un archivo o directorio y tiene que
        imprimir por pantalla informmación acerca del nombre de archivo o directorio introducido.
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DemostracionFile aplicacion = new DemostracionFile();

        System.out.print("Escriba aqui el nombre del archivo o directorio: ");
        aplicacion.analizarRuta(entrada.nextLine());
    }
}
