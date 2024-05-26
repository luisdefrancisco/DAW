package Clases;

/**
 * @author Luis Martin de Francisco
 */
public class Libro extends Producto {
    private String autorLibro;

    //// CONSTRUCTOR //////
    public Libro(String titulo, String id, String autorLibro) {
        super(titulo, id);
        this.autorLibro = autorLibro;
    }

    //// GETTERS Y SETTERS /////
    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }
    
}
