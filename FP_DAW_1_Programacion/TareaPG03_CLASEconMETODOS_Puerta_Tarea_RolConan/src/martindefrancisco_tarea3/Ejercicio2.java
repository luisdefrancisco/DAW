package martindefrancisco_tarea3;

/**
 * @author Luis Martin de Francisco luisde2001@educantabria.es EJERCICIO 2
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // Tarea 1 por defecto
        Tarea tarea1 = new Tarea();
        System.out.println("La prioridad de inicio de la tarea por defecto es: " + tarea1.getPrioridad());
        System.out.println("La tarea por defecto es: " + tarea1.getDescripcion());
        System.out.println("Debe ser terminada antes del: " + tarea1.getFecha());
        System.out.println("Completada: " + tarea1.isCompletada());
        System.out.println("----------------------------------------------------");
        // Tarea 2 definida por usuario, es con la que jugaremos
        Tarea tarea2 = new Tarea("Terminar UD03", "19/11/23", 6, false);
        System.out.println("La prioridad de inicio es: " + tarea2.getPrioridad());
        System.out.println("La tarea es: " + tarea2.getDescripcion());
        System.out.println("Debe ser terminada antes del: " + tarea2.getFecha());
        System.out.println("Completada: " + tarea2.isCompletada());

        // Comenzamos a mover la prioridad
        tarea2.disminuirPrioridad();
        tarea2.disminuirPrioridad();
        tarea2.disminuirPrioridad();
        System.out.println("La prioridad despues de disminuirla 3 veces es: " + tarea2.getPrioridad());
        tarea2.aumentarPrioridad();
        tarea2.aumentarPrioridad();
        System.out.println("La prioridad al aumentarla 2 veces es: " + tarea2.getPrioridad());
        System.out.println("----------------------------------------");

        // Caso limite inferior
        tarea2.setPrioridad(1);
        System.out.println("Vamos a ver que no baja de 1...");
        System.out.println("La prioridad actual la hemos colocado en: " + tarea2.getPrioridad());
        tarea2.disminuirPrioridad();
        tarea2.disminuirPrioridad();
        tarea2.disminuirPrioridad();
        System.out.println("La prioridad despues de disminuirla 3 veces sigue siendo: " + tarea2.getPrioridad());
        System.out.println("----------------------------------------");
        // Caso limite superior
        tarea2.setPrioridad(10);
        System.out.println("Vamos a ver que no sube de 10...");
        System.out.println("La prioridad actual la hemos colocado en: " + tarea2.getPrioridad());
        tarea2.aumentarPrioridad();
        tarea2.aumentarPrioridad();
        tarea2.aumentarPrioridad();
        System.out.println("La prioridad despues de aumentarla 3 veces sigue siendo: " + tarea2.getPrioridad());
    }

}
