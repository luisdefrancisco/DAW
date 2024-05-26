
package Clases;

public class Viento extends Instrumento {
        public Viento(){        
    }
    
// METODOS
    
    @Override
    public void tocar(){
        System.out.println("Soy de la clase VIENTO y estoy utilizando TOCAR"); 
    }
    @Override
    public void tocar(String nota){
        System.out.println("Soy de la clase VIENTO y estoy utilizando TOCAR"
                + " con " + nota); 
    }
    @Override
    public void afinar(){
        System.out.println("Soy de la clase VIENTO y estoy utilizando AFINAR"); 
    }
}
