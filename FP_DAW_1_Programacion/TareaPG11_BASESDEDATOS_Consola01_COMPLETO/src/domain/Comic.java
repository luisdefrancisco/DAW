package domain;

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

public class Comic {
    // VARIABLES PARA ALMACENAR LOS CAMPOS DE LA TABLA
    private int numAlbum;
    private String nombAlbum;
    private String protagonistas;
    
    ///////// SOBRECARGA DE CONSTRUCTORES //////////////
    
    public Comic() {
    }

    public Comic(int numAlbum) {
        this.numAlbum = numAlbum;
    }

    public Comic(int numAlbum, String nombAlbum, String protagonistas) {
        this.numAlbum = numAlbum;
        this.nombAlbum = nombAlbum;
        this.protagonistas = protagonistas;
    }
    
     //////////// GETTERS Y SETTERS ////////////////////

    public int getNumAlbum() {
        return numAlbum;
    }

    public void setNumAlbum(int numAlbum) {
        this.numAlbum = numAlbum;
    }

    public String getNombAlbum() {
        return nombAlbum;
    }

    public void setNombAlbum(String nombAlbum) {
        this.nombAlbum = nombAlbum;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }
    
    /////////////// METODO TOSTRING //////////////

    @Override
    public String toString() {
        return "numero del Comic = " + numAlbum + ", nombre del Comic = " + nombAlbum + ", Protagonistas = " + protagonistas;
    }
      
}
    

