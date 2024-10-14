package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class forEachExample {

    /*
        Utiliza una epresión lambda de tipo Consumer<>
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        //names.stream()
        //
        //        .forEach((name) -> {
        //            System.out.println(name);
        //        });

        names.stream()
                .forEach(System.out::println);
    }
}
