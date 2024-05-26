/**
 * TAREA 5 DESARROLLO DE CLASES
 * @author Luis Martin de Francisco
 * Programa MAIN CreaComic, Apartados 2, 3 y 4
 */
package main;

import clases.Comic;
import clases.NovelaGrafica;

public class CreaComic {

    public static void main(String[] args) {
        //Apartado 2.- Creacion de Objeto c1 e impresión del título
        Comic c1 = new Comic("Whatchmen", 
                "Alan Moore", 
                "Dave Gibbons", 
                3);
        System.out.println("El Título del cómic es " + c1.getTitulo());
        System.out.println("-------------------------------------------------------------- ");
        
        //Apartado 3.- Creación de la serie Whatchmen
        System.out.println("A partir de ahora listamos todos los números de la maxiserie ");
        Comic maxiserieWatchmen[] = new Comic[12];
        for (int i = 0; i < maxiserieWatchmen.length; i++) {
            maxiserieWatchmen[i] = new Comic("Whatchmen", 
                    "Alan Moore", 
                    "Dave Gibbons", 
                    i+1);
//            System.out.println("El comic " + maxiserieWatchmen[i].getTitulo() + 
//                    " numero " + (i+1) + 
//                    " fue guionizado por " + maxiserieWatchmen[i].getGuionista() +
//                    " y dibujado por " + maxiserieWatchmen[i].getDibujante());
            
        // Saco por pantalla con el método toString de la clase Comic
            System.out.println(maxiserieWatchmen[i]);
        }
        
        //Apartado 4.- Novela Grafica
        NovelaGrafica novela = new NovelaGrafica(56, 
                "Los Campbell: El Oro de San Brandamo", 
                "José Luis Munuera", 
                "Jose Luis Munuera", 
                4);
        System.out.println("==============================================================");
        System.out.println(novela);
        
    }
    
}
