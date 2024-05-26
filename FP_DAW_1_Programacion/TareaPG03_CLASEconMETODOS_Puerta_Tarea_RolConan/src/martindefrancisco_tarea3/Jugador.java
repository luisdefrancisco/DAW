package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * EJERCICIO 3: Conan Clase Jugador
 * - nombre: String
 * - energia: double
 * - defensa: boolean
 *   METODOS
 * - Atacar(): restará 25 puntos al contrario si defensa está en false
 * - Defender(): Cambia a true defensa. En caso de recibir ataque cambia defensa a false
 * - mostrarEstado(): muestra los parámetros del jugador
 */
public class Jugador {
    String nombre;
    double energia;
    boolean defensa;
    
    // CONSTRUCTOR
    public Jugador(){
        this.energia = 100;
        this.nombre = "Conan";
        this.defensa = false;
    }
    public Jugador(String name){
        this.energia = 100;
        this.nombre = name;
        this.defensa = false;
    }
    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getEnergia() {
        return energia;
    }
    public void setEnergia(double energia) {
        this.energia = energia;
    }
    public boolean isDefensa() {
        return defensa;
    }
    public void setDefensa(boolean defensa) {
        this.defensa = defensa;
    }
    
    // METODOS
    
    public void Atacar(Jugador enemigo){
        if (enemigo.isDefensa()== false){
            enemigo.setEnergia(enemigo.getEnergia() - 25);
        } else{
            System.out.println(enemigo.getNombre() + " estaba en posición de defensa");
        }
        enemigo.setDefensa(false);
        
    }
    public void Defender(){
        this.defensa = true; 
    }
    public void mostrarEstado(){ 
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Energia: " + this.getEnergia());
        System.out.println("Defensa: " + this.isDefensa());
    }
}

