package archivos_y_flujos.Ejercicio12;

import java.io.File;

public class Eliminando {

    public static void main(String[] args) {

        File ruta = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator + "Desktop" + File.separator + "prueba_texto.txt");
        ruta.delete();
    }
}
