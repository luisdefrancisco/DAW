package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisco
 * EJERCICIO 5 CON MENOS LINEAS Y UN SOLO BUCLE
 */
public class Ejercicio5C_ARBOLNAVIDAD_v1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int altura = 10; // niveles del arbol de navidad
        String espacio = " ";
        String estrella = "*";
        for (int n = 1; n<=altura; n++){
            System.out.print(espacio.repeat(altura-n)); // Dibujamos espacios en blanco
            System.out.print(estrella.repeat(2*(n)-1)); // Dibujamos estrellas
            System.out.println(""); // Fila en blanco
        }
         // MENSAJE
        System.out.println(""); // Fila en blanco
        System.out.println("  ¡FELIZ NAVIDAD!");
        System.out.println(""); // Fila en blanco
    }       
}
