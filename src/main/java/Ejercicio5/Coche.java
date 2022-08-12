package Ejercicio5;

import Ejercicio4.Vehiculo;
import java.util.Date;

public class Coche extends Vehiculo {
public int velocidad;
public Coche(Integer pasajero,boolean presente,Integer ruedas,Date matricula, String desplazamiento,Integer puerta,String combustible,int velocidad){
    super(pasajero,presente,ruedas,matricula,desplazamiento,puerta,combustible);
this.velocidad = velocidad;

}

public void mostrarDatosCarro(){
    System.out.println("  FERRARY");
    System.out.println(" Pasajeros: " + getPasajero());
    System.out.println(" Ruedas: " + getRuedas());
    System.out.println(" Combustible: " + getCombustible());
    System.out.println(" tiene una aceleracion de : " + velocidad);



}

}
