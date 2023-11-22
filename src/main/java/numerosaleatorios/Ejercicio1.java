package numerosaleatorios;

public class Ejercicio1 {

    /* Escribe un programa que muestre la tirada de tres datos. Se debe mostrar tambien la suma total
        (los puntos que suman entre los tres dados)
     */

    public static void main(String[] args) {
        int dado1 = (int) ((Math.random()*6) + 1);
        int dado2 = (int) ((Math.random()*6) + 1);
        int dado3 = (int) ((Math.random()*6) + 1);
        int suma = dado1 + dado2 + dado3;

        System.out.println("dado 1: " + dado1);
        System.out.println("dado 2: " + dado2);
        System.out.println("dado 3: " + dado3);
        System.out.println("total puntos: " + suma);
    }
}
