package POO.Clases;

import POO.Herencia.Motocicletas;

public class Main {
    public static void main(String[] args) {
        Motor motor_renault_camaro=new Motor(20.5, 40, "SAD48DSF84DS6F","HECHO EN U.S.A");
        //Vehiculo renault_camaro= new Vehiculo("Renault","CamaroSS", 2024,22, motor_renault_camaro); ESTO ESTARIA MAL SI LLAMAMOS A LA CLASE VEHICULO  COMO ABSTRACTA
        /*System.out.println(renault_camaro.modelo);
        System.out.println("Velocidad incial: "+renault_camaro.velocidad+"km/h");
        System.out.println("Velocidad final: "+renault_camaro.acelerar(3)+"km/h");
        System.out.println(renault_camaro.motor.origen);*/

        //LA OBJETO MOTOCICLETAS HEREDA LOS ATRIBUTOS DE LA CLASE VEHICULOS:
        Motor motor_ducati_monster=new Motor(937, 111,"SDG46S4F6DS4F","MADE IN CHINA");
        Motocicletas ducati_monster=new Motocicletas("Ducati","monster",2024,true, motor_ducati_monster);
        System.out.println(ducati_monster.fabricante + ducati_monster.motor.origen);

        Motocicletas.comentario_moto();
    }
}
