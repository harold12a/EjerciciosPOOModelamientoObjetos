package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Lancha extends Vehiculo {
    public String motor;

    public Lancha(Integer pasajero, boolean presente, Integer ruedas, Date matricula, String desplazamiento, Integer puerta, String combustible,String motor) {
        super(pasajero, presente, ruedas, matricula, desplazamiento, puerta, combustible);
        this.motor = motor;
    }
    public  void mostarLancha (){
        System.out.println(" LANCHA");
        System.out.println(" Motor: " + motor);
        System.out.println(" pasajeros: " + getPasajero());
        System.out.println(" Desplazamiento: " + getDesplazamiento());
        System.out.println(" Puerta: " + getPuerta());
        System.out.println(" Combustible: " + getCombustible());
    }
}

