
package pg_martindefrancisco_tarea6;


public class Menu {
    
    protected String menuInicial;
    
     /*******************************************************************************
     ****************************  CONSTRUCTOR  ************************************* 
     *******************************************************************************/
    
    public Menu(){
        this.menuInicial = ("\n"
                + "                        **********************************************************\n"
                + "                        *       1.-Mostrar película en cartelera                 *\n"
                + "                        *       2.-Mostrar estado de la sala                     *\n"
                + "                        *       3.-Comprar entrada                               *\n"
                + "                        *       4.-Devolver entrada                              *\n"
                + "                        *       5.-Mostrar la recaudación hasta el momento       *\n"
                + "                        *       0.-Salir                                         *\n"
                + "                        **********************************************************\n");
    }
    
    /*******************************************************************************
     ****************************   METODOS  *************************************** 
     *******************************************************************************/
    
     public void mostrarMenu() {
        System.out.println(this.menuInicial);
    }
}
