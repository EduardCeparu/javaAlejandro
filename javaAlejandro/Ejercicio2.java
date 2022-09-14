import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*
         * 2.- Crea una etructura condicional que evalúe si una edad introducida por
         * consola es mayor o igual a 18, si es así, imprimir por la consola:
         * "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int años = sc.nextInt();
        int mayorEdad = 18;

        if (años >= mayorEdad) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}
