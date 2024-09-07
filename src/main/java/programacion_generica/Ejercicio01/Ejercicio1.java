package programacion_generica.Ejercicio01;


import java.util.ArrayList;

public class Ejercicio1 {

    /*
        ArraList
     */

    public static void main(String[] args) {

        /*
        Empleado[] listaEmpleados = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ana", 45, 2500);
        listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
        listaEmpleados[2] = new Empleado("Maria", 25, 2600);
        */

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("Maria", 25, 2600));
        listaEmpleados.add(new Empleado("Jose", 35, 2200) );

        System.out.println(listaEmpleados.size());

        for (Empleado empleado: listaEmpleados)
            System.out.println(empleado.dameDatos());

        //listaEmpleados.ensureCapacity(11);
        //listaEmpleados.trimToSize();

    }
}
