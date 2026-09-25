public class ejercicio2 {
    public static class Figura {
        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            super("Círculo");
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }
    }

    public static class Rectangulo extends Figura {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            super("Rectángulo");
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public double getAltura() {
            return altura;
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println(circulo.getNombre() + " - radio: " + circulo.getRadio());
        System.out.println(rectangulo.getNombre() + " - base: " + rectangulo.getBase() + ", altura: " + rectangulo.getAltura());
    }
}
