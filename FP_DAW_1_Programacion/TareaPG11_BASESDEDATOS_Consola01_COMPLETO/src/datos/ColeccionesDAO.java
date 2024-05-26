package datos;

//import static datos.Conexion.*;
import domain.Comic;
import java.util.*;
import java.sql.*;

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
 
 CLASE DAO de la entidad ColeccionesDAO-> Data Access Object
 Es la clase encargada de Manejar los datos de la tabla Comic
 Podremos recuperar los datos, insertar, etc.
 Creamos varios métodos con sus Queries y con las instancias de conexiones
 */


//############################################ PARA EL EXAMEN #######################################
//##    tenemos que comentar Class.forName("com.mysqul.cj.jdbc.Driver"); En realidad no lo tenemos ##
//##    JDBC_URL = "jdbc:mysql://192.168.54.104/XXXXXXXXX(nombre BBDD)                             ##
//##    JDBC_USER = "root"                                                                         ##
//##    JDBC_PASSWORD = "1234"                                                                     ##
//###################################################################################################

public class ColeccionesDAO {

    // VARIABLE DEL QUERY SELECT //
    private static final String SQL_SELECT = "SELECT numAlbum, nombAlbum, protagonistas FROM tablaAlbumes";
    
    // QUERY INSERTAR //
    private static final String SQL_INSERT = "INSERT INTO tablaAlbumes(numAlbum, nombAlbum, protagonistas) VALUES(?, ?, ?)";
    
    // VARIABLE QUERY ORDENAR //
    private static final String SQL_ORDENAR = "SELECT * FROM tablaAlbumes ORDER BY protagonistas ASC LIMIT 3";
    
    // VARIABLE QUERY UPDATE
    private static final String SQL_UPDATE = "UPDATE tablaAlbumes SET nombAlbum=?, protagonistas=? WHERE numAlbum = ?";
    
    // VARIABLE QUERY DELETE
    private static final String SQL_DELETE = "DELETE FROM tablaAlbumes WHERE numAlbum = ?";

    
    
    
    //############################################## RESETEO DE LA TABLA ##################################################
    public void resetearTabla(){
         // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        Statement stmt = null;
                
        try {
            // Borramos la base de datos existente para comenzar de cero sin errores
            conn = Conexion.getConnection();
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate("DROP DATABASE magos_del_humorv2");
            // Creamos la nueva base de datos
            stmt.executeUpdate("CREATE DATABASE magos_del_humorv2");
            // Usamos la base de datos
            stmt.executeUpdate("USE magos_del_humorv2");
            // Creamos una tabla con sus columnas declaradas y su PRIMARY KEY
            stmt.executeUpdate("CREATE TABLE tablaAlbumes(numAlbum INT, nombAlbum VARCHAR(50), protagonistas VARCHAR(25), PRIMARY KEY(numAlbum))"); 
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }
    
        
    //################################# METODO INSERTAR #######################################
    // Va a retornar un número, y recibe un objeto de tipo Comic que es el que
    // Insertaremos.
    // IMPORTANTE: el SQL_INSERT hay que cambiarlo respecto al SELECT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Comic, hay que utilizar sus métodos getNombre, etc.
    
    public int insertar(Comic comic){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            // Como tenemos (?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setInt(1, comic.getNumAlbum());
            stmt.setString(2, comic.getNombAlbum());
            stmt.setString(3, comic.getProtagonistas());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros; // DEVUELVE EL NÚMERO DE REGISTROS INSERTADOS QUE EN NUESTRO CASO SERÁ 1
                
    }
    
    
    
    //################################## METODO SELECCIONAR ########################################
    
    public List<Comic> seleccionar() { // RETORNARÁ UN TIPO ARRAYLIST poblado de objetos Comic
        // Inicializamos la variables conn, stmt, rs y persona puesto que son objetos
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Comic comic = null;
        // Parte especial en la que creamos un ArrayList para almacenar objetos Comic
        List<Comic> listaComics = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int numAlbum = rs.getInt("numAlbum");
                String nombAlbum = rs.getString("nombAlbum");
                String protagonistas = rs.getString("protagonistas");
                // Creamos objeto Comic con cada pasada de registro y lo añadimos al ArrayList listaColecciones
                comic = new Comic(numAlbum, nombAlbum, protagonistas);
                listaComics.add(comic);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            
            // PARTE EN LA QUE CERRAMOS LAS CONEXIONES
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return listaComics;
    }
    
    
    

     //############################# METODO ORDENAR ####################################//
    // Dependiendo del Query se ordenará de una manera u otra
    
    public void ordenarListaAscendente(){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
                
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_ORDENAR);
            //registros = stmt.executeUpdate();
             // Ejecutar la consulta y obtener los resultados
            ResultSet resultados = stmt.executeQuery();
            // Mostrar los resultados ordenados
            while (resultados.next()) {
                int numAlbum = resultados.getInt("numAlbum");
                String nombAlbum = resultados.getString("nombAlbum");
                String protagonistas = resultados.getString("protagonistas");
                // Imprimimos el resultado
                System.out.println("Numero del Comic: " + numAlbum + ", Nombre del Comic: " + nombAlbum + ", Protagonistas: " + protagonistas);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        //return registros; // DEVUELVE EL NÚMERO DE REGISTROS INSERTADOS QUE EN NUESTRO CASO SERÁ 1
                
    }
    
    
    
    
    //####################################### METODO ACTUALIZAR ###################################
    // Va a retornar un número, y recibe un objeto de tipo Comic que es el que
    // cambiaremos. Recibe el indice numAlbum que queramos cambiar
    // IMPORTANTE: el SQL_UPDATE hay que cambiarlo respecto al INSERT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Comic, hay que utilizar sus métodos getNombre, etc.
    
    public int actualizar(Comic comic){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            // Como tenemos (?,?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setString(1, comic.getNombAlbum());
            stmt.setString(2, comic.getProtagonistas());
            stmt.setInt(3, comic.getNumAlbum());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros; // DEVUELVE EL NÚMERO DE REGISTROS INSERTADOS QUE EN NUESTRO CASO SERÁ 1
                
    }
    
    
    
    //################################## METODO ELIMINAR DELETE ########################################
    // Va a retornar un número, y recibe un objeto de tipo Comic que es el que
    // eliminaremos.
    // IMPORTANTE: el SQL_DELETE solo recibirá el id_persona
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Comic, hay que utilizar sus métodos getNombre, etc.
    
    public int eliminar(Comic comic){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            // Como tenemos (?) hay que poblar esos datos con lo siguiente
            stmt.setInt(1, comic.getNumAlbum());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros; // DEVUELVE EL NÚMERO DE REGISTROS Eliminados QUE EN NUESTRO CASO SERÁ 1
                
    }
    
    
}
