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
    public String toString() {
            return marca + " " + modelo + " " + año + "";
        }
  }
  public class moto extends vehiculo{
    private double cilindrado;

    public moto (String marca, String modelo, int año, double cilindrado){
        super (marca, modelo, año);
        this.cilindrado = cilindrado;
    }
    public String toString() {
        return super.toString() + "Clinindrada ="  + cilindrado + "cc";
    }
  }

  public class auto extends vehiculo{
    private int cantidad_puertas;

    public auto (String marca, String modelo, int año, int cantidad_puertas){
        super (marca,modelo, año);
        this.cantidad_puertas = cantidad_puertas;
    }
    public String toString() {
        return super.toString() + "puertas ="  + cantidad_puertas;
    }
  }
}