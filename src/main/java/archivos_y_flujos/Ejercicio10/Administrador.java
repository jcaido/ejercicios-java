package archivos_y_flujos.Ejercicio10;

public class Administrador extends Empleado{

    private double incentivo;

    public Administrador(String n, double s, int agno, int mes, int dia) {
        super(n, s, agno, mes, dia);
        this.incentivo = 0;
    }

    public double getSueldo() {
        double sueldoBase = super.getSueldo();

        return sueldoBase + incentivo;
    }

    public void setIncentivo(double b) {
        this.incentivo = b;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "incentivo=" + incentivo +
                '}';
    }
}
