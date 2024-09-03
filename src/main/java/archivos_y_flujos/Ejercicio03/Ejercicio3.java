package archivos_y_flujos.Ejercicio03;

public class Ejercicio3 {

    /*
        Leer registros del archivo "clientes.txt" creado en el Ejercicio2 (archivos y flujos) y mostrar su contenido
     */

    public static void main(String[] args) {

        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        aplicacion.abriArchivo();
        aplicacion.leerRegistros();
        aplicacion.cerrarArchivo();
    }
}
