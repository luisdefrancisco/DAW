package Clases;

/**
 *
 * @author Luis Martin de Francisco
 */
public class Tarea07_Ejercicio02 {

    public static void main(String[] args) {
        Mamifero mamifero01 = new Mamifero();
        Perro perro01 = new Perro();
        Gato gato01 = new Gato();
        
        System.out.println("-------------con sus metodos mover-------------");
        mamifero01.mover();
        perro01.mover();
        gato01.mover();
        System.out.println("-------------con metodo muevete-------------");
        muevete(mamifero01);
        muevete(perro01);
        muevete(gato01);
    }
    
    public static void muevete(Mamifero m) {
        m.mover();
    }
    
}
