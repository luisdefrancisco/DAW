
package datos;

/**
 * @author Luis Martin de Francisco
 * BASE DE DATOS: "magos_del_humorv2" creada antes en mySQL
 * CONEXION: "Conexion" es la clase encargada de manejar la conexión y cerrarla
 * TABLA: "tablaAlbumes" es la TABLA de la base de datos
 * MANEJO REGISTROS: "ColeccionesDAO" es el MANEJADOR de los métodos importantes como insertar, Select, etc.
 * CLASE MAIN: "TestMagosCOMPLETO" es el MAIN
 * 
 CONEXION es clase encargada de hacer las conexiones. Hay que tener en cuenta:
 * la URL donde está la BBDD + parámetros + User y Password
 * Creamos un método Connection "getConnection", que implica el Drivermanager
 * HAY QUE IMPORTAR LA LIBRERIA MYSQL-CONNECTOR-JAVA-8.019.jar
 * Hay que incorporar los métodos:
 * - close(ResultSet)
 * - close(Statement)
 * - close(PreparedStatement)
 * - close(Statement)
 * - close(Connection)
 * 
 IMPORTANTE:
 0.- Antes tenemos que crear la base de datos en mySql. 
     Además podemos o bien desde mySql crear la tabla con sus tipos de datos
     ó con un método crearla desde Java y resetearla
 1.- Creamos la clase Conexion
 2.- Creamos la clase Comic (Clase con los datos de la tabla tablaAlbumes)
 3.- Creamos la clase ColeccionesDAO (manejo de los datos con sus métodos y Queries)
 4.- Creamos la clase MAIN TestMagosCOMPLETO
 */

//############################################ PARA EL EXAMEN #######################################
//##    tenemos que comentar Class.forName("com.mysqul.cj.jdbc.Driver"); En realidad no lo tenemos ##
//##    JDBC_URL = "jdbc:mysql://192.168.54.104/XXXXXXXXX(nombre BBDD)                             ##
//##    JDBC_USER = "root"                                                                         ##
//##    JDBC_PASSWORD = "1234"                                                                     ##
//###################################################################################################

import java.sql.*;

public class Conexion {
    
    
    //############################################ PARA EL EXAMEN #######################################
    //##    tenemos que comentar Class.forName("com.mysqul.cj.jdbc.Driver"); En realidad no lo tenemos ##
    //##    JDBC_URL = "jdbc:mysql://192.168.54.104/XXXXXXXXX(nombre BBDD)                             ##
    //##    JDBC_USER = "root"                                                                         ##
    //##    JDBC_PASSWORD = "1234"                                                                     ##
    //###################################################################################################
    
    
    // VARIABLES IMPORTANTES
    private static final String JDBC_URL = "jdbc:mysql://localhost/magos_del_humorv2" // CAMBIAR EL NOMBRE DE LA BBDD
                + "?useSSL=false&useTimezone=true"
                + "&serverTimezone=UTC"
                + "&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root"; // CAMBIAR
    private static final String JDBC_PASSWORD = ""; // CAMBIAR
    
    // METODO CONEXION
    public static Connection getConnection() throws SQLException{
       return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
       }
    
    // METODOS SOBRECARGADOS PARA CERRAR LA CONEXION
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(Statement smtm) throws SQLException{
        smtm.close();
    } 
            //Un mejor Statement es PreparedStatement
    public static void close(PreparedStatement smtm) throws SQLException{
        smtm.close();
    } 
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
