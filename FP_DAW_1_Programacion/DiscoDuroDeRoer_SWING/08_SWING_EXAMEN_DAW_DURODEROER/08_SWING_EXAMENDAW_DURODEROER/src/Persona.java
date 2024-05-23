
/**
 * @author Luis Martin de Francisco
 */

/////////// CLASE ABSTRACTA PERSONA //////////////
abstract class Persona {
    private String dni;
    private String nombre;
    
        //****** Constructores ********//
    public Persona() {
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
        //****** Getters and Setters ********//
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    
}
