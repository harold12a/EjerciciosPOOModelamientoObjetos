package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPlanetario {
    public String NombrePlaneta;
    public double masa;
    public double densidad;
    public double diametro;
    public String distancia;
    public Integer numeroIdenti;
    public double atraccionGravitoria;

    public SistemaPlanetario(String nombrePlaneta,double masa, double densidad, double diametro, String distancia, Integer numeroIdenti) {
        NombrePlaneta = nombrePlaneta;
        this.masa = masa;
        this.densidad = densidad;
        this.diametro = diametro;
        this.distancia = distancia;
        this.numeroIdenti = numeroIdenti;

    }

    public String getNombrePlaneta() {
        return NombrePlaneta;
    }


    public double getMasa() {
        return masa;
    }


    public String getDistancia() {

        return distancia;
    }

    @Override
    public String toString() {
        return "SistemaPlanetario{" +
                "NombrePlaneta='" + NombrePlaneta + '\'' +
                ", masa=" + masa +
                ", densidad='" + densidad + '\'' +
                ", diametro='" + diametro + '\'' +
                ", distancia='" + distancia + '\'' +
                ", numeroIdenti=" + numeroIdenti +
                '}';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SistemaPlanetario> ListaPlaneta = new ArrayList<>();
        SistemaPlanetario planeta1 = new SistemaPlanetario("Mercurio",0.055,5.43,4879," 58.000.000.000 millones km",000);
        SistemaPlanetario planeta2 = new SistemaPlanetario("Venus",0.866 ,5.24,12103.6,"108.2 millones km",001);
        SistemaPlanetario planeta3 = new SistemaPlanetario("Tierra",5.972 ,5.515,12.742,"0.000016033 años luz",002);
        SistemaPlanetario planeta4 = new SistemaPlanetario("Marte",0.107,3.9335,6794.4," 206,7 millones de km ",003);
        SistemaPlanetario planeta5 = new SistemaPlanetario("Jupiter",317.8,1.33,139.820,"0.000078431 años luz",004);
        SistemaPlanetario planeta6 = new SistemaPlanetario("Saturno",95.16,687 ,116.460,"0.00015586 años luz",005);
        SistemaPlanetario planeta7 = new SistemaPlanetario("Urano",14.54,1.27 ,50.724," 3000 millones de kilómetros",006);
        SistemaPlanetario planeta8 = new SistemaPlanetario("Neptuno",17.15,1.64,49.244," 4.500 millones de kilómetros",007);
        ListaPlaneta.add(planeta1);
        ListaPlaneta.add(planeta2);
        ListaPlaneta.add(planeta3);
        ListaPlaneta.add(planeta4);
        ListaPlaneta.add(planeta5);
        ListaPlaneta.add(planeta6);
        ListaPlaneta.add(planeta7);
        ListaPlaneta.add(planeta8);
        int opcion = 0;
        double m1, m2,distancia1,distancia2, distanciaFinal, f,g;
        do{
            System.out.println("CALCULAR LA ACTRACION GRAVITATORIA ENTRE DOS PLANETAS");
            System.out.println(" (1)- CALCULAR ATRACCION GRAVITATORIA DE 2 PLANETAS ");
            System.out.println(" (2)- SALIR DEL PROGRAMA");
            System.out.println("INGRESE LA OPCION A REALIZAR: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i <ListaPlaneta.size() ; i++) {
                        System.out.println("PLANETA: "+ListaPlaneta.get(i).getNombrePlaneta()+" MASA: "+ListaPlaneta.get(i).getMasa()+ " DISTANCIA: " + ListaPlaneta.get(i).getDistancia());
                    }
                    System.out.println("INGRESE LA MASA DEL PRIMER PLANETA 1:");
                    m1 = scanner.nextInt();
                    System.out.println("INGRESE LA MASA DEL SEGUNDO PLANETA 2:");
                    m2 = scanner.nextInt();
                    System.out.println("INGRESE LA DISTANCIA DEL PLANETA 1 :");
                    distancia1 = scanner.nextInt();
                    System.out.println("INGRESE LA DISTANCIA DEL PLANETA 2:");
                    distancia2 = scanner.nextInt();
                    distanciaFinal = distancia1-distancia2;
                    g =0.0000000000667;
                    f = g * m1 * m2 / distanciaFinal;
                    System.out.println("LA ACTRACCION GRAVITATORIA ENTRE LOS DOS CUERPOS ES :"+ f);
                    System.out.println("**********************************************************");
                break;
                case 2:
                    System.out.println("***HAS FINALIZADO EL PROGRAMA***" );
                    System.exit(0);
                    break;
                default:
                    System.out.println("***OPCION NO DISPONIBLE INGRESA OTRA OPCION***");
            }
        }while (true);

    }
}
