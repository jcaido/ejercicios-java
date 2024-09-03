package archivos_y_flujos.Ejercicio02;

public class Ejercicio2 {

    /*
        Crear un archivo de acceso secuencial que muestre las cuentas a cobrar de varios clientes. Por cada cliente,
        el programa obtendrá un número de cuenta, el nombre del cliente y su saldo. Además, por cada cliente se
        añadirá un registro en un archivo.
     */

    public static void main(String[] args) {

        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();
    }
}
