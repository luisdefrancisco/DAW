package GUI;

/**
 * @author Luis Martin de Francisco
 * CLASE COMIC Con dos Atributos
 * titulo: String
 * descripción: String
 * Será utilizado para ser pasado entre JFrames o JDialogs en sus constructores
 * Es importante que esté en el paquete del resto de GUI
 */
public class Comic {
    //Definimos los atributos de la clase Comic
    protected String titulo;
    protected String descripcion;
       
    //Constructor
    public Comic(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    //Getters-Setters
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
