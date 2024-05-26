package test;

import datos.CancionesDAO;
import domain.Cancion;
import java.util.List;

/**
 * @author Luis Martin de Francisco CLASE PRINCIPAL Como puede verse, no creamos
 * La BBDD se llama "eurovision" creada antes en mySQL
 "Conexion" es la clase encargada de manejar la conexión y cerrarla
 "Cancion" es la TABLA de la base de datos
 "CancionesDAO" es el MANEJADOR de los métodos importantes como insertar, Select, etc.
 "TestEurovision" es el MAIN
 
 Clase Cancion que representa los datos de cada registro con su constructor
  
 IMPORTANTE:
 0.- Antes tenemos que crear la base de datos en mySql. 
    Además pordemos o bien desde mySql crear la tabla con sus tipos de datos
    ó con un método crearla desde Java y resetearla
 1.- Creamos la clase Conexion
 2.- Creamos la clase Cancion (tabla de la BBDD)
 3.- Creamos la clase CancionesDAO (manejo de los datos con sus métodos y Queries)
 4.- Creamos la clase MAIN TestManejoPersonas
 */
public class TestEurovision {

    public static void main(String[] args) {

        // PARTE PARA PROBAR SELECT E IMPRIMIRLO
        CancionesDAO cancionDao = new CancionesDAO();
        // Traigo la lista por medio del método seleccionar de CancionesDAO,
        // Pero tengo que meterlo en otra lista de esta clase, para luego
        // Imprimirla y recorrerla
        
        cancionDao.resetearTabla();
        
        // INSERTAMOS OBJETOS CANCIONES
        Cancion cancion1 = new Cancion(1, "My Lovely Song", "Eva Singer", 2020, 4.5);
        Cancion cancion2 = new Cancion(2, "Lost in Melody", "The Harmonizers", 2018, 3.8);
        Cancion cancion3 = new Cancion(3, "Dancing in the rain", "Rainbow Band", 2017, 2.1);
        Cancion cancion4 = new Cancion(4, "Broken Dreams", "Melancholy Trio", 2019, 2.5);
        Cancion cancion5 = new Cancion(5, "Forgotten Melodies", "Echoes", 2016, 1.9);
        // Utilizaremos el objeto personaDao que ya hemos utilizado antes
        cancionDao.insertar(cancion1);
        cancionDao.insertar(cancion2);
        cancionDao.insertar(cancion3);
        cancionDao.insertar(cancion4);
        cancionDao.insertar(cancion5);
        // Imprimimos el listado de canciones
        List<Cancion> canciones = cancionDao.seleccionar();
        for (Cancion cancion : canciones) {
            System.out.println("cancion = " + cancion);
        }
        
        System.out.println("---------------------------");
        cancionDao.ordenarListaDescendente();

        }
     }

