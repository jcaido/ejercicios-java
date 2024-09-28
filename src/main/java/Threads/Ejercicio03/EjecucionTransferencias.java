package Threads.Ejercicio03;

public class EjecucionTransferencias implements Runnable{

    private Banco banco;
    private int cuentaOrigen;
    private double cantidadMaxima;

    public EjecucionTransferencias(Banco banco, int cuentaOrigen, double cantidadMaxima) {
        this.banco = banco;
        this.cuentaOrigen = cuentaOrigen;
        this.cantidadMaxima = cantidadMaxima;
    }

    @Override
    public void run() {

        while(true) {
            int cuentaDestino = (int)(Math.random()*100);
            double cantidad = (int)(Math.random()*cantidadMaxima);

            this.banco.transferencia(cuentaOrigen, cuentaDestino, cantidad);
            try {
                Thread.sleep((int)(Math.random()*10));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
