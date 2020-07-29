
package Ejercicio9;

import java.util.ArrayList;
import java.util.List;


public class Juego {
    Jugador jugadores;
    Revolver revolver;
    List <Jugador> listaJugadores = new ArrayList();
      
    public Juego(List<Jugador> listaJugadores, Revolver revolver){
        this.listaJugadores=listaJugadores;
        this.revolver=revolver; 
    }
   private boolean finJuego(){
       return true;
   }
    public void ronda(){
        for (Jugador i : listaJugadores) {
            i.Disparar(this.revolver);
            if (!i.getEstaVivo()){
                this.finJuego();
                this.mostrarLista();
                break;
            }
            
        }   
    }
    
    public void mostrarLista(){
        for (Jugador i : listaJugadores) {
            System.out.println(i.getNombre()+" , "+i.getId()+" , "+i.getEstaVivo());
        }
    
    }
    
   
   
   
    
    
    
    
    
    
    
    
    
    
    
}

