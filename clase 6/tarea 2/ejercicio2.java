public class ejercicio2 {

//CLASE PADRE
    public abstract class vehiculo{
      protected String marca;
      protected String modelo;
      protected int año;
    
    public vehiculo (String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
  }
}