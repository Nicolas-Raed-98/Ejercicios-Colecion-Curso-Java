
package Ejercicio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Baraja {
    ArrayList<Carta> mazo;
    String [] palo = {"oro","espada","copa","basto"};
    public Baraja(){
        mazo=new ArrayList<>();
        for(int i=0 ; i<4 ; i++){
            String p = palo[i];
            for(int j=1 ; j<=12 ; j++){
                if((j==8)||(j==9)){
                    continue;
                }
                mazo.add(new Carta(j,p));
            }
        }
    }
    
    public void barajar(){        
        Collections.shuffle(mazo);
        System.out.println(mazo);
    }

    public void siguienteCarta(Carta x){
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el numero de la carta");
         int numeroElegido=leer.nextInt();
         System.out.println("Ingrese el palo de la carta");
         String paloElegido=leer.next();
         int c=0;
         int j=mazo.size();
         
        Iterator<Carta> iterator = mazo.iterator();
        while (iterator.hasNext()){
            Carta carta = iterator.next();
            c++;
           
            if (carta.getNumero()== numeroElegido && carta.getPalo().equals(paloElegido)){
               if(c==j){
                   System.out.println("La carta "+carta.getNumero()+" de "+carta.getPalo()+" es la ultima del mazo");
                   break;
               }
                System.out.println(mazo.get(c));  
                break;
            }
            
            
            
        }
    }
    public void cartasDisponibles(Carta x){
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija el numero de la carta");
         int numeroElegido=leer.nextInt();
         System.out.println("Ingrese el palo de la carta");
         String paloElegido=leer.next();
         int c=0;
         int j=mazo.size();
         
        Iterator<Carta> iterator = mazo.iterator();
        while (iterator.hasNext()){
            Carta carta = iterator.next();
            c++;
           
            if (carta.getNumero()== numeroElegido && carta.getPalo().equals(paloElegido)){
               if(c==j){
                   System.out.println("La carta "+carta.getNumero()+" de "+carta.getPalo()+" es la ultima del mazo");
                   break;
               }
               int cartasDisponibles=(j-c);
                System.out.println("Queda por repartir: "+cartasDisponibles);  
                break;
            }
        }

    }
    
    public void darCartas(){
        int cantidad;
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cartas que quiere retirar");
        cantidad=leer.nextInt();
        for (Carta i : mazo) {
            if(cantidad>mazo.size()){
                System.out.println("No hay esa cantidad de cartas");
                break;
            }
            mazo.add(mazo.remove(cantidad));
        }
       
    }        
    
    public void mostrarBaraja(){
        for (Carta i : mazo) {
            System.out.println(i);
        }
    }
    
    
        
        
        
            
        
    
    
    
}
