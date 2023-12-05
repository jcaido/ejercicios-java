package funciones.Ejercicio1;

public class Ejercicio1 {

    /*
        Crea un paquete que contenga las siguientes funciones:

            - voltea: le da la vuelta a un numero
            - esCapicua: Devuelve verdadero si el numero que se pasa como parametro es capicuay falso en caso contrario
            - esPrimo: Devuelve verdadero si el numero que se pasa como parametro es primo y false en caso contrario
            - siguientePrimo: Devuelve el menor primo que es mayor al numero que se pasa como parametro
     */


    public static void main(String[] args) {
        System.out.println(Matematicas.voltea(2332));
        System.out.println(Matematicas.esCapicua(2332));
        System.out.println(Matematicas.esPrimo(1847));
        System.out.println(Matematicas.siguientePrimo(7));
    }

}
