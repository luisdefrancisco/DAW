package datos;

//import static datos.Conexion.*;
import domain.Album;
import java.util.*;
import java.sql.*;

/**
 * @author Luis Martin de Francisco 
 CLASE DAO de la entidad Album DAO-> Data Access Object
 Es la clase encargada de Manejar los datos de la tabla albumes
 Podremos recuperar los datos, insertar, etc.
 IMPORTANTE:
 1.- Creamos la clase Conexion
 2.- Creamos la clase Album (tabla de la BBDD)
 3.- Creamos la clase AlbumDAO (manejo de los datos)
 4.- Creamos la clase MAIN TestManejoPersonas
 */
public class AlbumDAO {

    // VARIABLE DEL QUERY SELECT //
    private static final String SQL_SELECT = "SELECT numAlbum, nombAlbum, protagonistas FROM albumes";
    private static final String SQL_INSERT = "INSERT INTO albumes(numAlbum, nombAlbum, protagonistas) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE albumes SET nombAlbum=?, protagonistas=?, WHERE numAlbum = ?";
    private static final String SQL_DELETE = "DELETE FROM albumes WHERE numAlbum = ?";

    public List<Album> seleccionar() { // RETORNARÁ UN TIPO ARRAYLIST poblado de objetos Album
        // Inicializamos la variables conn, stmt, rs y persona puesto que son objetos
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Album album = null;
        // Parte especial en la que creamos un ArrayList para almacenar objetos Album
        List<Album> albumes = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int numAlbum = rs.getInt("numAlbum");
                String nombAlbum = rs.getString("nombAlbum");
                String protagonistas = rs.getString("protagonistas");
                // Creamos objeto xxxPersona con cada pasada de registro y lo añadimos al ArrayList albumes
                album = new Album(numAlbum, nombAlbum, protagonistas);
                albumes.add(album);
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
        return albumes;
    }
    
    //////////// METODO INSERTAR ////////////////
    // Va a retornar un número, y recibe un objeto de tipo Album que es el que
    // Insertaremos.
    // IMPORTANTE: el SQL_INSERT hay que cambiarlo respecto al SELECT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Album, hay que utilizar sus métodos getNombre, etc.
    
    public int insertar(Album album){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            // Como tenemos (?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setInt(1, album.getIdAlbum());
            stmt.setString(2, album.getTitulo());
            stmt.setString(3, album.getProtagonistas());
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
    
    
    //////////// METODO ACTUALIZAR ////////////////
    // Va a retornar un número, y recibe un objeto de tipo Album que es el que
    // Insertaremos.
    // IMPORTANTE: el SQL_UPDATE hay que cambiarlo respecto al INSERT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Album, hay que utilizar sus métodos getNombre, etc.
    
    public int actualizar(Album album){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            // Como tenemos (?,?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setString(1, album.getTitulo());
            stmt.setString(2, album.getProtagonistas());
            stmt.setInt(3, album.getIdAlbum());
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
    
    
    
    //////////// METODO ELIMINAR DELETE ////////////////
    // Va a retornar un número, y recibe un objeto de tipo xxxPersona que es el que
    // eliminaremos.
    // IMPORTANTE: el SQL_DELETE solo recibirá el id_persona
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto xxxPersona, hay que utilizar sus métodos getNombre, etc.
    
    public int eliminar(Album album){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            // Como tenemos (?,?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setInt(1, album.getIdAlbum());
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
