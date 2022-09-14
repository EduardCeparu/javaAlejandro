package utils;

public class EjercicioCinco {

    public static void esPar(int numero){
        String esPar = "Número par";
        String noEsPar = "Número impar";

        if(numero % 2 == 0){ 
            System.out.println(esPar); 
        }else{
            System.out.println(noEsPar);
        }
    }
}
