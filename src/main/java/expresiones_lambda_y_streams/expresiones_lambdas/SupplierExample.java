package expresiones_lambda_y_streams.expresiones_lambdas;

import java.util.function.Supplier;

public class SupplierExample {

    /*
        No recibe ningún parámetro y devulve un valor
     */

    public static void main(String[] args) {

        //Supplier<String> supplier = () -> {
        //    return "Hola, soy un supplier";
        //};

        Supplier<String> supplier = () -> "Hola, soy un supplier";

        System.out.println(supplier.get());
    }
}
