package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class mapExample {

    /*
        Recibe una expresión lambda de tipo function
     */


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        //names.stream()
        //        .map((name)-> {
        //           return name.toUpperCase();
        //        })
        //        .forEach((name)-> {
        //            System.out.println(name);
        //        });

        names.stream()
                .map(String::toUpperCase)
                .filter((name)-> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
