package Clases;

/**
 * @author Luis Martin de Francisco
 */
public class GestionFruterias {

    public static void main(String[] args) {
        // TODO code application logic here
        Fruteria fruteria = new Fruteria("Naranjito", "Calle del medio, 3");
        Fruta fruta1 = new Fruta("Naranja", 4, "Valenciana");
        Fruta fruta2 = new Fruta("Pera", 3.50, "Imperial");
        Fruta fruta3 = new Fruta("Melon", 4.5, "Etiqueta Negra");
        fruteria.agregarFruta(fruta1);
        fruteria.agregarFruta(fruta2);
        fruteria.agregarFruta(fruta3);

        System.out.println(fruteria.toString());

    }
    
}
