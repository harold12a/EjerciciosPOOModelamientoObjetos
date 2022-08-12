package Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class BurbujaQuick {
public Integer pasadas, temporal;

    public BurbujaQuick() {
        this.pasadas = 0;
        this.temporal = 0;
    }

    public void burbuja1 (int [] arreglo){
       int pasadas = 0;
        for (int i = 0; i <arreglo.length; i++) {
            for (int j = 0; j <arreglo.length -1 ; j++) {
                if(arreglo[j]>arreglo[j+1]){
                    temporal = arreglo[j];
                    arreglo[j]= arreglo[j+1];
                    arreglo[j+1]=temporal;
                }
                pasadas ++;
            }
        }
        System.out.println("termino: "+ pasadas);
    }
    public void quick (int[] arreglo, int primero, int ultimo ){
        int i,j, pivote, aux;
        i = primero;
        j = ultimo;
        pivote = arreglo[(primero+ultimo)/2];
        System.out.println("EL PIVORTE ES: " + pivote);
        do
        { while(arreglo[i]<pivote){
            i++;
        }
        while (arreglo[j]>pivote){
            j--;
        }
        if(i<=j){
            aux =arreglo[i];
            arreglo[i]=arreglo[j];
            arreglo[j]=aux;
            i++;
            j--;

        }
        }while (i<=j);
        if(primero<j){
            quick(arreglo,primero,j);
        }
        if (i<ultimo){
            quick(arreglo,i,ultimo);
        }
        mostrarArreglo(arreglo);

    }
    private void mostrarArreglo(int[] arreglo) {
        for (int k = 0; k <arreglo.length ; k++) {
            System.out.print("[" + arreglo[k] + "]");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BurbujaQuick ordenar = new BurbujaQuick();
        Random R = new Random();
        int []Arreglo = new int [20];
        for (int i = 0; i <20 ; i++) {
            Arreglo[i]=R.nextInt(99)+1;
        }
        for (int i = 0; i <20 ; i++) {
            System.out.println(Arreglo[i]);
        }

        int opcion = 0;
        do{
            System.out.println("ORGANICE LOS NUMERO ALEATORIOS A SU PREFERENCIA");
            System.out.println(" 1- Algoritmo de Burbuja ");
            System.out.println(" 2- Algoritmo de Quick Sort");
            System.out.println(" 3- Salir del sistema");
            System.out.println(" INREGSE LA OPCION A REALIZAR");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("ARREGLO ORIGINAL");
                    ordenar.mostrarArreglo(Arreglo);
                    System.out.println("ARREGLO ORDENADO CON BURBUJA");
                    ordenar.burbuja1(Arreglo);
                    ordenar.mostrarArreglo(Arreglo);
                    break;
                case 2:
                    System.out.println("ARREGLO ORIGINAL");
                    ordenar.mostrarArreglo(Arreglo);
                    System.out.println("ARREGLO ORDENADO CON QUICK");
                    ordenar.quick(Arreglo,0,Arreglo.length-1);
                    break;
                case 3:
                    System.out.println("*** SALISTES DEL SISTEMA ***");
                    System.exit(0);
                    break;
                default:
                    System.out.println("LA OPCION NO ESTA DISPONIBLE INGRESE OTRA OPCION");
            }
        }while (opcion !=4);
    }

}
