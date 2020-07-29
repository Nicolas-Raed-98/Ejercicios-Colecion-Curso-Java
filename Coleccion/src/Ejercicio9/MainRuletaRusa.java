
package Ejercicio9;

import java.util.ArrayList;
import java.util.List;


public class MainRuletaRusa {

    
    public static void main(String[] args) {
       Revolver revolver = new Revolver();
        System.out.println(revolver.Disparar());
        revolver.siguienteBala();
        System.out.println(revolver.toString());
       List <Jugador> listaJugadores = new ArrayList();
       for(int i=1 ; i<7 ; i++){  
        Jugador jugador = new Jugador(i,"Jugador",true);
        listaJugadores.add(jugador);
       }
       Juego juego = new Juego(listaJugadores,revolver);
        juego.ronda();
        
    }
    
}
