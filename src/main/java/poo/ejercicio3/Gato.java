package poo.ejercicio3;

public class Gato {

    private String name;
    private String specie;

    public Gato() {}

    public Gato(String name, String specie) {
        this.name = name;
        this.specie = specie;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecie() {
        return this.specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "name='" + name + '\'' +
                ", specie='" + specie + '\'' +
                '}';
    }
}
