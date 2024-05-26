package Clases;

import java.util.*;

public class GeneraListaPreguntas {
    public List<Pregunta> misPreguntas = new ArrayList<Pregunta>();
        
    public GeneraListaPreguntas() { 
        misPreguntas.add(new Pregunta(
                'a', 
                "Que depende del azar",
                "aleatorio"));
        misPreguntas.add(new Pregunta(
                'b', 
                "Que puede tomar solo dos variables",
                "booleano"));
        misPreguntas.add(new Pregunta(
                'c', 
                "Convertir un tipo de dato en otro",
                "cast"));
        misPreguntas.add(new Pregunta(
                'd', 
                "Tipo de dato de doble precision",
                "double"));
        misPreguntas.add(new Pregunta(
                'e', 
                "Tipo de programación utilizada antes de la POO",
                "estructurada"));
        
    }

    public List getMiLista() {
        return this.misPreguntas;
    }
    
}
