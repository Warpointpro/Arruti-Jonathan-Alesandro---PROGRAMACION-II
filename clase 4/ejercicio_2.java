package prueba_persona;

public class ejercicio_1 {
 class Persona {
   String nombre;
   int edad;
   int dni;

   Persona(String nombre, int edad, int dni) {
     this.nombre = nombre;
     this.dni = dni;
     this.edad = edad;
   }
   @Override
   public String toString() {
     return "hola mi nombre es " + nombre + " y tengo " + edad + " años.";
   }
 }   
 Persona p1 = new Persona("Juan", 20, 109869);
 Persona p2 = new Persona("Maria", 30, 19584);
 Persona p3 = new Persona("Lily", 19, 5869);
}
