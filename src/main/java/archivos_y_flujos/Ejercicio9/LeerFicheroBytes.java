package archivos_y_flujos.Ejercicio9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroBytes {

    public void leer() {

        try {
            FileInputStream entrada = new FileInputStream("C:/Users/Usuario/Desktop/polideportivo-portada.jpg");
            boolean finalAr = false;
            int contador = 0;
            int datosEntrada[] = new int[86253];

            while (!finalAr) {
                int byteEntrada = entrada.read();

                if (byteEntrada != -1)
                    datosEntrada[contador] = byteEntrada;

                else
                    finalAr = true;

                System.out.println(datosEntrada[contador]);

                contador++;
            }

            entrada.close();

            System.out.println(contador);
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }
    }
}
