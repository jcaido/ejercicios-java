package archivos_y_flujos.Ejercicio5;

import java.io.Serializable;

public class RegistroCuentaSerializable implements Serializable {

    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

    public RegistroCuentaSerializable() {
        this.cuenta = 0;
        this.primerNombre = "";
        this.apellidoPaterno = "";
        this.saldo = 0.0;
    }

    public RegistroCuentaSerializable(int cuenta, String primerNombre, String apellidoPaterno, double saldo) {
        this.cuenta = cuenta;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.saldo = saldo;
    }

    public void establecerCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int obtenerCuenta() {
        return this.cuenta;
    }

    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return this.primerNombre;
    }

    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String obtenerApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void establecerSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double obtenerSaldo() {
        return this.saldo;
    }
}
