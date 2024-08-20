package archivos_y_flujos.Ejercicio5;

public class Ejercicio5 {

    /*
        Escribir datos en una archivo secuencial utilizando objetos serializados
     */

    public static void main(String[] args) {
        CrearArchivoSecuencial crearArchivoSecuencial = new CrearArchivoSecuencial();
        crearArchivoSecuencial.abrirArchivo();
        crearArchivoSecuencial.agregarRegistros();
        crearArchivoSecuencial.cerrarArchivo();
    }
}
