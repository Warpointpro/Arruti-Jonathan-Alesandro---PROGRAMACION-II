public class ejercicio2 {
    public static class Empleado {
        private String nombre;
        private int legajo;

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

        public double calcularSueldo() {
            return 0;
        }

        @Override
        public String toString() {
            return "Empleado{" + "nombre='" + nombre + '\'' + ", legajo=" + legajo + '}';
        }
    }

    public static void mostrarLegajosExtremos(Empleado[] empleados) {
        if (empleados == null || empleados.length == 0) {
            System.out.println("El arreglo está vacío.");
            return;
        }

        int legajoMin = empleados[0].getLegajo();
        int legajoMax = empleados[0].getLegajo();

        for (int i = 1; i < empleados.length; i++) {
            int legajoActual = empleados[i].getLegajo();
            if (legajoActual < legajoMin) {
                legajoMin = legajoActual;
            }
            if (legajoActual > legajoMax) {
                legajoMax = legajoActual;
            }
        }

        System.out.println("Legajo más bajo: " + legajoMin);
        System.out.println("Legajo más alto: " + legajoMax);
    }

    public static void main(String[] args) {
        Empleado[] empleados = {
            new Empleado("Ana", 105),
            new Empleado("Luis", 42),
            new Empleado("Carlos", 78),
            new Empleado("María", 201)
        };

        mostrarLegajosExtremos(empleados);
    }
}
