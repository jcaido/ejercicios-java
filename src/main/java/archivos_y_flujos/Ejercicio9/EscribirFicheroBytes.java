package archivos_y_flujos.Ejercicio9;

import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFicheroBytes {

    public void escribir(int datos[]) {

        try {
            FileOutputStream salida = new FileOutputStream("C:/Users/Usuario/Desktop/copia-polideportivo-portada.jpg");

            for (int dato: datos)
                salida.write(dato);
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }

    }
}
