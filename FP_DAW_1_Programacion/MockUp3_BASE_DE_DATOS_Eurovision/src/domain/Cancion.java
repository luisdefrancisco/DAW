package domain;

/**
 * @author Luis Martin de Francisco
 La BBDD se llama "eurovision" creada antes en mySQL
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
public class Cancion {
    // VARIABLES PARA ALMACENAR LOS CAMPOS DE LA TABLA
    private int idCancion;
    private String titulo;
    private String artista;
    private int anio;
    private double puntuacion;

    
    ///////// SOBRECARGA DE CONSTRUCTORES //////////////
    
    public Cancion() {
    }
    public Cancion(int idCancion) {
        this.idCancion = idCancion;
    }
    
     public Cancion(int idCancion, String titulo, String artista, int anio, double puntuacion){
        this.idCancion = idCancion;
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
        this.puntuacion = puntuacion;
    }

     //////////// GETTERS Y SETTERS ////////////////////
    public int getIdCancion() {
        return idCancion;
    }
    public void setIdCancion(int idCancion) {
        this.idCancion = idCancion;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    /////////////// METODO TOSTRING //////////////
    @Override
    public String toString() {
        return "Cancion{" + "idCancion=" + idCancion + ", titulo=" + titulo + ", artista=" + artista + ", Año=" + anio + ", puntuacion=" + puntuacion + '}';
    }
    
}
    

