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

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int siguientePrimo(int n) {
        int siguiente = n + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }
}
