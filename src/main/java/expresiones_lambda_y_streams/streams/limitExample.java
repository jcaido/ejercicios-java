package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limitExample {

    /*
        Limita el número de elementos procesados
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        List<String> result = names.stream()
                .limit(3)
                .collect(Collectors.toList());

        result.stream()
                .forEach(System.out::println);

    }
}
