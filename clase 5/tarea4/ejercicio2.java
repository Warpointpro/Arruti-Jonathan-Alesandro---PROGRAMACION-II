public class ejercicio2{

//EMPEZAMOS CREANDO CLASE VEHICULO CON ATRIBUTOS COMO MARCA, MODELO Y PRECIO//
   public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
     }
  }
}
