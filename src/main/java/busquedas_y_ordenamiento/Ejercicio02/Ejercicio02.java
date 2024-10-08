package busquedas_y_ordenamiento.Ejercicio02;

public class Ejercicio02 {

    /*
        Búsqueda binaria
     */

    public static void main(String[] args) {

        int[] array = {2, 4, 8, 10, 12, 24, 35, 43};

        BusquedaBinaria busqueda  = new BusquedaBinaria(array, 45);

        /*System.out.println(".... BUSCANDO ELEMENTO CON VALOR " + busqueda.getEnteroABuscar());

        int i = 1;
        while (array.length > 1) {

            if (busqueda.compararEnteroABuscarTerminoMedio(array)) {
                System.out.println("El elemento " + busqueda.getEnteroABuscar() + " se encuentra en el array");
                break;
            } else {
                System.out.println("elementos del nuevo array, iteracion numero " + i);
                array = busqueda.obtenerNuevoArray(array);

                for (int elemento: array) {
                    System.out.println(elemento);
                }

                System.out.println("--------------------------------------------------");
            }

            i++;
        }

        if (array.length > 1 && !busqueda.compararEnteroABuscarTerminoMedio(array))
            System.out.println("El elemento " + busqueda.getEnteroABuscar() + " no se encuentra en el array");

        if (array.length == 1 && array[0] == busqueda.getEnteroABuscar())
            System.out.println("El elemento " + busqueda.getEnteroABuscar() + " se encuentra en el array");

        if (array.length == 1 && array[0] != busqueda.getEnteroABuscar())
            System.out.println("El elemento " + busqueda.getEnteroABuscar() + " no se encuentra en el array");*/

       if (busqueda.buscar() == -1)
           System.out.println("El elemento " + busqueda.getEnteroABuscar() + " no se encuentra en el array");
       else
           System.out.println("El elemento " + busqueda.getEnteroABuscar() + " se encuenta en la posicion " + busqueda.buscar());
    }
}
