package POO.Herencia;

import POO.Clases.Motor;
import POO.Clases.Vehiculo;

public class Motocicletas extends Vehiculo {

    public static void comentario_moto(){
        System.out.println("Esta moto es la mejor de todas");
    }

    boolean baul;

    // Constructor
    public Motocicletas(String fabricante, String modelo, int anio, boolean baul, Motor motor) {
      super(fabricante, modelo, anio, motor);
      this.baul=baul;
    }

}
