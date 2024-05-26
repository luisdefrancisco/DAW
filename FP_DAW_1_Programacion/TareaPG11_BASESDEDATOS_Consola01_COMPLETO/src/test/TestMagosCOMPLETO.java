package test;

import datos.ColeccionesDAO;
import domain.Comic;
import java.util.List;

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

public class TestMagosCOMPLETO {

    public static void main(String[] args) {

        // CREAMOS UN OBJETO ColeccionesDAO para poder operar
        ColeccionesDAO coleccionesDao = new ColeccionesDAO();
        // Traigo la lista por medio del método seleccionar de ColeccionesDAO,
        // Pero tengo que meterlo en otra lista de esta clase, para luego
        // Imprimirla y recorrerla
        
        coleccionesDao.resetearTabla();
        
        // INSERTAMOS OBJETOS CANCIONES
        Comic comic1 = new Comic(1, "My Lovely Song", "Eva Singer");
        Comic comic2 = new Comic(2, "Lost in Melody", "The Harmonizers");
        Comic comic3 = new Comic(3, "Dancing in the rain", "Rainbow Band");
        Comic comic4 = new Comic(4, "Broken Dreams", "Melancholy Trio");
        Comic comic5 = new Comic(5, "Forgotten Melodies", "Echoes");
        // Utilizaremos el objeto personaDao que ya hemos utilizado antes
        coleccionesDao.insertar(comic1);
        coleccionesDao.insertar(comic2);
        coleccionesDao.insertar(comic3);
        coleccionesDao.insertar(comic4);
        coleccionesDao.insertar(comic5);
        // Imprimimos el listado de canciones
        List<Comic> colecciones = coleccionesDao.seleccionar();
        for (Comic coleccion : colecciones) {
            System.out.println("coleccion = " + coleccion);
        }
        
        //################### Probando ORDEN Ascendente #############
        System.out.println("-------Ordenando------");
        coleccionesDao.ordenarListaAscendente();

        
        //################### Probando INSERTAR nuevos registros ###############################
        Comic comic6 = new Comic(6, "El caso del bacalao", "Mortadelo y Filemon");
        Comic comic7 = new Comic(22, "Los monstruos", "Mortadelo y Filemon");
        System.out.println("----------------------Insertando-------------------------");
        coleccionesDao.insertar(comic6);
        coleccionesDao.insertar(comic7);
        
        
        
        //################### Probando ACTUALIZAR el numero 1 #################################
        System.out.println("------------------Actualizando registro 1--------------------------");
        coleccionesDao.actualizar(new Comic(1, "Safari callejero", "Mortadelo y Filemon"));
        
        
        
        //################# Probando ELEMINAR registro 2 ######################################
        System.out.println("--------------------Eliminando registro 2---------------------");
        coleccionesDao.eliminar(comic2);
        
        
        //################# Imprimimos el resultado final ######################################
         System.out.println("---------------- Resultado Final --------------------");
        for (Comic coleccion : colecciones) {
            System.out.println(coleccion);
        }
        
        //################### Probando ORDEN Ascendente #############
        System.out.println("----------------------Ordenando de nuevo----------------------");
        coleccionesDao.ordenarListaAscendente();
        
        } // Fin MAIN
     } // Fin Clase TestMagosCOMPLETO

