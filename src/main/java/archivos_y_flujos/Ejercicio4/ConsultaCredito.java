package archivos_y_flujos.Ejercicio4;

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

    public void procesarSolicitudes() {

        this.tipoCuenta = this.obtenerSolicitud();
    }
}
