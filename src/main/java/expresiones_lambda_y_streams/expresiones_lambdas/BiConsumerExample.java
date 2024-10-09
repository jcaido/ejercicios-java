package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    /*
        Recibe dos parámetros y mo devuelve nada
     */

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);

        biConsumer.accept("Hola", "mundo");
    }
}
