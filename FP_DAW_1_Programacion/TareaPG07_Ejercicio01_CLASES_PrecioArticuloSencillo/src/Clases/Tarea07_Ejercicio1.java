
package Clases;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Tarea07_Ejercicio1 {

    public static void main(String[] args) {
        Articulo articuloVacio = new Articulo();
        Articulo articuloPrecio = new Articulo();
        Articulo articuloCostoPorcentaje = new Articulo();
        
        articuloVacio.setPrecio();
        articuloPrecio.setPrecio(25);
        articuloCostoPorcentaje.setPrecio(30, 15);
             
        System.out.println("articuloVacio = " + articuloVacio.getPrecio());
        System.out.println("articuloPrecio = " + articuloPrecio.getPrecio());
        System.out.println("articuloCostoPorcentaje = " + articuloCostoPorcentaje.getPrecio());
      
    }   
}
