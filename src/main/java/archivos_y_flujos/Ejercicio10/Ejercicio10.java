package archivos_y_flujos.Ejercicio10;

import java.io.*;

public class Ejercicio10 {

    /*
        Serialización y deserialización
     */

    public static void main(String[] args)  {

        Administrador jefe = new Administrador("Juan", 80000, 2005, 12, 15);
        jefe.setIncentivo(5000);

        Empleado[] personal = new Empleado[3];
        personal[0] = jefe;
        personal[1] = new Empleado("Ana", 25000, 2008, 10, 1);
        personal[2] = new Empleado("luis", 18000, 2012, 9, 15);

        try {
            //Serialización
            ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/Desktop/empleado.dat"));
            escribiendo_fichero.writeObject(personal);
            escribiendo_fichero.close();

            //Deserialización
            ObjectInputStream recuperando_fichero = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/Desktop/empleado.dat"));
            Empleado[] personal_recuperado = (Empleado[]) recuperando_fichero.readObject();
            recuperando_fichero.close();

            for (Empleado empleado: personal_recuperado)
                System.out.println(empleado);

        } catch (IOException e) {
            System.out.println("error al abrir el archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("error al escribir el archivo");
        }
    }
}
