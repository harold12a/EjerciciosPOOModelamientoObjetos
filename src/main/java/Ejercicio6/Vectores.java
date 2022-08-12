package Ejercicio6;

import java.util.Scanner;
import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        metodo();
    }
    public static Scanner scanner = new Scanner(System.in);
    private static void metodo(){
            Vector vector = new Vector();
            boolean noRepetir = true;
            System.out.println("ingrese numeros");
            while (noRepetir){
                int numero = scanner.nextInt();
                if(vector.contains(numero)){
                    noRepetir = false;
                }else{
                    vector.add(numero);
                }
            }
            System.out.println(vector);

        }
    }

