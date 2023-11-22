package numerosaleatorios;

public class Ejercicio2 {

    /* Realize un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta baraja esta
        dividida en cuatro palos: picas, corazones, diamantes y treboles. Cada palo esta formado por trece
        cartas, de las cuales nueve cartas son numerales y cuatro literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J,
        Q, K, A (que seria el 1).
     */


    public static void main(String[] args) {

        int palo = (int) ((Math.random()*4) +1);
        String paloResultado = "";
        switch (palo) {
            case 1:
                paloResultado = "picas";
                break;
            case 2:
                paloResultado = "corazones";
                break;
            case 3:
                paloResultado = "diamantes";
                break;
            case 4:
                paloResultado = "treboles";
                break;
            default:
        }

        int carta = (int) ((Math.random()*13) +1);
        String cartaResultado = "";
        switch (carta) {
            case 1:
                cartaResultado = "As";
                break;
            case 2:
                cartaResultado = "dos";
                break;
            case 3:
                cartaResultado = "tres";
                break;
            case 4:
                cartaResultado = "cuatro";
                break;
            case 5:
                cartaResultado = "cinco";
                break;
            case 6:
                cartaResultado = "seis";
                break;
            case 7:
                cartaResultado = "siete";
                break;
            case 8:
                cartaResultado = "ocho";
                break;
            case 9:
                cartaResultado = "nueve";
                break;
            case 10:
                cartaResultado = "diez";
                break;
            case 11:
                cartaResultado = "J";
                break;
            case 12:
                cartaResultado = "Q";
                break;
            case 13:
                cartaResultado = "K";
                break;
            default:
        }

        System.out.println(cartaResultado + " de " + paloResultado);

    }
}
