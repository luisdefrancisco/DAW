package Clases;

import java.io.*;
import java.util.*;

/**
 * @author Luis Martin de Francisco
 */
public class ManejoArchivo {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo); //CREACION EN MEMORIA
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Hemos creado el archivo " + nombreArchivo);
        } catch (IOException ex) {
            System.out.println("Error en el archivo");
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, LinkedList<Producto> linkedListProductos){
        File archivo = new File(nombreArchivo); //CREACION EN MEMORIA
        try {
            PrintWriter salida = new PrintWriter(archivo);
            for (int i = 0; i < linkedListProductos.size(); i++) {
                salida.println("La categoría del producto es " 
                        + linkedListProductos.get(i).getIdProducto()
                        + " Su título es " 
                        + linkedListProductos.get(i).getTituloProducto());
            }
            salida.close();
            System.out.println("Hemos escrito el contenido en el archivo " + nombreArchivo);
        }catch (IOException ex) {
            System.out.println("Error en el archivo");
        }
    }
    
    
    public static void agregarInformacionAlArchivo(String nombreArchivo, LinkedList<Producto> linkedListProductos){
        var archivo = new File(nombreArchivo); //CREACION EN MEMORIA
        try {
            var salida = new PrintWriter(new FileWriter(archivo, true)); /// CUIDADO COMO CREARLO, true y FILEWRITER
            for (int i = 0; i < linkedListProductos.size(); i++) {
                salida.println("La categoría del producto es " 
                        + linkedListProductos.get(i).getIdProducto()
                        + " Su título es " 
                        + linkedListProductos.get(i).getTituloProducto());
            }
            salida.close();
            System.out.println("Hemos agregado nuevo contenido en el archivo " + nombreArchivo);
        }catch (IOException ex) {
            System.out.println("Error en el archivo");
        }
    }
    
    
    public static void LeerArchivo(String nombreArchivo){
        var archivo = new File(nombreArchivo); //CREACION EN MEMORIA
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
           
        }catch (IOException ex) {
            System.out.println("Error en el archivo");
        }
    }
}
