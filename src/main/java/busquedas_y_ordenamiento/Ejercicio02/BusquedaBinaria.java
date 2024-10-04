package busquedas_y_ordenamiento.Ejercicio02;

import java.util.Arrays;

public class BusquedaBinaria {

    private int[] array;
    private int enteroABuscar;

    public int getEnteroABuscar() {
        return enteroABuscar;
    }

    public BusquedaBinaria(int[] array, int enteroABuscar) {
        this.array = array;
        this.enteroABuscar = enteroABuscar;
    }

    public boolean compararEnteroABuscarTerminoMedio(int[] array) {
        if (this.enteroABuscar == array[obtenerMitadArray(array)]) {
            return true;
        } else {
            return false;
        }
    }

    public int obtenerMitadArray(int[] array) {
        return array.length/2;
    }
    public int[] obtenerNuevoArray(int[] array) {

        if (this.enteroABuscar < array[obtenerMitadArray(array)])
            return Arrays.copyOfRange(array, 0, array.length/2);

        else if (this.enteroABuscar > array[obtenerMitadArray(array)])
            return Arrays.copyOfRange(array, array.length/2, array.length);

        else
            return null;
    }
}
