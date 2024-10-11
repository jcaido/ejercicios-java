package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    /*
        Recibe un parámetro, lo procesa y devuelve un valor del mismo tipo
     */

    public static void main(String[] args) {

        //UnaryOperator<Integer> unaryOperator = (num) -> {
        //    return num * num;
        //};

        UnaryOperator<Integer> unaryOperator = (num) -> num * num;

        System.out.println(unaryOperator.apply(5));
    }
}
