package poo.ejercicio2;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();

        int opcion = 0;
        Scanner s = new Scanner(System.in);

        do {

            System.out.println("\nVEHICULOS");
            System.out.println("===================");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Introduzca una opcion (1-8): ");
            opcion = Integer.parseInt(s.next());

            switch (opcion) {
                case 1:
                    System.out.println(bici.andarConBici(32));
                    break;
                case 2:
                    System.out.println(bici.caballitoConBici());
                    break;
                case 3:
                    System.out.println(coche.andarConCoche(45));
                    break;
                case 4:
                    System.out.println(coche.quemarRueda());
                    break;
                case 5:
                    System.out.println(bici.getKilometrosRecorridos());
                    break;
                case 6:
                    System.out.println(coche.getKilometrosRecorridos());
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                default:
            }

        } while (opcion != 8);
    }
}
