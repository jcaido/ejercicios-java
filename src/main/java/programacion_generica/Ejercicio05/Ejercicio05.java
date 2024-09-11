package programacion_generica.Ejercicio05;


import programacion_generica.Ejercicio01.Empleado;

import javax.sound.midi.Soundbank;
import java.util.GregorianCalendar;

public class Ejercicio05 {

    /*
        Métodos genéricos
     */

    public static void main(String[] args) {

        String[] nombres = {"juan", "ana", "andres"};
        System.out.println(MisMatrices.getElementos(nombres));

        Empleado[] listaEmpleados = {
                new Empleado("Juan", 45, 2200),
                new Empleado("Antonio", 48, 2100),
                new Empleado("Enrique", 40, 1800),
                new Empleado("Vicente", 32, 1500)
        };
        System.out.println(MisMatrices.getElementos(listaEmpleados));

        System.out.println(MisMatrices.getMenor(nombres));
        //System.out.println(MisMatrices.getMenor(listaEmpleados)); error porque Empleado no implementa la interfaz Comparable

        GregorianCalendar[] fechas = {
                new GregorianCalendar(2015,07,12),
                new GregorianCalendar(2015,05,12),
                new GregorianCalendar(2015,04,12)
        };
        System.out.println(MisMatrices.getMenor(fechas));
    }
}
