public class ejercicio1 {
    // SUPERCLASE O CLASE PADRE

    public abstract class Empleado {
        protected String nombre;
        protected int legajo;

        public Empleado(String nombre, int legajo) {
            this.nombre = nombre;
            this.legajo = legajo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getLegajo() {
            return legajo;
        }

        public abstract double calcularSueldo();

        @Override
        public String toString() {
            return nombre + " (Legajo: " + legajo + ")";
        }
    }





    // SUBCLASE 1
    public class EmpleadoPorHoras extends Empleado {
        private int horasTrabajadas;
        private double valorHora;

        public EmpleadoPorHoras(String nombre, int legajo, int horasTrabajadas, double valorHora) {
            super(nombre, legajo);  // ← Invoca super() sin duplicar
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public double getValorHora() {
            return valorHora;
        }

        @Override
        public double calcularSueldo() {
            return horasTrabajadas * valorHora;
        }

        @Override
        public String toString() {
            return super.toString() + " - Por horas: $" + String.format("%.2f", calcularSueldo());
        }
    }






    // SUB CLASE 2
    public class EmpleadoAsalariado extends Empleado {
        private double sueldoBasico;
        private double bono;

        public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
            super(nombre, legajo);  // ← Invoca super() sin duplicar
            this.sueldoBasico = sueldoBasico;
            this.bono = bono;
        }

        public double getSueldoBasico() {
            return sueldoBasico;
        }

        public double getBono() {
            return bono;
        }

        @Override
        public double calcularSueldo() {
            return sueldoBasico + bono;
        }

        @Override
        public String toString() {
            return super.toString() + " - Asalariado: $" + String.format("%.2f", calcularSueldo());
        }
    }




    public static void main(String[] args) {
        ejercicio1 ejercicio = new ejercicio1();

        Empleado empleado1 = ejercicio.new EmpleadoPorHoras("Juan Pérez", 101, 40, 150.50);
        Empleado empleado2 = ejercicio.new EmpleadoAsalariado("María López", 102, 5000, 500);

        System.out.println("=== SUELDOS CALCULADOS ===");
        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}

