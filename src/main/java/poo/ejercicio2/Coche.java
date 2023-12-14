package poo.ejercicio2;

public class Coche extends Vehiculo{

    public String andarConCoche(int kms) {
        this.setKilometrosRecorridos(kms);
        return "he dado un paseo de " + kms + " kilometros con el coche";
    }

    public String quemarRueda() {
        return "estoy quemando las ruedas con el coche";
    }
}
