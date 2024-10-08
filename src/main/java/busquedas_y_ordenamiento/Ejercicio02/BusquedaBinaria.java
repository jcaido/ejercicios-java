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

    public int buscar() {

        int posicionInferior = 0;
        int posicionSuperior = this.array.length -1;
        int posicionMitad = (posicionInferior + posicionSuperior +1) / 2;
        int ubicacion = -1;

        do {
            if (this.enteroABuscar == this.array[posicionMitad])
                ubicacion = posicionMitad + 1;

            else if (this.enteroABuscar < this.array[posicionMitad])
                posicionSuperior = posicionMitad - 1;

            else
                posicionInferior = posicionMitad + 1;

            posicionMitad = (posicionInferior + posicionSuperior + 1) / 2;

        } while((posicionInferior <= posicionSuperior) && (ubicacion == -1));

        return ubicacion;
    }
}
