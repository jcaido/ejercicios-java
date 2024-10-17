package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class skipExample {

    /*
        Omite un número específico de elementos
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        names.stream()
                .skip(3)
                .forEach(System.out::println);
    }

}
