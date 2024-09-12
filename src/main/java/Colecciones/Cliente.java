package Colecciones;

public class Cliente {

    private String nombre;
    private String numeroCuenta;
    private double saldo;

    public Cliente (String nombre, String numeroCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public Cliente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        return this;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente setSaldo(double saldo) {
        this.saldo = saldo;
        return this;
    }
}
