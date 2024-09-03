package archivos_y_flujos.Ejercicio08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroBuffer {

    public void leer() {

        try {
            FileReader entrada = new FileReader("C:/Users/Usuario/Desktop/ejemplo.txt");
            BufferedReader miBuffer = new BufferedReader(entrada);

            String linea = "";
            while (linea != null) {
                linea = miBuffer.readLine();

                if (linea != null)
                    System.out.println(linea);
            }

            entrada.close();

        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }

    }


}
