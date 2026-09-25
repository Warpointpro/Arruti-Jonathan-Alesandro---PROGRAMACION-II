
public class ejercicio1 {
    public static class CuentaBancaria {
        private String titular;
        private double saldo;
        private int numeroCuenta;

        public CuentaBancaria(String titular, double saldo, int numeroCuenta) {
            setTitular(titular);
            setSaldo(saldo);
            this.numeroCuenta = numeroCuenta;
        }
//una clase metodo que nos devuelva el titula de la cuenta
        public String getTitular() {
            return titular;
        }
//ponemos una excepcion para que no pueda haber titular vacio
        public void setTitular(String titular) {
            if (titular == null || titular.trim().isEmpty()) {
                throw new IllegalArgumentException("El titular no puede estar vacío.");
            }
            this.titular = titular;
        }
// creamos un metodo para obtener saldo y retornarlo
        public double getSaldo() {
            return saldo;
        }
//ponemos una excepcion para que no pueda haber saldo en negativo
        public void setSaldo(double saldo) {
            if (saldo < 0) {
                throw new IllegalArgumentException("El saldo no puede ser negativo.");
            }
            this.saldo = saldo;
        }
//un metodo para obtener numero de cuenta y retornarlo
        public int getNumeroCuenta() {
            return numeroCuenta;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", 1500.0, 123456);
//hacemos un primer try para capturar una excepcion con respecto al titular de la cuenta no este vacio
        try {
            cuenta.setTitular("");
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
//usamos un try para capturar una excepcion en caso del saldo ser de un valor negativo
        try {
            cuenta.setSaldo(-50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
