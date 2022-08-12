package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Camion extends Vehiculo {
    public double altura;
    public Camion(Integer pasajero, boolean presente, Integer ruedas, Date matricula, String desplazamiento, Integer puerta, String combustible,double altura){
        super(pasajero, presente, ruedas, matricula, desplazamiento, puerta, combustible);
        this.altura = altura;
    }
    public void mostrarCamion(){
        System.out.println("CAMION");
        System.out.println( " Pasajeros: " + getPasajero());
        System.out.println(" Combustible; " + getCombustible());
        System.out.println(" Ruedas: " +getRuedas());
        System.out.println( " Altura: " + altura + "mts");
    }

}
