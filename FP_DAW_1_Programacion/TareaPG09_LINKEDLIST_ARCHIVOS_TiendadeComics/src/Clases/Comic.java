package Clases;

/**
 * @author Luis Martin de Francisco
 */
public class Comic extends Producto {
    /// NUEVOS ATRIBUTOS ///
    private String dibujanteComic;
    private String guionistaComic;
    
    /// CONSTRUCTOR CON SUPER ///
    public Comic(String titulo, String id, String dibujante, String guionista) {
        super(titulo, id);
        this.dibujanteComic = dibujante;
        this.guionistaComic = guionista;
    }
    
    /// GETTERS Y SETTERS ///
    public String getDibujanteComic() {
        return dibujanteComic;
    }
    public void setDibujanteComic(String dibujanteComic) {
        this.dibujanteComic = dibujanteComic;
    }
    public String getGuionistaComic() {
        return guionistaComic;
    }
    public void setGuionistaComic(String guionistaComic) {
        this.guionistaComic = guionistaComic;
    }
    
}
