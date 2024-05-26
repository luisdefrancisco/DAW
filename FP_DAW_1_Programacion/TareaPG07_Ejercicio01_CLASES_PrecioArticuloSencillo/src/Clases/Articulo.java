package Clases;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Articulo {
    protected double precio;
    protected double porcentaje;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio() {
        this.precio = 3.5;
    }

    public void setPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    public void setPrecio(double costo, double porcentaje) {
        this.precio = costo + (costo*porcentaje/100);
    }
}
