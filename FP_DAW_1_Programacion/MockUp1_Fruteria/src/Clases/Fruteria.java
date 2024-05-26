package Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Luis Martin de Francisco
 */
public class Fruteria {
    private String nombre;
    private String direccion;
    private List<Fruta> frutas = new ArrayList<Fruta>();
    
    
    ////// CONSTRUCTOR /////////

    public Fruteria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        
    }
    
    public void agregarFruta(Fruta fruta){
        frutas.add(fruta);
    }
    
    public void eliminarFruta(Fruta fruta){
        frutas.remove(fruta);
    }

    @Override
    public String toString() {
        return "Fruteria{" + "nombre=" + nombre + ", direccion=" + direccion + ", frutas=" + frutas + '}';
    }
    
    
    
}
