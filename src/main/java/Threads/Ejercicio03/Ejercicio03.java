package Threads.Ejercicio03;

public class Ejercicio03 {

    /*
        Crear un banco con 100 cuentas que realice transferencias entre sus cuentas de manera indefinida
        mediante utilización de hilos. Cada cuenta corrienta dispondrá deun saldo inicial de 2000 euros.
     */

    public static void main(String[] args) {

        Banco banco = new Banco();

        for (int i=0; i<100; i++) {
            Runnable r = new EjecucionTransferencias(banco, i, 2000);
            Thread t = new Thread(r);
            t.start();
        }
    }

}
