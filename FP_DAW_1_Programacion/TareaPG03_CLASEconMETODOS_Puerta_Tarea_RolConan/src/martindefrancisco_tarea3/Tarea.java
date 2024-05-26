package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * EJERCIO 2: Clase Tarea
 *  - Descripcion: String
 *  - Fecha: String
 *  - Prioridad: integer (1-10)
 *  - Completada: boolean
 */
public class Tarea {
    String descripcion;
    String fecha;
    int prioridad;
    boolean completada;
    
    // CONSTRUCTORES
    public Tarea() {
        this.descripcion = "Tarea nueva";
        this.fecha = "01/01/2023";
        this.prioridad = 1;
        this.completada = false;
    }    
    public Tarea(String ladescripcion, String lafecha, int laprioridad, boolean estacompletada) {
        this.descripcion = ladescripcion;
        this.fecha = lafecha;
        this.prioridad = laprioridad;
        this.completada = estacompletada;
    }

    // GETTERS AND SETTERS
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public boolean isCompletada() {
        return completada;
    }
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    // METODOS
    void aumentarPrioridad(){
        if (this.prioridad < 10){
            this.setPrioridad(this.prioridad+1);
        }
    }
    void disminuirPrioridad(){
        if(this.prioridad > 1){
            this.setPrioridad(this.prioridad-1);
        }
    }
}
