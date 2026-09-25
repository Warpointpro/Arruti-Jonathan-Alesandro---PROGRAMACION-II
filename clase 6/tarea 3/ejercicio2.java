public class ejercicio2 {
    //REUTILIZACION CODIGO FIGURA
    public static abstract class Figura {
        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public abstract double calculararea();
    }

    public static class Triangulo extends Figura {
        private double a, b, c;

        public Triangulo(double a, double b, double c) {
            super("Triangulo");
            this.a = a;
            this.b = b;
            this.c = c;

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalArgumentException("Los lados no forman un triángulo válido");
            }
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double calculararea() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
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

        public double calculararea() {
            return Math.PI * radio * radio;
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

        public double calculararea() {
            return base * altura;
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);
        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0);

        System.out.println(circulo.getNombre() + " - radio: " + circulo.getRadio());
        System.out.println(rectangulo.getNombre() + " - base: " + rectangulo.getBase() + ", altura: " + rectangulo.getAltura());
        System.out.println(triangulo.getNombre() + " - lados: " + triangulo.getA() + ", " + triangulo.getB() + ", " + triangulo.getC());
    }
}
