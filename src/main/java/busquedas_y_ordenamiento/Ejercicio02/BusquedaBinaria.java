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

    public void buscar() {

        int posicionInferior = 0;
        int posicionSuperior = this.array.length -1;
        int posicionMitad = (posicionSuperior - posicionInferior)/2;

        while(posicionMitad > 0) {

            if (this.enteroABuscar == this.array[posicionMitad]) {
                System.out.println("El numero " + this.enteroABuscar + " se encuentra en la posicion " + posicionMitad + " del array");
                break;
            } else {
                if (this.enteroABuscar < this.array[posicionMitad]) {
                    posicionSuperior = posicionMitad-1;
                    posicionMitad = (posicionSuperior - posicionInferior)/2;
                } else {
                    posicionInferior = posicionMitad +1;
                    posicionMitad = posicionMitad + 1 + (posicionSuperior - posicionInferior)/2;
                }
            }
        }

        System.out.println("posicion inferior: " + posicionInferior);
        System.out.println("posicion superior: " + posicionSuperior);
        System.out.println("posicion mitad: " + posicionMitad);
    }
}
