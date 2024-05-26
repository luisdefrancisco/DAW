package domain;

/**
 *
 * @author Luis Martin de Francisco
 * CLASE QUE REPRESENTA LA TABLA DE LA BASE DE DATOS Album
 * Los datos cambiarán en función de los campos que tengamos en la BBDD
 * IMPORTANTE:
 * 1.- Creamos la clase Conexion
 * 2.- Creamos la clase Persona (tabla de la BBDD)
 * 3.- Creamos la clase AlbumDAO (manejo de los datos)
 * 4.- Creamos la clase MAIN
 * 
 * 
 */
public class Album {
    
    // VARIABLES PARA ALMACENAR LOS CAMPOS DE LA TABLA
    private int idAlbum;
    private String titulo;
    private String protagonistas;
    
    ///////// SOBRECARGA DE CONSTRUCTORES //////////////
    
    public Album() {
    }
    public Album(int idAlbum) {
        this.idAlbum = idAlbum;
    }
    public Album(int idAlbum, String titulo, String protagonistas) {
        this.idAlbum = idAlbum;
        this.titulo = titulo;
        this.protagonistas = protagonistas;
    }

    ///////////// GETTERS Y SETTERS ///////////////////////////

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    @Override
    public String toString() {
        return "Album{" + "idAlbum=" + idAlbum + ", titulo=" + titulo + ", protagonistas=" + protagonistas + '}';
    }
    
}
