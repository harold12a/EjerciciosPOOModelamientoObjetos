package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;


public class Bicicleta extends Vehiculo {
    public String cadena;
    public String piñon;
    public Bicicleta(Integer pasajero, boolean presente, Integer ruedas, Date matricula, String desplazamiento, Integer puerta, String combustible,String cadena,String piñon){
        super(pasajero, presente, ruedas, matricula, desplazamiento, puerta, combustible);
        this.cadena = cadena;
        this.piñon = piñon;

    }
    public  void mostarBici(){
        System.out.println("BICICLETA");
        System.out.println(" Cadena: " + cadena);
        System.out.println(" Piñon: " + piñon);
        System.out.println(" Pasajero: " + getPasajero());
    }
}
