package Clases;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Fruta {
    private String nombreFruta;
    private double preciofuta;
    private String descripcion;

    
    ///////// CONSTRUCTOR //////////////
    public Fruta(String nombreFruta, double preciofuta, String descripcion) {
        this.nombreFruta = nombreFruta;
        this.preciofuta = preciofuta;
        this.descripcion = descripcion;
    }
    ///////// GETTERS AND SETTERS //////////////
    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public double getPreciofuta() {
        return preciofuta;
    }

    public void setPreciofuta(double preciofuta) {
        this.preciofuta = preciofuta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Fruta{" + "nombreFruta=" + nombreFruta + ", preciofuta=" + preciofuta + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
