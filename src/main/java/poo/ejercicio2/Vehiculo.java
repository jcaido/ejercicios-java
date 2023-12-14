package poo.ejercicio2;

public class Vehiculo {

    public static int vehiculosCreados;
    public static int kilometrosTotales = 0;

    private int kilometrosRecorridos = 0;

    public Vehiculo() {}

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos += kilometrosRecorridos;
        kilometrosTotales += kilometrosRecorridos;
    }
}
