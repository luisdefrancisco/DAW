package test;

import GUI.Borrar;
import GUI.MenuPrincipal;
import datos.ConstruccionBaseMagos;
import java.sql.SQLException;

/**
 *
 * @author Luis Martin de Francisco
 */
public class MagosDelHumoCompleto {

    public static void main(String[] args) {
        try {
            ConstruccionBaseMagos inicio = new ConstruccionBaseMagos();
        } catch (SQLException ex) {
            
        }
        MenuPrincipal ventanaPrincipal = new MenuPrincipal(); //Nuevo objeto ventana
        ventanaPrincipal.setVisible(true); //Que sea visible
        ventanaPrincipal.setLocationRelativeTo(null); // Para que aparezca en el centro
         

    }
    
}
