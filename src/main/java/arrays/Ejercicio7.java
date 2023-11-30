package arrays;

import java.util.Scanner;

public class Ejercicio7 {

    /*
        Juego simple del buscaminas
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;

        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        //inicializar el cuadrante
        for (x = 0; x <= 4; x++) {
            for (y = 0; y <= 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        //coloca la mina
        int minaX = (int) (Math.random()*5);
        int minaY = (int) (Math.random()*4);
        System.out.println("mina = (" + minaX + ", " + minaY + ")");
        cuadrante[minaX][minaY] = MINA;

        //coloca el tesoro
        int tesoroX = (int) (Math.random()*5);
        int tesoroY = (int) (Math.random()*4);
        while (minaX == tesoroX && minaY == tesoroY) {
            tesoroX = (int) (Math.random()*5);
            tesoroY = (int) (Math.random()*4);
        }
        System.out.println("tesoro = (" + tesoroX + ", " + tesoroY + ")");
        cuadrante[tesoroX][tesoroY] = TESORO;


        //pide las coordenadas
        boolean salir = false;

        do {
            System.out.println("coordenada x: ");
            x = Integer.parseInt(s.next());
            System.out.println("coordenada y: ");
            y = Integer.parseInt(s.next());
            if (cuadrante[x][y] == MINA) {
                System.out.println("BANG!!");
                break;
            }
            if (cuadrante[x][y] == TESORO) {
                System.out.println("tesoro encontrado");
                break;
            }
            if (cuadrante[x][y] == INTENTO) {
                System.out.println("ya ha intentado anteriormente esta tirada");
            }
            cuadrante[x][y] = INTENTO;
        } while (!salir);
    }
}
