package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisco
 * Arbol de Navidad EJERCIIO 5B
 */
public class Ejercicio5B_ARBOLNAVIDAD_v1 {

    /**
     * @param args the command line arguments
     */
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
        // TRONCO
        for (int tronco = 1; tronco<5; tronco++){
            for(int s=1; s<altura; s++){
                System.out.print(" ");
            }
            System.out.println("*");
        } 
        
        // MENSAJE ENRIQUECIDO
        for (int i=1; i<(altura*2); i++){
           System.out.print("*"); // Fila superior 
        }
        System.out.println(""); // Salto de linea
        System.out.println("* ¡FELIZ NAVIDAD! *");
        for (int i=1; i<(altura*2); i++){
           System.out.print("*"); // Fila superior 
        }
        System.out.println(""); // Salto de linea
    }
}
