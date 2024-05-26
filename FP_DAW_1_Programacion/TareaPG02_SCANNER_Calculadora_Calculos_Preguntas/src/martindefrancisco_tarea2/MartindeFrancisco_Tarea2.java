/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martindefrancisco_tarea2;


/**
 * UD02 CREACION DE MI PRIMER PROGRAMA
 * EJERCICIO 1: CALCULADORA
 * @author Luia Martín de Francisco Blanco
 */

// método de la clase util Scanner para introducir datos
import java.util.Scanner; 

public class MartindeFrancisco_Tarea2 {

public static void main(String[] args) {
        // Introducimos los datos
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int primerNumero = input.nextInt();
        System.out.print("Introduce el segundo número: ");
        int segundoNumero = input.nextInt();
        
        // Presentación de los números
        System.out.println("x = " + primerNumero);
        System.out.println("y = " + segundoNumero);

        // Calculamos la suma
        int suma = primerNumero + segundoNumero;
        System.out.println("x + y = " + suma);

        // Calculamos la resta
        int resta = primerNumero - segundoNumero;
        System.out.println("x - y = " + resta);

        // Calculamo multiplicación
        int multiplicacion = primerNumero * segundoNumero;
        System.out.println("x * y = " + multiplicacion);

        // Calculamos la división con caso límite
       
        float division = primerNumero / segundoNumero;
        System.out.println("x / y =  " + division);

         // Calculamos el primer número elevado cuadrado utilizando la librería Math
        double cuadrado = Math.pow(primerNumero, 2);
        System.out.println("x^2 = " + cuadrado);

        // Calculamos el primer número elevado al segundo utilizando la librería Math
        double potencia = Math.pow(primerNumero, segundoNumero);
        System.out.println("x^y = " + potencia);

        // Calcula la raíz cuadrada del segundo número
        double raizCuadrada = Math.sqrt(primerNumero);
        System.out.println("Raiz de x = " + raizCuadrada);
    }
}