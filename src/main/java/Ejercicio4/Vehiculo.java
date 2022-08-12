package Ejercicio4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Vehiculo {
    public Integer pasajero;
    boolean presente = false;
    public Integer ruedas;
    public Date matricula;
    public String desplazamiento;
    public Integer puerta;
    public String combustible;

    public Vehiculo(Integer pasajero, boolean presente, Integer ruedas, Date matricula, String desplazamiento, Integer puerta, String combustible) {
        this.pasajero = pasajero;
        this.presente = presente;
        this.ruedas = ruedas;
        this.matricula = matricula;
        this.desplazamiento = desplazamiento;
        this.puerta = puerta;
        this.combustible = combustible;
    }

    public Integer getPasajero() {
        return pasajero;
    }

    public void setPasajero(Integer pasajero) {
        this.pasajero = pasajero;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Date getMatricula() {
        return matricula;
    }

    public void setMatricula(Date matricula) {
        this.matricula = matricula;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public Integer getPuerta() {
        return puerta;
    }

    public void setPuerta(Integer puerta) {
        this.puerta = puerta;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /***
     * fecha formateda
     */
    public String formatearfecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        String fechaCadena = sdf.format(this.matricula);
        return fechaCadena;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "pasajero=" + pasajero +
                ", presente=" + presente +
                ", ruedas=" + ruedas +
                ", matricula=" + formatearfecha() +
                ", desplazamiento='" + desplazamiento + '\'' +
                ", puerta=" + puerta +
                ", combustible='" + combustible + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Vehiculo> listVehiculos = new ArrayList<>();
        Vehiculo mazda = new Vehiculo(5,true,4,new Date(114,10,5),"tierra",5,"corriente");
        Vehiculo ferrari = new Vehiculo(1,true,4,new Date(112,4,5),"tierra",5,"extra");
        Vehiculo chevrolet = new Vehiculo(0,false,4,new Date(118,9,5),"tierra",5,"corriente");
        Vehiculo bws = new Vehiculo(2,true,2,new Date(111,2,15),"tierra",5,"extra");
        Vehiculo bus = new Vehiculo(15,true,10,new Date(114,10,5),"tierra",4,"Disel");
        Vehiculo mercedez = new Vehiculo(4,false,4,new Date(119,10,5),"tierra",5,"corriente");
        Vehiculo kia = new Vehiculo(5,true,4,new Date(114,10,5),"tierra",5,"corriente");
        Vehiculo mazda3 = new Vehiculo(3,true,4,new Date(114,10,5),"tierra",5,"corriente");
        Vehiculo ultraLiviano = new Vehiculo(2,true,3,new Date(121,7,5),"aire",5,"corriente");
        Vehiculo lancha = new Vehiculo(5,true,0,new Date(120,10,5),"agua",5,"Disel");
        listVehiculos.add(mazda);
        listVehiculos.add(ferrari);
        listVehiculos.add(chevrolet);
        listVehiculos.add(bws);
        listVehiculos.add(bus);
        listVehiculos.add(mercedez);
        listVehiculos.add(kia);
        listVehiculos.add(mazda3);
        listVehiculos.add(ultraLiviano);
        listVehiculos.add(lancha);

        System.out.println(mazda);
        System.out.println(ferrari);
        System.out.println(chevrolet);
        System.out.println(bws);
        System.out.println(bus);
        System.out.println(mercedez);
        System.out.println(kia);
        System.out.println(mazda3);
        System.out.println(ultraLiviano);
        System.out.println(lancha);








    }
}
