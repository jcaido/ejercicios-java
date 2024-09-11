package programacion_generica.Ejercicio04;

public class Ejercicio04 {

    /*
        Clases genéricas propias
     */

    public static void main(String[] args) {

        Pareja<String> pareja_uno = new Pareja<>();
        pareja_uno.setPrimero("Juan");
        System.out.println(pareja_uno.getPrimero());

        Pareja<Persona> pareja_dos = new Pareja<>();
        pareja_dos.setPrimero(new Persona("Ana"));
        System.out.println(pareja_dos.getPrimero().getNombre());
    }
}
