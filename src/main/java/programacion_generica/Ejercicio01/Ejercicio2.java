package programacion_generica.Ejercicio01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {

    /*
        Iteradores
     */

    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));
        listaEmpleados.add(new Empleado("Jose", 35, 2200) );

        Iterator<Empleado>  mi_iterador = listaEmpleados.iterator();

        while (mi_iterador.hasNext())
            System.out.println(mi_iterador.next().dameDatos());
    }
}
