package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class collectExample {

    /*
        Recoge los elementos en una colección
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        //names.stream()
        //        .map(String::toUpperCase)
        //        .collect(Collectors.toList())
        //        .forEach(System.out::println);

        List<String> result = names.stream()
                .map((name) -> name.toUpperCase())
                //.collect(Collectors.toList());
                .toList();

        result.stream()
                .forEach(System.out::println);
    }
}
