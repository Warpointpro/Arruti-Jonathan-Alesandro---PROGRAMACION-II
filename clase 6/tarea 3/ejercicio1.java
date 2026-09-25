public class ejercicio1 {
    // CLASE PADRE
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

        public String toString() {
            return nombre + " (Legajo: " + legajo + ")";
        }
    }

    // SUBCLASE 1: EmpleadoPorHoras
    public class EmpleadoPorHoras extends Empleado {
        private int horasTrabajadas;
        private double valorHora;

        public EmpleadoPorHoras(String nombre, int legajo, int horasTrabajadas, double valorHora) {
            super(nombre, legajo);
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public double getValorHora() {
            return valorHora;
        }

        public double calcularSueldo() {
            return horasTrabajadas * valorHora;
        }

        public String toString() {
            return super.toString() + " - Por horas: $" + String.format("%.2f", calcularSueldo());
        }
    }

    // SUBCLASE 2: EmpleadoAsalariado
    public class EmpleadoAsalariado extends Empleado {
        private double sueldoBasico;
        private double bono;

        public EmpleadoAsalariado(String nombre, int legajo, double sueldoBasico, double bono) {
            super(nombre, legajo);
            this.sueldoBasico = sueldoBasico;
            this.bono = bono;
        }

        public double getSueldoBasico() {
            return sueldoBasico;
        }

        public double getBono() {
            return bono;
        }

        public double calcularSueldo() {
            return sueldoBasico + bono;
        }

        public String toString() {
            return super.toString() + " - Asalariado: $" + String.format("%.2f", calcularSueldo());
        }
    }
    public double calcularSueldoTotal(Empleado[] empleados) {
        double total = 0;
        
        // NUEVO: For-each que usa SOLO referencia Empleado
        for (Empleado empleado : empleados) {
            total += empleado.calcularSueldo();
        }
        return total;
    }
}

