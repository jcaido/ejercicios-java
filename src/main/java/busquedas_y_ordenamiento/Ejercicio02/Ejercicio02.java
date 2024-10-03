package busquedas_y_ordenamiento.Ejercicio02;

public class Ejercicio02 {

    /*
        Búsqueda binaria
     */

    public static void main(String[] args) {

        int[] array = {2, 4, 8, 10, 12, 24, 35, 43};

        BusquedaBinaria busqueda  = new BusquedaBinaria(array, 23);

        int[] nuevoArray = busqueda.obtenerNuevoArray(array);

        for (int elemento: nuevoArray) {
            System.out.println(elemento);
        }
    }
}
