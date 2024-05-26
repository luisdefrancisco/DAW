package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisco
 * Arbol de Navidad EJERCIIO 5A
 */
public class Ejercicio5_ARBOLNAVIDAD_v1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int altura = 10; // niveles del arbol de navidad
        
        // COPA DEL ARBOL
        for (int n = 1; n<=altura; n++){
            // Dibujamos espacios en blanco
            for (int i = 1; i<(altura-n+1); i++){
                System.out.print(" ");
            }
            // Dibujamos estrellas
            for (int j = 1; j<(2*(n)); j++){
                System.out.print("*");
            }
            System.out.println("");
        }   
        
         // MENSAJE
        System.out.println(""); // Fila en blanco
        System.out.println("  ¡FELIZ NAVIDAD!");
        System.out.println(""); // Fila en blanco    
    }
}
