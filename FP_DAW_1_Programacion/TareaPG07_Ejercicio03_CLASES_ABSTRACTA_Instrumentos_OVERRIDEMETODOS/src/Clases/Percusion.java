package Clases;

public class Percusion extends Instrumento{
    // COSNTRUCTOR    
    public Percusion(){        
    }
    
// METODOS
    
    @Override
    public void tocar(){
        System.out.println("Soy de la clase PERCUSION y estoy utilizando TOCAR"); 
    }
    @Override
    public void tocar(String nota){
        System.out.println("Soy de la clase PERCUSION y estoy utilizando TOCAR"
                + " con " + nota); 
    }
    @Override
    public void afinar(){
        System.out.println("Soy de la clase PERCUSION y estoy utilizando AFINAR"); 
    }
}
