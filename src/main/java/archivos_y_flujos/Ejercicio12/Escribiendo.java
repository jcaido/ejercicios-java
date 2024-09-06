package archivos_y_flujos.Ejercicio12;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {

    public void escribir(String ruta_arhivo) {

        String frase = "Esto es un ejemplo. Espero que funcione";

        FileWriter escritura = null;
        try {
            escritura = new FileWriter(ruta_arhivo);

            for (int i=0; i<frase.length();i++)
                escritura.write(frase.charAt(i));

            escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
