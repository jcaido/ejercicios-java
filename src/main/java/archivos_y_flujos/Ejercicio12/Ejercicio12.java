package archivos_y_flujos.Ejercicio12;

import java.io.File;
import java.io.IOException;

public class Ejercicio12 {

    /*
        Crear archivos / directorios
     */

    public static void main(String[] args) {

        //File ruta = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator + "Desktop" + File.separator + "nuevo_directorio");
        //ruta.mkdir();

        File ruta = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator + "Desktop" + File.separator + "prueba_texto.txt");
        String archivo_destino = ruta.getAbsolutePath();

        try {
            ruta.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);
    }
}
