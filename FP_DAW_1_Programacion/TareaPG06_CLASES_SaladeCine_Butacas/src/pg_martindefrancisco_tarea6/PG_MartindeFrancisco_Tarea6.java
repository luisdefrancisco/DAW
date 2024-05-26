package pg_martindefrancisco_tarea6;

import java.util.Scanner;

/**
 *
 * @author Luis Martin de Francisco
 */
public class PG_MartindeFrancisco_Tarea6 {

    public static void main(String[] args) {
        Festival festival1 = new Festival();
        Saladecine sala1 = new Saladecine(12, 20);
        Menu menu1 = new Menu();
        Pelicula pelicula1 = new Pelicula();

        Scanner input = new Scanner(System.in);
        boolean continuar = true;
        while (continuar == true) {
            festival1.mostrarFestival();
            menu1.mostrarMenu();
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    pelicula1.mostrarPelicula();
                    pelicula1.mostrarCartel();
                    break;
                case 2:
                    sala1.mostrarSala();
                    break;
                case 3:
                    sala1.comprarEntrada();
                    break;
                case 4:
                    sala1.devolverEntrada();
                    break;
                case 5:
                    sala1.mostrarRecaudacion();
                    break;
                case 0:
                    continuar = false;
                    break;
        
            }
        }

    }

}
