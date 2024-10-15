package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class sortedExample {

    /*
        Ordena los elementos de un stream
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
