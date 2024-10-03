package busquedas_y_ordenamiento.Ejercicio02;

import java.util.Arrays;

public class BusquedaBinaria {

    private int[] array;
    private int enteroABuscar;

    public BusquedaBinaria(int[] array, int enteroABuscar) {
        this.array = array;
        this.enteroABuscar = enteroABuscar;
    }
    public int[] obtenerNuevoArray(int[] arrayRecibido) {
        int mitad = arrayRecibido.length/2;

        if (this.enteroABuscar < arrayRecibido[mitad])
            return Arrays.copyOfRange(arrayRecibido, 0, arrayRecibido.length/2);

        else if (this.enteroABuscar > arrayRecibido[mitad])
            return Arrays.copyOfRange(arrayRecibido, arrayRecibido.length/2, arrayRecibido.length);

        else
            return null;
    }
}
