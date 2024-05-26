package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisc UD04 EJERCICIO 2
 */
import java.util.Scanner;

public class Ejercicio2_ARRAY_IFTHEN {

    public static void main(String[] args) {
        // Inicializamos los arrays para las respuestas y el resultado del quiz
        String[] respuestasCorrectasCortas = {"v", "f", "v", "f"};
        String[] respuestasCorrectasLargas = {"verdadero", "falso", "verdadero", "falso"};
        
// Inicializamos el resultado como si fuera todo correcto para luego cambiarlo
        boolean[] resultado = {false, false, false, false};

        // Introducimos las respuestas y almacenamos en cada una de las posiciones
        Scanner input = new Scanner(System.in);

        // Primera pregunta y su comparación
        System.out.println("Una variables es un espacio de almacenamiento "
                + "en memoria, cuyo contenido puede cambiar a lo largo de "
                + "la ejecución del programa (V/F) ");
        String surespuesta  = input.nextLine();
        surespuesta = surespuesta.toLowerCase();
        // Comparamos las respuestas y cambiamos el resultado si es necesario
        if((surespuesta.equals(respuestasCorrectasCortas[0]))||(surespuesta.equals(respuestasCorrectasLargas[0]))){
            resultado[0] = true;
        }
        
        // Segunda pregunta y su comparación
        System.out.println("Una estructura iterativa es aquella que nos "
                + "permite elegir entre dos o mas opciones (V/F) ");
        surespuesta  = input.nextLine();
        surespuesta = surespuesta.toLowerCase();
        // Comparamos las respuestas y cambiamos el resultado si es necesario
        if((surespuesta.equals(respuestasCorrectasCortas[1]))||(surespuesta.equals(respuestasCorrectasLargas[1]))){
            resultado[1] = true;
        }

        // Tercera pregunta y su comparación
        System.out.println("Una estructura selectiva es aquella que nos "
                + "permite elegir entre dos o mas opciones (V/F) ");
        surespuesta  = input.nextLine();
        surespuesta = surespuesta.toLowerCase();
        // Comparamos las respuestas y cambiamos el resultado si es necesario
        if((surespuesta.equals(respuestasCorrectasCortas[2]))||(surespuesta.equals(respuestasCorrectasLargas[2]))){
            resultado[2] = true;
        }

        // Cuarta pregunta y su comparación
        System.out.println("Las estructuras While y Do-While son "
                + "equivalentes (V/F) ");
        surespuesta  = input.nextLine();
        surespuesta = surespuesta.toLowerCase();
        // Comparamos las respuestas y cambiamos el resultado si es necesario
        if((surespuesta.equals(respuestasCorrectasCortas[3]))||(surespuesta.equals(respuestasCorrectasLargas[3]))){
            resultado[3] = true;
        }
        
        // Sacamos el resultado final
        for (int i = 0; i < 4; i++) {
            if(resultado[i]){
                System.out.println("La constestación a la respuesta " + i + " ha sido correcta.");
            } else {
                System.out.println("La constestación a la respuesta " + i + " no ha sido correcta.");
            }
        }
    }

}
