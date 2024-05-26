package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * Clase Puerta --- Ejercicio 1 UD03
 * - ancho: double
 * - largo: double
 * - abierta: boolean
 *  METODOS
 *  - mostrarEstado() -> envia a pantalla el estado de la puerta
 *  - Abrir() -> establece abierta a true
 *  - Cerrar() -> establece abierta a false
 */
public class Puerta {
    double ancho;
    double largo;
    boolean abierta;
    
    // CONSTRUCTOR POR DEFECTO Y DEFINIDO POR USUARIO
    public Puerta(){
        this.ancho = 3;
        this.largo = 2;
        this.abierta = false;
    }
    
    public Puerta(double elancho, double ellargo, boolean estado){
        this.ancho = elancho;
        this.largo = ellargo;
        this.abierta = estado;
    }
    
    // GETTERS AND SETTERS
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public boolean isAbierta() {
        return abierta;
    }
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    // METODOS
    String mostrarEstado(){
        if (this.isAbierta()){
            return "abierta";
        } else {
            return "cerrada";
        }
    }
    void Abrir(){
        this.setAbierta(true);
    }  
    void Cerrar(){
        this.setAbierta(false);
    }
}
