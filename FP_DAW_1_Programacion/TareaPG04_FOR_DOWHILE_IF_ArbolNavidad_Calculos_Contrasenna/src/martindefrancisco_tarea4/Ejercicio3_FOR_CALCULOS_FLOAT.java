package martindefrancisco_tarea4;

/**
 * @author Luis Martin de Francisco
 * EJERCICIO 3: Ventas
 */
import java.util.Scanner;

public class Ejercicio3_FOR_CALCULOS_FLOAT {
    public static void main(String[] args) {
        // TODO code application logic here
        int fijo = 200;
        float precios[] = {239.99f, 129.75f, 99.95f, 350.89f};
        float ventaTotal = 0;
        int cantidadArticulos[] = {0, 0, 0, 0};
        
        for (int a = 1; a<=4; a++){
           System.out.println("Introduce cuantos elementos del articulo "
                + a + " vendio este vendedor" );
            Scanner input = new Scanner(System.in);
            cantidadArticulos[a-1]  = input.nextInt(); 
        }
        
        for (int v = 0; v<4; v++){
            ventaTotal = ventaTotal + (cantidadArticulos[v]*precios[v]);
        }
        float comision = ventaTotal*9/100;
        float sueldo = 200 + comision;
        System.out.println("El total de ventas del sujeto es de " + ventaTotal + " Euros");
        System.out.println("La comision del sujeto es de " + comision + " Euros");
        System.out.println("El sueldo del sujeto correspondiente a "
                + "esta semana es de " + sueldo + " Euros");
        
        
        
        
    }
    
}
