package archivos_y_flujos.Ejercicio6;

import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

    public void lee() {

        try {
            FileReader entrada = new FileReader("C:/Users/Usuario/Desktop/ejemplo.txt");

            int c = 0;
            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }
    }
}
