package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Moto extends Vehiculo {
    public String marca;

    public Moto (Integer pasajero, boolean presente, Integer ruedas, Date matricula, String desplazamiento, Integer puerta, String combustible, String marca){
        super(pasajero, presente, ruedas, matricula, desplazamiento, puerta, combustible);
       this.marca = marca;
    }

    public void mostratMoto(){
        System.out.println(" MOTO");
        System.out.println(" Pasajero: " + getPasajero());
        System.out.println(" Ruedas" + getRuedas());
        System.out.println(" Marca" + marca);

    }
}
