package Clases;

public class Cuerda extends Instrumento{

// COSNTRUCTOR    
    public Cuerda(){        
    }
    
// METODOS
    
    @Override
    public void tocar(){
        System.out.println("Soy de la clase CUERDA y estoy utilizando TOCAR"); 
    }
    @Override
    public void tocar(String nota){
        System.out.println("Soy de la clase CUERDA y estoy utilizando TOCAR"
                + " con la nota " + nota); 
    }
    @Override
    public void afinar(){
        System.out.println("Soy de la clase CUERDA y estoy utilizando AFINAR"); 
    }
}
