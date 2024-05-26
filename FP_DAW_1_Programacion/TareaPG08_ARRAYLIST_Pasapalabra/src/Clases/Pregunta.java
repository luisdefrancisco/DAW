package Clases;
/**
 *
 * @author Luis Martin de Francisco
 * CLASE Pregunta
 * ATRIBUTOS: 
 *    - identificador char en Constructor
 *    - enunciado String en Constructor
 *    - respuesta String en Constructor
 *    - respuesta_correcta String
 * METODOS:
 *    - getters
 *    - cambiaRespuestaCorrecta() void cambia respuesta_correcta a "Verde"
 *    - cambiaRespuestaIncorrecta() void cambia respuesta_correcta a "Rojo"
 *    - cambiaPasapalabra() void cambia respuesta_correcta a "Azul"
 */
public class Pregunta {
    protected char identificador; 
    protected String enunciado;
    protected String respuesta;
    protected String respuesta_correcta;

    public Pregunta(char identificador, String enunciado, String respuesta) {
        this.identificador = identificador;
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.respuesta_correcta = "Azul";
    }

    public char getIdentificador() {
        return identificador;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public String getRespuesta_correcta() {
        return respuesta_correcta;
    }
       
    public void cambiaRespuestaCorrecta(){
        this.respuesta_correcta = "Verde";
    }
    public void cambiaRespuestaIncorrecta(){
        this.respuesta_correcta = "Rojo";
    }
    public void cambiaPasapalabra(){
        this.respuesta_correcta = "Azul";
    }
}
