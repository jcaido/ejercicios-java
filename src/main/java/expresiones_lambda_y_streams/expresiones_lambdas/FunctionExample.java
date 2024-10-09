package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.Function;

public class FunctionExample {

    /*
        Recibe un parámetro y devuelve un valor
     */

    public static void main(String[] args) {

        //Function<Integer, String> function = (num) -> {
        //    return "El numero es el " + num;
        //};

        Function<Integer, String> function = (num) -> "El numero es el " + num;

        System.out.println(function.apply(5));
    }
}
