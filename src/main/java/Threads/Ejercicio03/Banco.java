package Threads.Ejercicio03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

    private final double[] cuentas;
    private Lock cierreBanco = new ReentrantLock();

    public Banco() {
        cuentas = new double[100];

        for (int i=0; i<cuentas.length; i++) {
            cuentas[i] = 2000;
        }
    }

    public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {

        cierreBanco.lock();

        try {
            if (this.cuentas[cuentaOrigen] < cantidad) {
                return;
            }

            System.out.println(Thread.currentThread());

            this.cuentas[cuentaOrigen] -= cantidad;
            this.cuentas[cuentaDestino] += cantidad;
            System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
            System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());
        } finally {
            cierreBanco.unlock();
        }
    }

    public double getSaldoTotal() {

        double saltoTotal = 0;

        for (int i=0; i<cuentas.length; i++) {
            saltoTotal += cuentas[i];
        }

        return saltoTotal;
    }
}
