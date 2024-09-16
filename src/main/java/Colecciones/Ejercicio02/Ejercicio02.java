package Colecciones.Ejercicio02;

public class Ejercicio02 {

    /*
        métodos equals() y hashCode()

    */

    public static void main(String[] args) {

        Libro libro1 = new Libro("P en java", "juan", 25);
        Libro libro2 = new Libro("P en java", "juan", 25);

        if (libro1.equals(libro2))
            System.out.println("es el mismo libro");
        else
            System.out.println("No es el mismo libro");
    }
}
