public class Ejercicio7 {
    public static void main(String[] args) {
            /*7.- Repite el ejercicio anterior pero realiza la iteración e impresión de los elementos del array a través de un bucel for mejorado. */
            String [] personas = new String[5];
            personas[0] = "Juan";
            personas[1] = "Pepe";
            personas[2] = "Manuel";
            personas[3] = "Lucas";
            personas[4] = "Rodolfo";
        for(String persona: personas){
            System.out.println(persona);
        }
    }


}
