package Clases;

/**
 * @author Luis Martin de Francisco
 */
public class Menu {
    protected String menuInicial;
    
     /*******************************************************************************
     ****************************  CONSTRUCTOR  ************************************* 
     *******************************************************************************/
    
    public Menu(){
        this.menuInicial = ("1.-Mostrar stock \n"
                + "2.-Quitar producto del stock \n"
                + "3.-Introducir producto en stock \n"
                + "4.-Guardar stock actual en archivo \n"
                + "5.-Salir");
    }
    
    /*******************************************************************************
     ****************************   METODOS  *************************************** 
     *******************************************************************************/
    
     public void mostrarMenu() {
        System.out.println(this.menuInicial);
    }
    
}
