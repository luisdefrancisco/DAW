package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * EJERCICIO 3: Conan Clase Introduccion
 * - texto: contiene el texto introductorio
 */
public class Introduccion {
    String texto;
    
    // CONSTRUCTOR
    public Introduccion(){
        this.texto = "Sabed, oh, príncipe, que entre los años del hundimiento de Atlantis y de las resplandecientes\n" +
"ciudades bajo los océanos, y los de la aparición de los hijos de Aryas, hubo una edad olvidada en\n" +
"la que el mundo estaba cubierto de brillantes reinos como mantos azules bajo las estrellas:\n" +
"Nemedia, Ofir, Brithunia, Hiperborea: Zamora con sus muchachas de oscuros cabellos y sus torres\n" +
"plagadas de arácnidos misterios: Zingara y sus caballeros: Koth, limítrofe con las tierras\n" +
"pastoriles de Shem: Estigia con sus tumbas custodiadas por sombras e Hirkania, cuyos jefes\n" +
"vestían acero, seda y oro. Pero el más orgulloso reino del mundo era Aquilonia, que reinaba\n" +
"soberana sobre el soñoliento oeste. Y aquí llego Conan, el cimmerio de pelo negro, los ojos\n" +
"sombríos, la espada en la mano, un saqueador, un asesino de gigantes melancolías y gigantescas\n" +
"alegrías, para pisotear con sus sandalias los enjoyados tronos de la Tierra.";
    }
    
    // GETTERS & SETTERS
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
