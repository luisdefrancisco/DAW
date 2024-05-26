package Clases;

import static Clases.ManejoArchivo.*;
import java.io.*;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Luis Martin de Francisco
 */
public class GestionLibreria {

    public static void main(String[] args) {

        Menu menu1 = new Menu();
        Scanner preguntaNumero = new Scanner(System.in); /// Para introducir opciones
        Scanner preguntaTexto = new Scanner(System.in);
        String titulo;
        String autor;
        String guionista;
        String dibujante;
        int opcion;
        boolean continuar = true; /// Para mantener el While

        ////// Inicializamos el LinkedList
        LinkedList<Producto> linkedListProductos = new LinkedList<Producto>();

        ///// Creamos los dos primeros objetos que irán en el LinkedList
        Comic producto1 = new Comic("Conan el Bárbaro 35º Aniversario",
                "Comic", "Barry W. Smith", "Roy Thomas");
        Libro producto2 = new Libro("Las Montañas de la Locura",
                "Libro", "H.P.Lovecraft");

        ///// Los añadimos al LinkedList
        linkedListProductos.add(producto1);
        linkedListProductos.add(producto2);

        /// PREPARACIÓN DEL ARCHIVO
        var nombreArchivo = "archivo.txt";

        while (continuar == true) {
            menu1.mostrarMenu();
            opcion = preguntaNumero.nextInt();
            switch (opcion) {
                case 1: /// MOSTRAR INFORMACION
                    for (int i = 0; i < linkedListProductos.size(); i++) {
                        System.out.println(i + 1 + " " + linkedListProductos.get(i).getIdProducto()
                                + ": " + linkedListProductos.get(i).getTituloProducto());
                    }
                    break;

                case 2: /// QUITAR UN PRODUCTO
                    try {
                    System.out.println("Introduce el número de producto que quieres quitar del stock");
                    opcion = preguntaNumero.nextInt();
                    System.out.println("Has vendido un " + linkedListProductos.get(opcion - 1).getIdProducto());
                    linkedListProductos.remove(opcion - 1);
                    break;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("No existe ese producto");
                    break;
                }

                case 3: /// AÑADIR UN PRODUCTO
                    System.out.println("1- Introducir un Comic");
                    System.out.println("2- Introducir un Libro");
                    opcion = preguntaNumero.nextInt();
                    if (opcion == 1) {
                        System.out.println("Introduce el título");
                        titulo = preguntaTexto.nextLine();
                        System.out.println("Introduce el dibujante");
                        dibujante = preguntaTexto.nextLine();
                        System.out.println("Introduce el guionista");
                        guionista = preguntaTexto.nextLine();
                        linkedListProductos.add(new Comic(titulo, "Comic", dibujante, guionista));
                    } else if (opcion == 2) {
                        System.out.println("Introduce el título");
                        titulo = preguntaTexto.nextLine();
                        System.out.println("Introduce el autor");
                        autor = preguntaTexto.nextLine();
                        linkedListProductos.add(new Libro(titulo, "Libro", autor));
                    }
                    break;

                case 4: /// ESCRIBIR Y LEER EN EL ARCHIVO
                    crearArchivo(nombreArchivo);
                    escribirArchivo(nombreArchivo, linkedListProductos);
                    //agregarInformacionAlArchivo(nombreArchivo, linkedListProductos);
                    LeerArchivo(nombreArchivo);

                    break;

                case 5: /// FINALIZAMOS EL PROGRAMA CON EL BOOLEANO
                    continuar = false;
                    break;
            }

        }
    }

}
