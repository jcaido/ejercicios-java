package Colecciones.Ejercicio09;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio09 {

    /*
        HashMap
     */

    public static void main(String[] args) {

        //HashMap<String, Empleado> personal = new HashMap<>();
        Map<String, Empleado> personal = new HashMap<>();

        personal.put("145", new Empleado("Juan"));
        personal.put("146", new Empleado("Ana"));
        personal.put("147", new Empleado("Antonio"));
        personal.put("148", new Empleado("Sandra"));

        System.out.println(personal);

        personal.remove("147");
        System.out.println(personal);

        personal.put("148", new Empleado("Natalia"));
        System.out.println(personal);

        System.out.println(personal.entrySet());

        for (Map.Entry<String, Empleado> empleado: personal.entrySet()) {
            String clave = empleado.getKey();
            Empleado valorEmpleado =empleado.getValue();
            System.out.println("Clave: " + clave + " Valor: " + valorEmpleado);
        }
    }
}
