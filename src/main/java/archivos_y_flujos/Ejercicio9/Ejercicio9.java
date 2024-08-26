package archivos_y_flujos.Ejercicio9;

public class Ejercicio9 {

    /*
        Leer un archivo de secuencia de bytes (imagen).
        Hacer una copia del archivo leido (Escribir un archivo de secuencia de bytes)
     */

    public static void main(String[] args) {

        LeerFicheroBytes leerFichero = new LeerFicheroBytes();
        leerFichero.leer();
        leerFichero.imprimirArrayDatos();

        EscribirFicheroBytes escribirFichero = new EscribirFicheroBytes();
        int datos[] = leerFichero.obtenerArrayDatos();
        escribirFichero.escribir(datos);


    }
}
