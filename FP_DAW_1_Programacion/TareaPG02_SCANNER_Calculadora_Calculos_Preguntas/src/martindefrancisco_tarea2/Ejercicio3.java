/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martindefrancisco_tarea2;

/**
 * UD02 CREACION DE MI PRIMER PROGRAMA
 * EJERCICIO 3: MULTIPLO DE 3
 * @author Luis Martín de Francisco Blanco
 */

// método de la clase util Scanner para introducir datos
import java.util.Scanner; 
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducimos los datos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entre 1 y 10: ");
        int numero = input.nextInt();
        
        // Comprobamos si tiene resto en la división de 3
        if (numero%3 == 0){
            System.out.println("Es multiplo de 3");
        }
        else{
            System.out.println("No es multiplo de 3");
        }
    }
    
}
