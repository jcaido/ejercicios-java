package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    /*
        Recibe dos parámetros del mismo y tipo y devuelve un valor del mismo tipo
     */

    public static void main(String[] args) {

        //BinaryOperator<Integer> binaryOperator = (a, b) -> {
        //    return a + b;
        //};

        BinaryOperator<Integer> binaryOperator = (a, b) ->  a + b;

        System.out.println(binaryOperator.apply(5, 6));
    }
}
