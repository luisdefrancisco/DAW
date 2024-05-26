/**
 * TAREA 5
 * @author Luis Martin de Francisco
 * CLASE NOVELA GRAFICA - Hija de COMIC
 */
package clases;

public class NovelaGrafica extends Comic {
    
    private int numPag;

    //Constructor - Hereda de Comic y se añade numPag
    public NovelaGrafica(int numPag, String titulo, String guionista, String dibujante, int numero) {
        super(titulo, guionista, dibujante, numero);
        this.numPag = numPag;
    }
    
    //Getter-Setter solo de la clase NovelaGrafica

    public int getNumPag() {
        return this.numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    //ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nY esta novela grafica tendrá ").append(numPag);
        sb.append(" paginas");
        return sb.toString();
    }
      
}
