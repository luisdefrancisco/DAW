
package datos;

/**
 * @author Luis Martin de Francisco
 * La BBDD se llama "eurovision" creada antes en mySQL
 * "Conexion" es la clase encargada de manejar la conexión y cerrarla
 * "Canciones" es la TABLA de la base de datos
 * "CancionesDAO" es el MANEJADOR de los métodos importantes como insertar, Select, etc.
 * "TestEurovision" es el MAIN
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
    Además pordemos o bien desde mySql crear la tabla con sus tipos de datos
    ó con un método crearla desde Java y resetearla
 1.- Creamos la clase Conexion
 2.- Creamos la clase Canciones (tabla de la BBDD)
 3.- Creamos la clase CancionesDAO (manejo de los datos con sus métodos y Queries)
 4.- Creamos la clase MAIN TestManejoPersonas
 */
import java.sql.*;

public class Conexion {
    
    
    //############################################ PARA EL EXAMEN #######################################
    //##    tenemos que comentar Class.forName("com.mysqul.cj.jdbc.Driver"); En realidad no lo tenemos ##
    //##    JDBC_USER = "root"                                                                         ##
    //##    JDBC_PASSWORD = "1234"                                                                     ##
    //###################################################################################################
    
    
    // VARIABLES IMPORTANTES
    private static final String JDBC_URL = "jdbc:mysql://localhost/eurovision" // CUIDADO CON EL NOMBRE DE LA BBDD
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
