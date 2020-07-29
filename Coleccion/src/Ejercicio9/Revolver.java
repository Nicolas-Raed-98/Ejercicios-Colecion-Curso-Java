
package Ejercicio9;

import java.util.ArrayList;
import java.util.Random;



public class Revolver {
   private int posicionActual;
   private int posicionBala;
   
   
    public Revolver(){
    }
    public Revolver(int posicionActual, int posicionBala){
    this.posicionActual=posicionActual;
    this.posicionBala=posicionBala;
    
    }
  
      public boolean Disparar(){
        
        posicionActual=(int) (Math.random() * 5+1);
        posicionBala= (int) (Math.random()*5+1);
        
        return (posicionActual==posicionBala); 
      }
        
        
        
    
    public void siguienteBala(){
        if (posicionActual<6){
        posicionActual=posicionActual+1;}
        else{
         posicionActual=1;   
            
        }
    
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionBala=" + posicionBala +  '}';
    }
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionBala() {
        return posicionBala;
    }

    public void setPosicionBala(int posicionBala) {
        this.posicionBala = posicionBala;
    }
    
}
