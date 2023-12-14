package poo.ejercicio1;

public class Vehiculo {

    public static int vehiculosCreados;
    public static int kilometrosTotales;

    public int kilometrosRecorridos;

    public void recorre(int kilometros) {
        kilometrosRecorridos += kilometros;
        kilometrosTotales += kilometros;
    }
}
