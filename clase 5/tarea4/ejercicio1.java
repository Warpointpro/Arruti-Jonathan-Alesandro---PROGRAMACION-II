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

        
        // COSA NUEVA QUE NOS PEDIA EL EJERCICIO
        // CREAMOS UN SEGUNDO CONSTRUCTOR PARA RECIBIR TITULAR Y NUMERO DE CUENTA
        public CuentaBancaria(String titular, int numerocuenta) {
            this(titular, 0.0, numerocuenta);
        }


        // una clase metodo que nos devuelva el titular de la cuenta
        public String getTitular() {
            return titular;
        }

        // ponemos una excepción para que no pueda haber titular vacío
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

        // ponemos una excepción para que no pueda haber saldo en negativo
        public void setSaldo(double saldo) {
            if (saldo < 0) {
                throw new IllegalArgumentException("El saldo no puede ser negativo.");
            }
            this.saldo = saldo;
        }

        // un metodo para obtener numero de cuenta y retornarlo
        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        // AÑADIMOS LAS COSAS QUE NOS PIDE AHORA EL EJERCICIO 2

        // creamos un metodo depositar
        public void depositar(double monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
            }
            saldo += monto;
        }

        // creamos un metodo extraer
        public void extraer(double monto) {
            if (monto <= 0) {
                throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
            }
            if (monto > saldo) {
                throw new IllegalArgumentException("Fondos insuficientes para realizar el retiro.");
            }
            saldo -= monto;
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pepito Perez", 1000.0, 89201);
       

        // COSA NUEVA AGREGADA
    // ESTO PIDE EL EJERCICIO TAMBIEN PARA PROBAR AMBOS CONSTRUCTORES
        CuentaBancaria c1 = new CuentaBancaria("Ana", 1500.0, 1001);
        CuentaBancaria c2 = new CuentaBancaria("Luis", 2002);

    System.out.println("Cuenta 1: " + c1.getTitular()
            + " - saldo: " + c1.getSaldo()
            + " - cuenta: " + c1.getNumeroCuenta());

    System.out.println("Cuenta 2: " + c2.getTitular()
            + " - saldo: " + c2.getSaldo()
            + " - cuenta: " + c2.getNumeroCuenta());


 //DEJO TAMBIEN LOS TRY PERO SI NO ESTA BIEN SE LOS PUEDE QUITAR PARA QUE SE VALIDE EL EJERCICIO
        try {
            cuenta.depositar(500.0);
            System.out.println("Depósito exitoso. Nuevo saldo = 1500.0: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada durante el depósito: " + e.getMessage());
        }

        try {
            cuenta.extraer(200.0);
            System.out.println("Extracción exitosa. Nuevo saldo = 1300.0: " + cuenta.getSaldo());
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción capturada durante la extracción: " + e.getMessage());
        }

        try {
            cuenta.extraer(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("error, fondo insuficiente: " + e.getMessage());
        }

        try {
            cuenta.depositar(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("error, la cantidad a depositar debe ser positiva: " + e.getMessage());
        }
    }
 }


