package poo.ejercicio2;

public class Bicicleta extends Vehiculo{

    public String andarConBici(int kms) {
        this.setKilometrosRecorridos(kms);
        return "he dado un paseo de "  + kms + " kilomtros con la bicicleta";
    }

    public String caballitoConBici() {
        return "estoy haciendo un caballito con la bicicleta";
    }

}
