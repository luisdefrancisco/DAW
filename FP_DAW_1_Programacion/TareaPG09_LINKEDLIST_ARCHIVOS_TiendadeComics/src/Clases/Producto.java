package Clases;

/**
 * @author Luis Martin de Francisco
 */
public abstract class Producto {
    //// ATRIBUTOS PRODUCTO /////
    protected String tituloProducto;
    protected String idProducto;
    
    /// CONSTRUCTOR PRODUCTO /////
    public Producto(String titulo, String id){
        this.tituloProducto = titulo;
        this.idProducto = id;
    }
    
    /// METODOS GETTERS Y SETTERS ///
    public String getTituloProducto() {
        return tituloProducto;
    }
    public void setTituloProducto(String tituloProducto) {
        this.tituloProducto = tituloProducto;
    }
    public String getIdProducto() {
        return idProducto;
    }
  
}
