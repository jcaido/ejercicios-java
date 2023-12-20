package coleccionesydiccionarios;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
            Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos nombres por pantalla.
            utiliza para ello un bucle for que recorra el ArrayList sin usar ningún índice.
         */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alfredo");
        arrayList.add("Maria");
        arrayList.add("Eva");
        arrayList.add("Gonzalo");
        arrayList.add("Alberto");
        arrayList.add("Sonia");

        for (String compañero: arrayList) {
            System.out.println(compañero);
        }
    }
}
