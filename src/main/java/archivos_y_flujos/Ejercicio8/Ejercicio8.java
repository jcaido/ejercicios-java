package archivos_y_flujos.Ejercicio8;

import archivos_y_flujos.Ejercicio6.LeerFichero;

public class Ejercicio8 {

    /*
        Leer datos desde un archivo utilizando un buffer. Para este ejemplo debemos crear un archivo de texto en el escritorio
        y llamarlo "ejemplo.txt"
     */

    public static void main(String[] args) {

        LeerFicheroBuffer leerFichero = new LeerFicheroBuffer();
        leerFichero.leer();
    }
}
