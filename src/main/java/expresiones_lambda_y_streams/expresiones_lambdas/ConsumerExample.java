package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.Consumer;

public class ConsumerExample {

    /*
        Recibe un parámetro y no devuelve nada
     */

    public static void main(String[] args) {

        //Consumer<String> consumer = (param) -> {
        //    System.out.println(param);
        //};

        //Consumer<String> consumer = (param) -> System.out.println(param);

        Consumer<String> consumer = System.out::println;

        consumer.accept("Cristobal");
    }
}
