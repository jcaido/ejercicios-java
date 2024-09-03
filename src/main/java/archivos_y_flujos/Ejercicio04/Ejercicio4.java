package archivos_y_flujos.Ejercicio04;

public class Ejercicio4 {

    /*
        Programa que permite a un gerente de créditos obtener las listas de clientes con saldo cero (los clientes no deben
        dinero), saldos con crédito (clientes a los que la compañía debe dinero), y clientes con saldos con débito (clientes
        que deben dinero a la compañía)
     */

    public static void main(String[] args) {
        ConsultaCredito consultaCredito = new ConsultaCredito();
        consultaCredito.procesarSolicitudes();
    }
}
