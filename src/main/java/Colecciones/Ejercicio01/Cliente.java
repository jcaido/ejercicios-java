package Colecciones.Ejercicio01;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getNumeroCuenta().equals(cliente.getNumeroCuenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroCuenta());
    }
}
