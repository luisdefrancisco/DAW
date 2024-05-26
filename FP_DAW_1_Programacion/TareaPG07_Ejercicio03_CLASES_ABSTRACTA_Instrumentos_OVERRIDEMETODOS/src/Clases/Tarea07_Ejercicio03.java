
package Clases;

import java.util.Random;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Tarea07_Ejercicio03 {

    public static void main(String[] args) {
        
    // PARTE 01 del ejercicio 03    
        Cuerda cuerda1 = new Cuerda();
        Percusion percusion1 = new Percusion();
        Viento viento1 = new Viento();
                
        cuerda1.tocar();
        cuerda1.tocar("DO");
        cuerda1.afinar();
        System.out.println("----------------------------------------------");
        percusion1.tocar();
        percusion1.tocar("Redoble");
        percusion1.afinar();
        System.out.println("----------------------------------------------");
        viento1.tocar();
        viento1.tocar("RE");
        viento1.afinar();
        System.out.println("----------------------------------------------");
        
    // PARTE 02 del ejercicio 03 ARRAY RANDOM
        Random numeroRandom = new Random(); //Creamos objeto Random 
        Instrumento[] listaInstrumentos = new Instrumento[10]; //Lista sin poblar de instrumentos
        
        // Vamos a poblar el array de 10 instrumentos con un for y 3 casos diferentes
        for (int i=0; i<listaInstrumentos.length; i++){
            int numeroAleatorio = numeroRandom.nextInt(3);
            switch (numeroAleatorio) { // Para la base de Instrumentos
                case 0:
                    listaInstrumentos[i] = new Cuerda();
                    break;
                case 1:
                    listaInstrumentos[i] = new Percusion();
                    break;
                case 2:
                    listaInstrumentos[i] = new Viento();
                    break;
            }
        }
        
        for (int i=0; i<listaInstrumentos.length; i++){
            listaInstrumentos[i].tocar();
            listaInstrumentos[i].tocar("DO-RE-MI");
            listaInstrumentos[i].afinar();
        }
    }
}
