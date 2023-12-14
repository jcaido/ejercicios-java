package poo.ejercicio1;

public class Ejercicio1 {


    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.recorre(12000);
        coche1.recorre(12000);

        Coche coche2 = new Coche();
        coche2.recorre(10000);
        coche2.recorre(10000);

        System.out.println(coche1.kilometrosRecorridos);
        System.out.println(coche2.kilometrosRecorridos);
        System.out.println(Coche.kilometrosTotales);


    }
}
