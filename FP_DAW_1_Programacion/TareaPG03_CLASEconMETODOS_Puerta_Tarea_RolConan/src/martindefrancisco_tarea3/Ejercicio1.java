package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es
 * EJERCICIO 1 UD03
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Puerta puerta1 = new Puerta(); // Instanciamos un objeto puerta
        System.out.print("La puerta mide " + puerta1.getAncho()+"m de ancho, ");
        System.out.println(puerta1.getLargo()+"m de largo y está " + puerta1.mostrarEstado());
        
        puerta1.Abrir(); // mandamos abrir al objeto p1
        System.out.print("La puerta mide " + puerta1.getAncho()+"m de ancho, ");
        System.out.println(puerta1.getLargo()+"m de largo y está " + puerta1.mostrarEstado());
        
        puerta1.Cerrar(); // mandamos cerrar al objeto p1
        System.out.print("La puerta mide " + puerta1.getAncho()+"m de ancho, ");
        System.out.println(puerta1.getLargo()+"m de largo y está " + puerta1.mostrarEstado());
        
        puerta1.Cerrar(); // para ver que no pasa nada con la redundancia, 
                    // mandamos cerrar de nuevo al objeto p1
        System.out.print("La puerta mide " + puerta1.getAncho()+"m de ancho, ");
        System.out.println(puerta1.getLargo()+"m de largo y está " + puerta1.mostrarEstado());
        
        // Vamos a crear otro objeto con otras dimensiones y abierta
        Puerta puerta2 = new Puerta(15, 6, true); // Instanciamos un objeto puerta
        System.out.print("La nueva puerta mide " + puerta2.getAncho()+"m de ancho, ");
        System.out.println(puerta2.getLargo()+"m de largo y está " + puerta2.mostrarEstado());
                     
        puerta2.Cerrar(); // mandamos cerrar al objeto p1
        System.out.print("La nueva puerta mide " + puerta2.getAncho()+"m de ancho, ");
        System.out.println(puerta2.getLargo()+"m de largo y está " + puerta2.mostrarEstado()); 
        
        puerta2.Abrir(); // mandamos abrir al objeto p1
        System.out.print("La nueva puerta mide " + puerta2.getAncho()+"m de ancho, ");
        System.out.println(puerta2.getLargo()+"m de largo y está " + puerta2.mostrarEstado());
    }
    
}
