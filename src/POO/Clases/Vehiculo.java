package POO.Clases;

public abstract class Vehiculo {
    // ATRIBUTOS (PROPIEDADES DEL OBJETO)
    protected String fabricante;
    protected String modelo;
    protected int anio;
    protected int velocidad;
    protected Motor motor;
    // CONSTRUCTOR

  public Vehiculo(String fabricante, String modelo, int anio, int velocidad, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidad = velocidad;
        this.motor=motor;
    }
    //CONSTRUCTOR PARA MOTOCICLETAS
    public  Vehiculo(String fabricante, String modelo, int anio, Motor motor){
        this.fabricante=fabricante;
        this.modelo=modelo;
        this.anio=anio;
        this.motor=motor;
    }
    public int acelerar(int contador){
        return this.velocidad+=contador;

    }
}
