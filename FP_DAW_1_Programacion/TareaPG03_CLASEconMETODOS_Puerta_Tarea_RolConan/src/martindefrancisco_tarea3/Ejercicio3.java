package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * EJERCICIO 3: Conan MAIN CLASS
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Creamos la introducción y la presentamos
        Introduccion intro = new Introduccion();
        System.out.println(intro.getTexto());
        System.out.println("---------------------------------");
        
        // Creamos los jugadores
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador("Thoth-Amon");
        // Presentamos a los jugadores
        System.out.println(".... nuestro heroe Conan ......: ");
        jugador1.mostrarEstado();
        System.out.println(".... y su enemigo .......");
        jugador2.mostrarEstado();
        
        // Comienza la batalla
        // Comienza jugador1 atacando
        System.out.println("---------Comienza la batalla-------");
        System.out.println("Sacando su espada Atlantean, Conan no duda en blandirla contra Thorn-Amon.\n" +
                "Nuestro malvado Thorn-Amon sufre su castigo");
        jugador1.Atacar(jugador2);
        jugador2.mostrarEstado();
        
        // jugador1 levanta su escudo antes de que le ataque jugador2
        System.out.println("Ante el ataque de su enemigo, Conan levanta el escudo.");
        jugador1.Defender();
        jugador1.mostrarEstado();
        System.out.println("Thoth-Amon, aunque tarde, lanza una estocada contra el bárbaro.");
        jugador2.Atacar(jugador1);
        jugador1.mostrarEstado();
        System.out.println("Conan se da cuenta de su ventaja y vuelve a atacar con su espada.");
        jugador1.Atacar(jugador2);
        jugador2.mostrarEstado();
        System.out.println("La pelea sigue su curso. ¿Quién será el vencedor?");
    }
    
}
