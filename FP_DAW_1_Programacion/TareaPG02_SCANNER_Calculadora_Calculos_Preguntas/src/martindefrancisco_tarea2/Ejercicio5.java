/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martindefrancisco_tarea2;

/**
 * UD02 CREACION DE MI PRIMER PROGRAMA
 * EJERCICIO 5: INTERCAMBIO DE NUMEROS 
 * @author Luis Martín de Francisco Blanco
 */

// método de la clase util Scanner para introducir datos
import java.util.Scanner; 

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Introducimos los datos
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce valor de a: ");
        int primerNumero = input.nextInt();
        System.out.print("Introduce el valor de b: ");
        int segundoNumero = input.nextInt();
        
        // Presentación de los números
        System.out.println("Ahora a vale: " + primerNumero);
        System.out.println("Ahora b vale: " + segundoNumero);
        System.out.println("Intercambiamos valores");
        
         // Realizamos el intercambio de valor mediante una tercera variable
         int numeroTemporal = primerNumero;
         primerNumero = segundoNumero;
         segundoNumero = numeroTemporal;
        
         // Volvemos a presentar los nuevos numeros intercambiados
        System.out.println("Ahora a vale: " + primerNumero);
        System.out.println("Ahora b vale: " + segundoNumero);
    }
    
}
