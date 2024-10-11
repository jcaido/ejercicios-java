package expresiones_lambda_y_streams.expresiones_lambdas;

public class RunnableExample {

    /*
        No recibe parámetros ni devuelve nada. Solo ejecuta una tarea
     */

    public static void main(String[] args) {

        //Runnable runnable = () -> {
        //    System.out.println("Ejecutando tarea ...");
        //};

        Runnable runnable = () -> System.out.println("Ejecutando tarea ...");

        runnable.run();
    }
}
