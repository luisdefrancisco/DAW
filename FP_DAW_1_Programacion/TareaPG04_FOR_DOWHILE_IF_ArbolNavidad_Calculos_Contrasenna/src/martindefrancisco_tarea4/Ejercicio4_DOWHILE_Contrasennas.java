package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisco
 * EJERCICIO 4 CONTRASEÑA
 */

import java.util.Scanner;

public class Ejercicio4_DOWHILE_Contrasennas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("introduce contraseña ");
            String pass1  = input.nextLine();
            System.out.println("Introduce de nuevo la contraseña ");
            String pass2  = input.nextLine();
            if(pass1.equals(pass2)){
                flag = true;
                System.out.println("Las contraseñas coinciden. Se procede"
                        + " al cambio de contraseña");
                continue;
            } else{
                System.out.println("Las contraseñas no coinciden. No se "
                        + "procede al cambio de contraseña");
            }
        
        }while(flag == false);
    }
    
}
