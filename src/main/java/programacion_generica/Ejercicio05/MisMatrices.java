package programacion_generica.Ejercicio05;

public class MisMatrices {

    public static <T> String getElementos(T[] array) {
        return "El array tiene " + array.length + " elementos";
    }

    public static <T extends Comparable> T getMenor(T[] array) {
        if (array == null || array.length == 0)
            return null;

        T elementoMenor = array[0];
        for (int i=1; i<array.length; i++) {
            if (elementoMenor.compareTo(array[i]) > 0) {
                elementoMenor = array[i];
            }
        }

        return elementoMenor;
    }
}
