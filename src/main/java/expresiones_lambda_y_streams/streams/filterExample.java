package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class filterExample {

    /*
        Recibe un expresion lambda de tipo Predicate<>
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        /*names.stream()
                .filter((name) -> {
                    return name.length() == 4;
                })
                .forEach((name) -> {
                    System.out.println(name);
                });*/

        names.stream()
                .filter((name) -> name.length() == 4)
                .forEach(System.out::println);
    }
}
