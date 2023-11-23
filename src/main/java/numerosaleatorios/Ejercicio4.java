package numerosaleatorios;

import java.util.Scanner;

public class Ejercicio4 {

    /* Escribe un programa que muestre un numero al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello
        cinco oportunidades. Despues de cada intento fallido, el programa dira cuantas oportunidades quedan y si el
        numero introducido es menor o mayor que el numero secreto.
     */


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int numero = (int) (Math.random()*101);
        System.out.println("el programa ha elegido un numero entre 0 y 100");

        for (int i = 1; i <= 5; i++) {
            //System.out.println(numero);

            System.out.println("Puede adivinar el numero?");
            int numeroElegido = Integer.parseInt(s.next());

            if (numeroElegido == numero) {
                System.out.println("Correcto!!, el numero elegido es el: " + numero);
                break;
            } else {
                if (i == 5) {
                    System.out.println("No es correcto!!, ADIOS!!");
                } else {
                    System.out.println("No es correcto!!, le quedan " + (5-i) + " intentos");
                }
            }
        }


    }
}
