package numerosaleatorios;

public class Ejercicio3 {

    /* Muestra 20 numeros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios */

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            int numero = (int) ((Math.random()*11));

            if (i == 20) {
                System.out.println(numero);
            } else {
                System.out.print(numero + "-");
            }
        }

    }
}
