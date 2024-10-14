package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.concurrent.Callable;

public class CallableExample {

    /*
        No recibe parámetros, pero devuelve un valor y puede lanzar una excepcion
     */

    public static void main(String[] args) {

        //Callable<String> callable = () -> {
        //    return "Resultado de la tarea";
        //};

        Callable<String> callable = () -> "Resultado de la tarea";

        try {
            System.out.println(callable.call());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
