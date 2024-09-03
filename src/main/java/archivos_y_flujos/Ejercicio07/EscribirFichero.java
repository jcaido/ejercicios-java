package archivos_y_flujos.Ejercicio07;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public void escribe() {
        try {
            String frase = "Esto es una prueba de escritura. ";
            FileWriter salida = new FileWriter("C:/Users/Usuario/Desktop/ejemplo.txt");

            for (int i = 0; i < frase.length(); i++) {
                salida.write(frase.charAt(i));
            }
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}
