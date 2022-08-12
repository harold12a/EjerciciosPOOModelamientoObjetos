package Ejercicio5;

import Ejercicio4.Vehiculo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(5,true,4,new Date(),"tierra",3,"extra",10);
        Lancha lancha = new Lancha(25,true,0,new Date(),"agua",0,"disel","fuera de borda");
        Moto moto = new Moto(2,false,2,new Date(),"tierra",0,"corriente","yamaha");
        Bicicleta bicicleta = new Bicicleta(1,true,2,new Date(),"",0,"","cadena","piñones");
        Camion camion = new Camion(1,false,22,new Date(),"tierra",2,"disel",4.5);
        coche.mostrarDatosCarro();
        System.out.println("********");
        lancha.mostarLancha();
        System.out.println("********");
        moto.mostratMoto();
        System.out.println("********");
        bicicleta.mostarBici();
        System.out.println("********");
        camion.mostrarCamion();


    }
}
