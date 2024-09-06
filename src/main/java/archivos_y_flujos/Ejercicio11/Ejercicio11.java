package archivos_y_flujos.Ejercicio11;

import java.io.File;

public class Ejercicio11 {

    /*
        Practicas de la clase File
     */

    public static void main(String[] args) {

        //File archivo = new File("src");
        //System.out.println(archivo.getAbsolutePath());
        //System.out.println(archivo.exists());

        File ruta = new File("C:" + File.separator + "Users" + File.separator + "Usuario" + File.separator + "Desktop" + File.separator + "angular" + File.separator + "mi-polideportivo");
        System.out.println(ruta.getAbsolutePath());
        String[] nombres_archivos = ruta.list();
        for (int i=0; i<nombres_archivos.length; i++) {

            System.out.println(nombres_archivos[i]);
            File sub_ruta = new File(ruta.getAbsolutePath(), nombres_archivos[i]);

            if (sub_ruta.isDirectory()) {
                String[] archivos_sub_carpetas = sub_ruta.list();

                for (String archivo_sub_carpeta: archivos_sub_carpetas)
                    System.out.println(archivo_sub_carpeta);
            }
        }
    }
}
