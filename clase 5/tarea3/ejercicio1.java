
public class ejercicio1 {
    public class cuentabancaria {
        private String titular;
        private double saldo;
        private int numerocuenta;

        public cuentabancaria(String titular, double saldo, int numerocuenta) {
            this.titular = titular;
            this.saldo = saldo;
            this.numerocuenta = numerocuenta;
        }

        public String getTitular() {
            return titular;
        }

        public double getSaldo() {
            return saldo;
        }

        public int getNumerocuenta() {
            return numerocuenta;
        }
    }
}
