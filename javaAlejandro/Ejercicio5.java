import java.util.Scanner;
import utils.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*
         * 5.- Crea un programa que pida un número por consola entre el 1 y el 50. Si el
         * número está fuera de este rango imprimir "El número no es válido" y seguir
         * pidiendo números hasta que el número esté en ese rango. Si el número es
         * válido crea la lógica para verificar si dicho número es par o impar. Si es
         * par imprimir por consola "Número par" y, si es impar, "Número impar".
         * La lógica para averiguar si el número es par o impar debe de estar fuera del
         * archivo que contiene el método main en una carpeta llamada "utils" y en una
         * clase llamada EjercicioCinco Además esta lógica debe estar ejecutada a través
         * de un método.
         */

        Scanner sc = new Scanner(System.in);

        int numeroPedido = 0;
        do {
            System.out.println("Introduce un numero entre 1 y 50");
            numeroPedido = sc.nextInt();
            if (!(numeroPedido >= 1 && numeroPedido <= 50)) {
                System.out.println("El número no es válido");
            } else {
                EjercicioCinco.esPar(numeroPedido);
            }
        } while (numeroPedido < 1 || numeroPedido > 50);

        sc.close();
    }
}
