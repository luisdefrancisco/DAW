package Clases;

import java.util.*;
import java.util.Scanner;

/**
 * @author Luis Martin de Francisco CLASE PRINCIPAL
 */
public class ProtoPasapalabra {

    public static void main(String[] args) {
        GeneraListaPreguntas juego01 = new GeneraListaPreguntas();
        String respuesta;
        Scanner inputText = new Scanner(System.in);

        // Creo un ArrayList nuevo para hacer la llamada al Array de
        // GenerarListaPreguntas para poder trabajar con el en esta clase
        List<Pregunta> listaPreguntas = new ArrayList<Pregunta>();
        listaPreguntas = juego01.getMiLista();
        //Recorremos cada pregunta y comparamos las respuestas
        for (Pregunta elemento : listaPreguntas) {
            System.out.println("-------------" + elemento.getIdentificador() + "-------------------");
            System.out.println(elemento.getEnunciado()); // Presentamos pregunta
            respuesta = inputText.nextLine().toLowerCase(); // Pedimos respuesta
            if (respuesta.equals(elemento.getRespuesta())) { //Si es correcta cambiamos a verde
                elemento.cambiaRespuestaCorrecta();
            } else if (respuesta.equals("pasapalabra")) {    
            } else{
                elemento.cambiaRespuestaIncorrecta();
            }
        }
        imprimirRosco(listaPreguntas);
    }

    public static void imprimirRosco(List<Pregunta> listaPreguntas) {
        System.out.println("-------Mostramos el estado actual del rosco----------");
        for (Pregunta elemento : listaPreguntas) {
            System.out.println("Identificador: " + elemento.getIdentificador());
            System.out.println("Enunciado: " + elemento.getEnunciado());
            //System.out.println("Respuesta: " + elemento.getRespuesta());
            System.out.println("Respuesta correcta: " + elemento.getRespuesta_correcta());
            System.out.println();
        }
    }

}
