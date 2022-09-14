import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
         
        /*
         * 3.- Crea un programa en java que pida dos datos por la consola al usuario:
         * nombre e email. Imprime el valor de estás variables por consola.
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre");
        String name = sc.nextLine();

        System.out.println("Introduce tu email");
        String email = sc.nextLine();

        System.out.println("El nombre es: " + name + ". El email es: " + email);
        sc.close();
    }
}
