/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package martindefrancisco_tarea2;

/**
 * UD02 CREACION DE MI PRIMER PROGRAMA
 * EJERCICIO 2: Numero de 5 cifras
 * @author Luis Martín de Francisco Blanco
 */

// método de la clase util Scanner para introducir datos
import java.util.Scanner; 

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // Introducimos los datos
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 cifras: ");
        int numero = input.nextInt();
       
        // Presentación del numero
        System.out.println("Tu numero es: " + numero);
        
        // Calculos para separar las cifras
        int decenasMillar = numero/10000;
        int millar = (numero-(decenasMillar*10000))/1000;
        int centena = (numero - (decenasMillar*10000)-(millar*1000))/100;
        int decena = (numero - (decenasMillar*10000)-(millar*1000)-(centena*100))/10;
        int unidad = numero - (decenasMillar*10000)-(millar*1000)-(centena*100)-(decena*10);
        
        // Imprimimos por pantalla
        System.out.println("unidades: " + unidad);
        System.out.println("decenas: " + decena);
        System.out.println("centenas: " + centena);
        System.out.println("millares: " + millar);
        System.out.println("decenas de millar: " + decenasMillar);
    }
    
}
