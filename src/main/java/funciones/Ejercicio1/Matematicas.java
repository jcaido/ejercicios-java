package funciones.Ejercicio1;

public class Matematicas {

    public static int voltea(int n) {
        int resto;
        int invertido = 0;
        while (n > 0) {
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n = n / 10;
        }
        return invertido;
    }

    public static boolean esCapicua(int n) {
        if (n == voltea(n))
            return true;
        return false;
    }
}
