 // creamos la clase empleado con atributos y un constructor propio
public class tarea1 {
    public static class empleado {
        protected String nombre;
        protected int legajo;

        // hacemos referencia a la clase empleado pasandole parametros como su nombre y legajo
        public empleado(String nombre, int legajo) {
            this.nombre = nombre;
            this.legajo = legajo;
        }

        // Creamos un metodo para calcular saldo y luego que retorne double
        public double calcular_saldo() {
            return 0;
        }

        // Transforma la cadena de caracteres en un objeto que devuelva el empleado y sus atributos como nombre y legajo
        @Override
        public String toString() {
            return "Empleado{" + nombre + ", legajo=" + legajo + '}';
        }
    }
//Generamos una clase que hereda de empleado y le ponemos atributos como horas trabajadas mas el valor por hora
    public static class empleadoporhoras extends empleado {
        private double horastrabajadas;
        private double valorhora;
// ahora generamos un constructor para la clase empleado por horas y le pasamos parametros como nombre, legajo, etc
        public empleadoporhoras(String nombre, int legajo, double horastrabajadas, double valorhora) {
            super(nombre, legajo);
            this.horastrabajadas = horastrabajadas;
            this.valorhora = valorhora;
        }
//transformamos el metodo calcular saldo para que retorne la operacion entre horas trabajadas por el valor por hora
        @Override
        public double calcular_saldo() {
            return horastrabajadas * valorhora;
        }
//transformamos la cadena de caracteres en un texto que devuelva el empleado por horas y todos los atributos que le dimos con anterioridad
        @Override
        public String toString() {
            return "Empleadoporhoras{" + "nombre=" + nombre + ", legajo=" + legajo +
                    ", horasTrabajadas=" + horastrabajadas + ", valorHora=" + valorhora + '}';
        }
    }
}
