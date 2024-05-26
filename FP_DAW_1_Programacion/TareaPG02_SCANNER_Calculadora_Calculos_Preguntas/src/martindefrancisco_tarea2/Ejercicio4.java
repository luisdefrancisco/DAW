/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martindefrancisco_tarea2;

/**
 * UD02 CREACION DE MI PRIMER PROGRAMA
 * EJERCICIO 4: JASP
 * @author Luis Martín de Francisco Blanco
 */

// método de la clase util Scanner para introducir datos
import java.util.Scanner; 

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Introducimos los datos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce la edad del sujeto: ");
        int edad = input.nextInt();
        System.out.println("Introduce el nivel de estudios del sujeto (de 1 a 5): ");
        int nivelDeEstudios = input.nextInt();
        System.out.println("Introduce el salario del sujeto: ");
        int salario = input.nextInt();
        System.out.println("¿Está sobradamente preparado?");
        var jasp = "FALSO";
        // Calculamos la variable jasp
        if (edad<=28 && nivelDeEstudios>3 && salario>28000){
            jasp = "VERDADERO";
        }
        System.out.println(jasp);
    }
    
}
