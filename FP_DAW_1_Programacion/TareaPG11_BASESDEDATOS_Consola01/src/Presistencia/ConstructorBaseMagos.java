package Presistencia;

/*
 * @author Luis Martin de Francisco
 * Programa de prueba para conexión a una base de datos MySQL
 *
 * Se utiliza una clase constructora de la Base de Datos magos_del_humor ConstructorBaseMagos.java
 * En esta clase Main, se instancia el Constructor de la BBDD 
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConstructorBaseMagos {

    ////// CONSTRUCTOR  //////
    public ConstructorBaseMagos() throws SQLException{
        
        // Hay que meterlo en un try por posibles errores de MySQL
        try
        { // Registramos el Driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception ex){
            // Manejamos el error
            System.out.println(ex.getMessage());
        }
        // CREAMOS UNA CONEXIÓN que luego cerraremos con la base de datos
        // Cuidado con el user y el password
        Connection conexion = DriverManager.getConnection(
        "jdbc:mysql://localhost/magos_del_humor", "root", "");
        
        // Creamos un Statement, para realizar la consulta declarando que pueda actualizarse
        // LOS STATEMENTS SON PARA ACTUAR SOBRE LA BASE DE DATOS
        Statement s=conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        // Borramos la base de datos existente para comenzar de cero sin errores
        s.executeUpdate("DROP DATABASE magos_del_humor");
        // Creamos la nueva base de datos
        s.executeUpdate("CREATE DATABASE magos_del_humor");
        // Usamos la base de datos
        s.executeUpdate("USE magos_del_humor");
        // Creamos una tabla con sus columnas declaradas y su PRIMARY KEY
        s.executeUpdate("CREATE TABLE albumes(numAlbum INT, nombAlbum VARCHAR(50), protagonistas VARCHAR(25), PRIMARY KEY(numAlbum))");
        
        // Introducimos registros con sus valores en todas las columnas
        s.executeUpdate("INSERT INTO albumes " + "VALUES(3,'Safari Callejero','Mortadelo y Filemón')");
        s.executeUpdate("INSERT INTO albumes " + "VALUES(6,'El caso del Bacalao','Mortadelo y Filemón')");
        s.executeUpdate("INSERT INTO albumes " + "VALUES(22,'Los Monstruos','Mortadelo y Filemón')");
        s.executeUpdate("INSERT INTO albumes " + "VALUES(92,'El Estrellato','Mortadelo y Filemón')");
        s.executeUpdate("INSERT INTO albumes " + "VALUES(101,'Las Montañas Voladoras','Superlópez')");
        
        // Ahora haremos una consulta (Query) para ver que es lo que tiene
        ResultSet rs=s.executeQuery("SELECT * FROM albumes");
        // Mientras haya registros SACAMOS POR CONSOLA
        while(rs.next()){
            System.out.println(rs.getInt("numAlbum") + " " + rs.getString(2) + " " + rs.getString(3));
            }
                
        // IMPORTANTE Cerramos la conexión
        conexion.close();
        
        
    }
    
}
