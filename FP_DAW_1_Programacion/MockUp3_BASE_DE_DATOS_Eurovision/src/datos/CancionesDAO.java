package datos;

//import static datos.Conexion.*;
import domain.Cancion;
import java.util.*;
import java.sql.*;

/**
 * @author Luis Martin de Francisco 
 La BBDD se llama "eurovision" creada antes en mySQL
 "Conexion" es la clase encargada de manejar la conexión y cerrarla
 "Cancion" es la TABLA de la base de datos
 "CancionesDAO" es el MANEJADOR de los métodos importantes como insertar, Select, etc.
 "TestEurovision" es el MAIN
 
 CLASE DAO de la entidad Cancion DAO-> Data Access Object
 Es la clase encargada de Manejar los datos de la tabla Cancion
 Podremos recuperar los datos, insertar, etc.
 Creamos varios métodos con sus Queries y con las instancias de conexiones
 - public void resetearTabla()
 - public int insertar(Cancion cancion)
 - public List<Canciones> seleccionar() IMPORTANTE VER QUE SON LIST
 - public void ordenarListaDescendente()
  
 IMPORTANTE:
 0.- Antes tenemos que crear la base de datos en mySql. 
    Además pordemos o bien desde mySql crear la tabla con sus tipos de datos
    ó con un método crearla desde Java y resetearla
 1.- Creamos la clase Conexion
 2.- Creamos la clase Cancion (tabla de la BBDD)
 3.- Creamos la clase CancionesDAO (manejo de los datos con sus métodos y Queries)
 4.- Creamos la clase MAIN TestManejoPersonas
 */
public class CancionesDAO {


    // QUERY INSERTAR //
    private static final String SQL_INSERT = "INSERT INTO Canciones(idCancion, titulo, artista, anio, puntuacion) VALUES(?, ?, ?, ?, ?)";
    // VARIABLE DEL QUERY SELECT //
    private static final String SQL_SELECT = "SELECT idCancion, titulo, artista, anio, puntuacion FROM Canciones";
    // VARIABLE QUERY ORDENAR //
    private static final String SQL_ORDENAR = "SELECT * FROM Canciones ORDER BY puntuacion ASC LIMIT 3";
    
    //private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona = ?";
    //private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public void resetearTabla(){
         // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        Statement stmt = null;
        //int registros = 0;
        
        try {
            // Borramos la base de datos existente para comenzar de cero sin errores
            conn = Conexion.getConnection();
            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.executeUpdate("DROP DATABASE eurovision");
            // Creamos la nueva base de datos
            stmt.executeUpdate("CREATE DATABASE eurovision");
            // Usamos la base de datos
            stmt.executeUpdate("USE eurovision");
            // Creamos una tabla con sus columnas declaradas y su PRIMARY KEY
            stmt.executeUpdate("CREATE TABLE Canciones(idCancion INT, titulo VARCHAR(50), artista VARCHAR(25), anio INT, puntuacion DOUBLE, PRIMARY KEY(idCancion))"); 
            
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
    
    
        
        //////////// METODO INSERTAR ////////////////
    // Va a retornar un número, y recibe un objeto de tipo Cancion que es el que
    // Insertaremos.
    // IMPORTANTE: el SQL_INSERT hay que cambiarlo respecto al SELECT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Cancion, hay que utilizar sus métodos getNombre, etc.
    
    public int insertar(Cancion cancion){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            // Como tenemos (?,?,?,?,?) hay que poblar esos datos con lo siguiente
            stmt.setInt(1, cancion.getIdCancion());
            stmt.setString(2, cancion.getTitulo());
            stmt.setString(3, cancion.getArtista());
            stmt.setInt(4, cancion.getAnio());
            stmt.setDouble(5, cancion.getPuntuacion());
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
    
    
    /// METODO SELECCIONAR ///
    public List<Cancion> seleccionar() { // RETORNARÁ UN TIPO ARRAYLIST poblado de objetos Cancion
        // Inicializamos la variables conn, stmt, rs y persona puesto que son objetos
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cancion cancion = null;
        // Parte especial en la que creamos un ArrayList para almacenar objetos Cancion
        List<Cancion> listaCanciones = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCancion = rs.getInt("idCancion");
                String titulo = rs.getString("titulo");
                String artista = rs.getString("artista");
                int anio = rs.getInt("anio");
                double puntuacion = rs.getDouble("puntuacion");
                // Creamos objeto Cancion con cada pasada de registro y lo añadimos al ArrayList personas
                cancion = new Cancion(idCancion, titulo, artista, anio, puntuacion);
                listaCanciones.add(cancion);
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
        return listaCanciones;
    }
    

        //////////// METODO ORDENAR ////////////////
    // Va a retornar un número, y recibe un objeto de tipo Cancion que es el que
    // Insertaremos.
    // Como recibimos un objeto Cancion, hay que utilizar sus métodos getNombre, etc.
    
    public void ordenarListaDescendente(){
        
        // De nuevo creamos una conexion y un Statement
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //int registros = 0;
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_ORDENAR);
            //registros = stmt.executeUpdate();
             // Ejecutar la consulta y obtener los resultados
            ResultSet resultados = stmt.executeQuery();
            // Mostrar los resultados ordenados
            while (resultados.next()) {
                int idCancion = resultados.getInt("idCancion");
                String titulo = resultados.getString("titulo");
                String artista = resultados.getString("artista");
                int anio = resultados.getInt("anio");
                double puntuacion = resultados.getDouble("puntuacion");

                System.out.println("IdCancion: " + idCancion + ", Titulo: " + titulo + ", Artista: " + artista + ", año: " + anio + ", puntuacion: " + puntuacion);
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
    //////////// METODO ACTUALIZAR ////////////////
    // Va a retornar un número, y recibe un objeto de tipo Cancion que es el que
    // Insertaremos.
    // IMPORTANTE: el SQL_UPDATE hay que cambiarlo respecto al INSERT
    // La forma de poblar es mediante el relleno de los ?
    // Como recibimos un objeto Cancion, hay que utilizar sus métodos getNombre, etc.
    
//    public int actualizar(Cancion persona){
//        
//        // De nuevo creamos una conexion y un Statement
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int registros = 0;
//        
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_UPDATE);
//            // Como tenemos (?,?,?,?) hay que poblar esos datos con lo siguiente
//            stmt.setString(1, persona.getTitulo());
//            stmt.setString(2, persona.getArtista());
//            stmt.setString(3, persona.getAnio());
//            stmt.setString(4, persona.getTelefono());
//            stmt.setInt(5, persona.getIdCancion());
//            registros = stmt.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//        finally{
//            try {
//                Conexion.close(stmt);
//                Conexion.close(conn);
//            } catch (SQLException ex) {
//                ex.printStackTrace(System.out);
//            }
//            
//        }
//        return registros; // DEVUELVE EL NÚMERO DE REGISTROS INSERTADOS QUE EN NUESTRO CASO SERÁ 1
//                
//    }
//    
//    
//    
//    //////////// METODO ELIMINAR DELETE ////////////////
//    // Va a retornar un número, y recibe un objeto de tipo Cancion que es el que
//    // eliminaremos.
//    // IMPORTANTE: el SQL_DELETE solo recibirá el id_persona
//    // La forma de poblar es mediante el relleno de los ?
//    // Como recibimos un objeto Cancion, hay que utilizar sus métodos getNombre, etc.
//    
//    public int eliminar(Cancion persona){
//        
//        // De nuevo creamos una conexion y un Statement
//        Connection conn = null;
//        PreparedStatement stmt = null;
//        int registros = 0;
//        
//        try {
//            conn = Conexion.getConnection();
//            stmt = conn.prepareStatement(SQL_DELETE);
//            // Como tenemos (?,?,?,?) hay que poblar esos datos con lo siguiente
//            stmt.setInt(1, persona.getIdCancion());
//            registros = stmt.executeUpdate();
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//        }
//        finally{
//            try {
//                Conexion.close(stmt);
//                Conexion.close(conn);
//            } catch (SQLException ex) {
//                ex.printStackTrace(System.out);
//            }
//            
//        }
//        return registros; // DEVUELVE EL NÚMERO DE REGISTROS Eliminados QUE EN NUESTRO CASO SERÁ 1
//                
//    }
    
    
}
