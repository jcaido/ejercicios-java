package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.Predicate;

public class PredicateExample {

    /*
        Recibe un parámetro y devuelve un valor boolean
     */

    public static void main(String[] args) {

        //Predicate<String> predicate = (str) -> {
        //    return str.length() > 5;
        //};

        Predicate<String> predicate = (str) -> str.length() > 5;

        System.out.println(predicate.test("Hola mundo"));
    }
}
