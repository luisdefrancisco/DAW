/**
 * TAREA 5
 * @author Luis Martin de Francisco
 * CLASE COMIC Apartado 1
 */
package clases;

public class Comic {
    
    //Definimos los atributos de la clase Comic
    protected String titulo;
    protected String guionista;
    protected String dibujante;
    protected int numero;
    
    //Constructor
    public Comic(String titulo, String guionista, String dibujante, int numero) {
        this.titulo = titulo;
        this.guionista = guionista;
        this.dibujante = dibujante;
        this.numero = numero;
    }

    //Getters-Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGuionista() {
        return this.guionista;
    }

    public void setGuionista(String guionista) {
        this.guionista = guionista;
    }

    public String getDibujante() {
        return this.dibujante;
    }

    public void setDibujante(String dibujante) {
        this.dibujante = dibujante;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
  //Metodo toString. Utilizamos clase StringBuilder para añadir cosas si necesitamos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El comic ");
        sb.append(titulo);
        sb.append(" numero ").append(numero);
        sb.append(" fue guionizado por ").append(guionista);
        sb.append(" y dibujado por ").append(dibujante);
        return sb.toString();
    }
    
}
