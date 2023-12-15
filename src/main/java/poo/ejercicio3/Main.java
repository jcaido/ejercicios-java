package poo.ejercicio3;

import java.util.Scanner;

public class Main {

    /*
        Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos de cada uno de ellos
        mediante un bucle. Muestra a continuación los datos de todos los gatos utilizando también un bucle.
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Gato[] gatos = new Gato[4];
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        Gato gato3 = new Gato();
        Gato gato4 = new Gato();
        gatos[0] = gato1;
        gatos[1] = gato2;
        gatos[2] = gato3;
        gatos[3] = gato4;

        for (Gato gato : gatos) {
            System.out.println("nombre del gato:");
            gato.setName(s.next());
            System.out.println("especie: ");
            gato.setSpecie(s.next());
        }

        for (Gato gato: gatos) {
            System.out.println(gato.toString());
        }
    }
}
