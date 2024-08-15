package archivos_y_flujos.Ejercicio4;

public enum OpcionMenu {
    SALDO_CERO(1),
    SALDO_CREDITO(2),
    SALDO_DEBITO(3),
    FIN(4)
    ;

    private final int valor;

    OpcionMenu(int valorOpcion) {
        this.valor = valorOpcion;
    }

    public int obtenerValor() {
        return this.valor;
    }
}
