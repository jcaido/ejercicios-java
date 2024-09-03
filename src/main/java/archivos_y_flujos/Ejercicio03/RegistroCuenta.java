package archivos_y_flujos.Ejercicio03;

public class RegistroCuenta {

        private int cuenta;
        private String primerNombre;
        private String apellidoPaterno;
        private double saldo;

        public RegistroCuenta() {
            this.cuenta = 0;
            this.primerNombre = "";
            this.apellidoPaterno = "";
            this.saldo = 0.0;
        }

        public RegistroCuenta(int cuenta, String primerNombre, String apellidoPaterno, double saldo) {
            this.cuenta = cuenta;
            this.primerNombre = primerNombre;
            this.apellidoPaterno = apellidoPaterno;
            this.saldo = saldo;
        }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
