package Ejercicio2;

/**
 * si se puede haber mas de un main, con sobrecarga de metodos main.
 */
public class VariosMain {
    public static void main(String[] args) {
        main(1);
        main('x');
    }

    public static void main(int i) {
        System.out.println("hola mundo");
    }

    public static void main(char i) {
        System.out.println("hola mundo 2");

    }
}
