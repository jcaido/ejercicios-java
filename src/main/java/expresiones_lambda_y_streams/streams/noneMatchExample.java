package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class noneMatchExample {

    /*
        Verifica si ningún elemento cumple una condición. Recibe una expresión lambda de tipo Predicate<>
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        boolean result = names.stream()
                .noneMatch((name) -> name.length() == 10);

        System.out.println(result);
    }
}
