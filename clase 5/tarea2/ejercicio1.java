//declaramos la clase
public class ejercicio1 {
    public class persona {
        int edad;
        String nombre;
        int dni;
//creamos uan clase persona con atributos como edad nombre dni etc
        public persona(int edad, String nombre, int dni) {
            this.edad = edad;
            this.nombre = nombre;
            this.dni = dni;
        }
//usamos un override para transforma la cadena de carateres en un objeto que devuelva persona junto a sus atributos
        @Override
        public String toString() {
            return "persona{nombre='" + nombre + "', edad=" + edad + ", dni=" + dni + "}";
        }
    }
}
