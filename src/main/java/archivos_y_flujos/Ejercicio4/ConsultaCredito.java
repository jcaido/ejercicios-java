package archivos_y_flujos.Ejercicio4;

import com.sun.source.tree.WhileLoopTree;

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
