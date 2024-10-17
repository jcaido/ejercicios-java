package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class allMatchExample {

    /*
        Verifica si todos los elementos cumplen una condición. Recibe un expresión lambda de tipo Predicate<>
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        //boolean result = names.stream()
        //        .allMatch((name) -> {
        //            return name.startsWith("A");
        //        });

        boolean result = names.stream()
                .allMatch((name) -> name.startsWith("A"));

        System.out.println(result);
    }
}
