package coleccionesydiccionarios;

import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
            Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule
            la suma, la media, el maximo y el minimo de esos numeros. El tamaño de la lista tambien sera aleatorio y
            podra oscilar entre 10 y 20 elementos ambos inclusive.
         */

        int tamaño = (int) (Math.random()*11) + 10;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i<=tamaño; i++) {
            arrayList.add((int) (Math.random()*101));
        }

        for (int valor: arrayList) {
            System.out.println(valor);
        }
    }
}
