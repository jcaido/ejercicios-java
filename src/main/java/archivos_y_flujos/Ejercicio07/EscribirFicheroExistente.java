package archivos_y_flujos.Ejercicio07;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroExistente {

    public void escribir() {

        try {
            String nuevaFrase = "Esta es otra prueba de escritura";
            FileWriter salida = new FileWriter("C:/Users/Usuario/Desktop/ejemplo.txt", true);

            for (int i = 0; i < nuevaFrase.length(); i++) {
                salida.write(nuevaFrase.charAt(i));
            }
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo");
        }
    }
}
