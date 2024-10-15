package expresiones_lambda_y_streams.streams;

import java.util.Arrays;
import java.util.List;

public class reduceExample {

    /*
        Recibe uan expresion lambda de tipo BinaryOperator
     */

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Luis", "Maria", "Pedro", "Juan", "Carla");

        //String pruebaReduce = names.stream()
        //        .reduce("Resultado: ", (a, b)-> {
        //          return a + " " + b;
        //        });

        String pruebaReduce = names.stream()
                        .reduce("", (a, b) -> a + " " + b);

        System.out.println(pruebaReduce);
    }
}
