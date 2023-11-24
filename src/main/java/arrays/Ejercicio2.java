package arrays;

public class Ejercicio2 {

    /*
        Define un arrya de 10 caracteres con nombre simbolo y asigna los siguientes valores a los elementos
        Indice 0 = 'a'
        Indice 1 = 'x'
        Indice 4 = '@'
        Indice 6 = ' '
        Indice 7 = '+'
        Indice 8 = 'Q'
        Muestra el contenido de todos los elementos del array. ¿Que sucede con los elementos del array que no
        han sido inicializados?
     */

    public static void main(String[] args) {

        char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (char element: simbolo) {
            System.out.println(element);
        }

    }
}
