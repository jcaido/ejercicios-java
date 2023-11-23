package numerosaleatorios;

public class Ejercicio5 {

    /* Realiza un programa que vaya generando numeros aleatorios pares entre 0 y 100 y que no termine de generar
        numeros hasta que no saque el 24. El programa debera decir al final cuantos numero se han generado.
     */

    public static void main(String[] args) {

        int numero = 0;
        int numerosGenerados = 0;

        while (numero != 24) {
            numero = (int) (Math.random()*101);

            if (numero % 2 != 0) {
                numero++;
                System.out.println("numero generado: " + numero);
                numerosGenerados++;
            } else {
                System.out.println("numero generado: " + numero);
                numerosGenerados++;
            }
        }

        System.out.println("Se han generado: " + numerosGenerados + " numeros aleatorios");

    }
}
