import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        /*
         * 4.- Crea un programa en java que pida introducir un número por consola. El
         * programa pedirá siempre un número mientras que éste no sea el 5 y cuando así
         * sea imprimir "Fin del programa" terminando asi dicho programa
         */

         Scanner sc = new Scanner(System.in);

         int numeroPedido = 0;
         while(numeroPedido != 5){
            System.out.println("Introduce un numero distinto de 5");
            numeroPedido = sc.nextInt();
            System.out.println("El número introducido es: " + numeroPedido);
         }
         System.out.println("Fin del programa");
         sc.close();
    }
}
