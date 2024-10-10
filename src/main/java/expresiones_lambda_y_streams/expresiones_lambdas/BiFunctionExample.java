package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.BiFunction;

public class BiFunctionExample {

    //Recibe dos parámetros y devuelve un valor

    public static void main(String[] args) {

        //BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> {
        //    return a + b;
        //};

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;

        System.out.println(biFunction.apply(2, 3));

    }
}
