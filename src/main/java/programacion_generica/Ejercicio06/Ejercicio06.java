package programacion_generica.Ejercicio06;

public class Ejercicio06 {

    /*
        Herencia y tipos comodín
     */

    public static void main(String[] args) {

        Empleado administrativa = new Empleado("Elena", 45, 1500);
        Jefe directoraComercial = new Jefe("Ana", 27, 3500);
        Empleado nuevoEmpleado = directoraComercial;
        //Empleado otroEmpleado = new Jefe("Alberto", 34, 1800);

        Pareja<Empleado> administrativa_dos = new Pareja<>();
        Pareja<Jefe> directoraComercial_dos = new Pareja<>();
        /*
        Esto no funciona. Problemas con la herencia en clases genéricas
        Pareja<Empleado> nuevoEmpleado_dos = directoraComercial_dos;
        */

        Pareja.imprimirEmpleado(administrativa_dos);
        //Pareja.imprimirEmpleado(directoraComercial_dos); esto no funciona//

        //para que funcione, debemos utilizar un tipo comodin en el metodo imprimirEmpleado <? extends Empleado>

        Pareja.imprimirEmpleado(directoraComercial_dos);
    }
}
