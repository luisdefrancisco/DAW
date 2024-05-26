package pg_martindefrancisco_tarea6;

import java.util.Scanner;

public class Saladecine {
    //Definimos los atributos de la clase Sala

    private String[][] butacasSala;
    private int fila;
    private int butaca;
    private int recaudacion;
    Scanner preguntaTexto = new Scanner(System.in);
    Scanner preguntaNumero = new Scanner(System.in);

    /**
     * *****************************************************************************
     **************************** CONSTRUCTOR
     * ************************************* 
     ******************************************************************************
     */
    public Saladecine(int fila, int butaca) {
        this.butacasSala = new String[fila][butaca];
        this.fila = fila;
        this.butaca = butaca;
        this.recaudacion = 0;

        // inicializamos las butacas la sala con todos los estados libres "O"
        // Es una matriz con las filas y butacas que definimos en la instancia
        for (int i = 0; i < this.fila; i++) {
            for (int j = 0; j < this.butaca; j++) {
                butacasSala[i][j] = "O";
            }
        }
    }

    /**
     * *****************************************************************************
     **************************** METODOS
     * *************************************** 
     ******************************************************************************
     */
    // METODO mostrarSala. Caso menú (2) mostramos el estado de ocupación de las butacas  
    // con un poco de formato con signos "-"
    public void mostrarSala() {
        for (int i = 0; i < this.fila; i++) {
            System.out.print("                ");
            for (int j = 0; j < ((this.butaca) * 3) - 1; j++) {
                System.out.print("-");
            }
            System.out.print("\n");
            System.out.print("                ");
            for (int j = 0; j < this.butaca; j++) {
                System.out.print(butacasSala[i][j] + "  ");
            }
            System.out.print("\n");
        }
        System.out.print("                ");
        for (int j = 0; j < ((this.butaca) * 3) - 1; j++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

    // METODO comprarEntrada. Caso menú (3). 
    // Debemos comprobar si está ocupada en la matriz. Recordar quitar uno a la posicion
    // Debemos preguntar si está de acuerdo en comprar para imprimir la entrada y cambiar
    // la posición a ocupada "X"
    // Si la posición no existe capturamos el error de Array y lanzamos mensaje
    public void comprarEntrada() {
        System.out.println("Por favor introduzca el numero de fila y de butaca que quiere");
        int filaElegida = preguntaNumero.nextInt() - 1;
        int butacaElegida = preguntaNumero.nextInt() - 1;
        try {
            boolean ocupacion = this.comprobarOcupacion(filaElegida, butacaElegida); // Verificamos si está ocupada
            if (!ocupacion) {
                System.out.println("La entrada cuesta 3€. Está de acuerdo? (S/N)");
                String deAcuerdo = preguntaTexto.nextLine();
                if (deAcuerdo.toLowerCase().equals("s")) {
                    butacasSala[filaElegida][butacaElegida] = "X";
                    this.imprimirEntrada(filaElegida + 1, butacaElegida + 1);
                    this.recaudacion = this.recaudacion + 3;
                }
            } else {
                System.out.println("Transacción no puede realizarse porque la entrada ya está vendida");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Esta sala no tiene esa posición de butaca");
        }
    }

    // METODO devolverEntrada. Caso menú (4). 
    // Debemos comprbar si está ocupada en la matriz. Recordar quitar uno a la posicion
    // Debemos preguntar si está de acuerdo en devolver la entrada y cambiar
    // la posición a libre "O" 
    // Si la posición no existe capturamos el error de Array y lanzamos mensaje
    public void devolverEntrada() {
        System.out.println("Por favor introduzca el numero de fila y de butaca que quiere devolver");
        int filaElegida = preguntaNumero.nextInt() - 1;
        int butacaElegida = preguntaNumero.nextInt() - 1;
        try {
            boolean ocupacion = this.comprobarOcupacion(filaElegida, butacaElegida); // Verificamos si está ocupada
            if (ocupacion) {
                System.out.println("Se devolverán 3€. Está de acuerdo? (S/N)");
                String deAcuerdo = preguntaTexto.nextLine();
                if (deAcuerdo.toLowerCase().equals("s")) {
                    butacasSala[filaElegida][butacaElegida] = "O";
                    this.recaudacion = this.recaudacion - 3;
                }
            } else {
                System.out.println("Transacción no puede realizarse porque la entrada no había sido vendida");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Esta sala no tiene esa posición de butaca");
        }
    }
        // METODO comprobarOcupación. 
        // Nos ayudará a comprobar en comprarEntrada y en devolverEntrada
    public boolean comprobarOcupacion(int filaElegida, int butacaElegida) {
        if (butacasSala[filaElegida][butacaElegida] == "O") {
            return false;
        } else {
            return true;
        }
    }

    // METODO imprimirEntrada 
    // será utilizado en comprarEntrada
    public void imprimirEntrada(int filaElegida, int butacaElegida) {
        String entrada = ("        IMPRIMIENDO ENTRADA\n"
                + "----------------------------------------------------\n"
                + "*****************************************************************\n"
                + "*  Festival Only Ships                    sala: Nostromo        *\n"
                + "*  Fila: " + filaElegida + " Butaca: " + butacaElegida + "                      Precio: 3€            *\n"
                + "*****************************************************************");
        System.out.println(entrada);
    }

    // METODO mostrarRecaudacion. Caso menú (5).
    public void mostrarRecaudacion() {
        System.out.println("La recaudación es " + this.recaudacion + " Euros");
    }

}
