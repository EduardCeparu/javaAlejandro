public class Ejercicio6 {
    public static void main(String[] args) {
        /*6.- Crea un array de 5 elementos cuyos valores sean nombres de personas. Imprime los elementos 
del array a través de un bucle for */

        String [] personas = new String[5];
        personas[0] = "Juan";
        personas[1] = "Pepe";
        personas[2] = "Manuel";
        personas[3] = "Lucas";
        personas[4] = "Rodolfo";

        for(int i = 0; i<personas.length; i++){
            System.out.println(personas[i]);
        }

        }
}
