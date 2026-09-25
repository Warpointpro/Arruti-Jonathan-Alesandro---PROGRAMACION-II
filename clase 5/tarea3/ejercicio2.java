public class ejercicio2 {
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



//AÑADIMOS LAS COSAS QUE NOS PIDE AHORA EL EJERCICIO 2


        //creamos un metodo depositar
        public void depositar(double monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
            }
            saldo += monto;
        }
        //creamos un metodo extraer 
        public void extraer(double monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
            }
            if (monto > saldo) {
                throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro.");
            }
            saldo -= monto;
        }
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pepito Perez", 1000.0, 89201);

        // primer try exitoso   
        try {
            cuenta.depositar(500.0);
            System.out.println("Depósito exitoso. Nuevo saldo = 1500.0: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada durante el depósito: " + e.getMessage());
        }

        // segundo caso de try exitoso
        try {
            cuenta.extraer(200.0);
            System.out.println("Extracción exitosa. Nuevo saldo = 1300.0: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada durante la extracción: " + e.getMessage());
        }

        // primer caso de try no válido
        try {
            cuenta.extraer(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("error, fondo insuficiente: " + e.getMessage());
        }

        // segundo caso de try no válido
        try {
            cuenta.depositar(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("error, la cantidad a depositar debe ser positiva: " + e.getMessage());
        }
    }
    }
}

