package programacion_generica.Ejercicio01.Ejercicio03;

import java.io.File;

public class Ejercicio03 {
    /*
        Simular la clase ArrayList sin utilizar programación geenérica. Veremos entonces las ventajas de utilizar la
        programación genérica.
     */

    public static void main(String[] argss) {

        ArrayList archivos = new ArrayList(4);

        archivos.add("Juan");
        archivos.add("Maria");
        archivos.add("Ana");
        archivos.add("Sandra");

        //Esto marcaría un error en tiempo de ejecución que no vemos en tiempo de compilación
        //archivos.add(new File("mi_archivo.txt"));

        String nombrePersona = (String) archivos.get(2);
        System.out.println(nombrePersona);

        /*archivos.add(new File("mi_archivo.txt"));
        File archivo = (File) archivos.get(0);

        System.out.println(archivo);*/
    }
}
