package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    /*
        Recibe dos parámetros y devuelve un valor boolean
     */

    public static void main(String[] args) {

        //BiPredicate<Integer, Integer> biPredicate = (a, b) -> {
        //    return a > b;
        //};

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;

        System.out.println(biPredicate.test(2, 5));
    }
}
