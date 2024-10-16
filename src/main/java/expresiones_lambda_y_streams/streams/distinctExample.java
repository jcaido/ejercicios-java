package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class distinctExample {

    /*
        Elimina los elementos duplicados
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Ana", "Maria", "Pedro", "Ana", "Carla");

        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
