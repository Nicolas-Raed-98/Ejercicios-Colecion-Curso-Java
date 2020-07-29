
package Ejercicio10;

import java.util.Scanner;

public class MainBaraja {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Carta carta = new Carta();
        Baraja baraja = new Baraja();
        System.out.println("");
        baraja.barajar();
        baraja.siguienteCarta(carta);
        baraja.cartasDisponibles(carta);
        baraja.darCartas();
        baraja.mostrarBaraja();
 }
    
    
}
