
package datos;

/**
 * @author Luis Martin de Francisco
 * 
 * CLASE Conexion PARA ESTABLECER LA CONEXION Y CERRAR
 * Consta de tres constantes URL, USER y PASSWORD que se utilziarán para abrir y 
 * cerrar las conexiones
 * 
 * IMPORTANTE:
 * 1.- Creamos la clase Conexion
 * 2.- Creamos la clase Album (tabla de la BBDD)
 * 3.- Creamos la clase AlbumDAO (manejo de los datos)
 * 4.- Creamos la clase MAIN 
 * 
 */
import java.sql.*;

public class Conexion {
    
    // VARIABLES IMPORTANTES
    private static final String JDBC_URL = "jdbc:mysql://localhost/magos_del_humor" // CUIDADO CON EL NOMBRE DE LA BBDD
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
