package archivos_y_flujos.Ejercicio4;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsultaCredito {

    private OpcionMenu tipoCuenta;
    private Scanner entrada;
    private OpcionMenu opciones[] = {OpcionMenu.SALDO_CERO, OpcionMenu.SALDO_CREDITO, OpcionMenu.SALDO_DEBITO, OpcionMenu.FIN};

    private OpcionMenu obtenerSolicitud() {
        Scanner textoSolicitud = new Scanner(System.in);
        int solicitud = 1;

        System.out.printf("\n%s\n%s\n%s\n%s\n%s\n",
                "Escriba solicitud", " 1 - Lista de cuentas con saldos de cero",
                " 2 - Lista de cuentas con saldos con credito",
                " 3 - Lista de cuentas con saldos con debito",
                " 4 - Finalizar ejecucion");

        try {
            do {
                System.out.print("\n? ");
                solicitud = textoSolicitud.nextInt();
            } while (solicitud < 1 || solicitud > 4);
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("Entrada invalida.");
            System.exit(1);
        }

        return this.opciones[solicitud -1];
    }

    private void leerRegistros() {

        RegistroCuenta registroCuenta = new RegistroCuenta();

        try {
            Scanner entrada = new Scanner(new File("clientes.txt"));
            while (entrada.hasNext()) {
                registroCuenta.setCuenta(entrada.nextInt());
                registroCuenta.setPrimerNombre(entrada.next());
                registroCuenta.setApellidoPaterno(entrada.next());
                registroCuenta.setSaldo(entrada.nextDouble());

                if (debeMostrarRegistro(registroCuenta.getSaldo())) {
                    System.out.printf("%-10d%-12s%-12s%10.2f\n",
                            registroCuenta.getCuenta(),
                            registroCuenta.getPrimerNombre(),
                            registroCuenta.getApellidoPaterno(),
                            registroCuenta.getSaldo());
                }
            }
        } catch (NoSuchElementException noSuchElementException) {
            System.err.println("El archivo no esta bien formado");
            entrada.close();
            System.exit(1);
        } catch (IllegalStateException illegalStateException) {
            System.err.println("Error al leer el archivo");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("No se puede encontrar el archivo");
            System.exit(1);
        } finally {
            if (entrada != null)
                entrada.close();
        }
    }

    private boolean debeMostrarRegistro(double saldo) {
        if (saldo == 0 && this.tipoCuenta == OpcionMenu.SALDO_CERO)
            return true;

        else if (saldo < 0 && this.tipoCuenta == OpcionMenu.SALDO_CREDITO)
            return true;

        else if (saldo > 0 && this.tipoCuenta == OpcionMenu.SALDO_DEBITO)
            return true;

        else
            return false;
    }

    public void procesarSolicitudes() {

        this.tipoCuenta = this.obtenerSolicitud();

        while (this.tipoCuenta != OpcionMenu.FIN) {
            switch (this.tipoCuenta) {
                case SALDO_CERO:
                    System.out.println("\nCuentas con saldo cero:\n");
                    break;
                case SALDO_CREDITO:
                    System.out.println("\nCuentas con saldos con credito:\n");
                    break;
                case SALDO_DEBITO:
                    System.out.println("\nCuentas con saldos con debito");
                    break;
            }
            leerRegistros();
            this.tipoCuenta = this.obtenerSolicitud();
        }
    }
}
