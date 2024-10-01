package busquedas_y_ordenamiento.Ejercicio01;

import java.util.Random;

public class ArrayLineal {

    private int[] datos;
    private static Random generador = new Random();

    public ArrayLineal(int tamanio) {
        this.datos = new int[tamanio];
        for (int i=0; i<datos.length; i++) {
            datos[i] = 10 + generador.nextInt(90); //Rango 10 a 99
        }
    }

    public int busquedaLineal(int claveBusqueda) {
        for (int i=0; i<datos.length; i++) {
            if (datos[i] == claveBusqueda)
                return i;
        }
        return -1;
    }

    public String toString() {
        String contenidoArray = "";
        for (int dato: datos) {
            contenidoArray += " " + String.valueOf(dato);
        }
        return  contenidoArray;
    }
}
