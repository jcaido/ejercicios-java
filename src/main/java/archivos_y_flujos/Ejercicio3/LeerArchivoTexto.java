package archivos_y_flujos.Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivoTexto {

    private Scanner entrada;

    public void abriArchivo() {
        try {
            entrada = new Scanner(new File("clientes.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
    }

    public void leerRegistros() {
        RegistroCuenta registro = new RegistroCuenta();
        System.out.printf("%-9s%-15s%-18s%10s\n", "Cuenta", "Primer nombre", "Apellido paterno", "Saldo");

        try {
            while(entrada.hasNext()) {
                registro.setCuenta(entrada.nextInt());
                registro.setPrimerNombre(entrada.next());
                registro.setApellidoPaterno(entrada.next());
                registro.setSaldo(entrada.nextDouble());

                System.out.printf("%-9d%-15s%-18s%10.2f\n",
                        registro.getCuenta(),
                        registro.getPrimerNombre(),
                        registro.getApellidoPaterno(),
                        registro.getSaldo());
            }

        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("El archivo no está bien formado." );
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException illegalStateException) {
            System.err.println("Error al leer el archivo");
            System.exit(1);
        }
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
