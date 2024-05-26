package Logica;

/*
 * @author Luis Martin de Francisco
 * Programa de prueba para conexión a una base de datos MySQL
 *
 * Se utiliza una clase constructora de la Base de Datos magos_del_humor ConstructorBaseMagos.java
 * Se crea un JFrame para interacturar con la BBDD. Para ello se crea un Buscador por el número
 * del album. Desplegará el título y los protagonistas.
 * En esta clase Main, se instancia el Constructor de la BBDD y se arranca el JFrame
 *
 * Presupone que el servidor de base de datos está arrancado (se usa XAMPP), disponible,
 * en el puerto por defecto 80, 443 y MySQL en 3306
 * El usuario y el password de conexión con la base de datos debe cambiarse por el 
 * adecuado a nuestras necesidades
 *
 * En el ConstructorBaseMagos.java ---->
 *    - Al añadir el código que borra la base de datos, hace que no sea necesario haber definido
 *      previamente la estructura de la misma, puesto que todo el control del programa está ahora
 *      en el lado del lenguaje anfitrión. Sin embargo, sí es necesario que haya sido definida para 
 *      que no nos dé problemas la primera vez puesto que no hay nada que borrar.
      - Se le añaden directamente 5 entradas para que puedan ser consultadas
 * 
 * Creamos una base de datos "magos_del_humor" tiene  una tabla de "albumes" con tres campos, 
 * de esta manera:
 *      numAlbum (INT 11 PK) ->(numero del album) 
 *      nombAlbum (VARCHAR 50 NULL)
 *      protagonistas (VARCHAR 25 NULL)
 * 
 * MIS APUNTES:
 * - tenemos que arrancar XAMPP
 * - Incorporar la Librería mysql-connector-java-8.0.19.jar
 * - importar todo lo de abajo 
 * - mucho cuidado con los nombres y demás
 */

import GUI.JFBusqueda;
import Presistencia.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Clse de prueba de conexión con una base de datos MySQL
 */
public class MagosDel_Humor {
    
    @SuppressWarnings("ResultOfObjectAllocationIgnored")
    public static void main(String[] args) {
        try {
            new ConstructorBaseMagos(); // Creamos una instancia de la prueba
            // NOS OBLIGA A IR ENTRE try-catch
        } catch (SQLException ex) {
            Logger.getLogger(MagosDel_Humor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JFBusqueda ventana = new JFBusqueda(); //Nuevo objeto ventana
        ventana.setVisible(true); //Que sea visible
        ventana.setLocationRelativeTo(null); // Para que aparezca en el centro
    }
    
}
