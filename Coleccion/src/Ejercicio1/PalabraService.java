
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;


public class PalabraService {
    List<String> listaStringPalabras = new ArrayList();
    
    
    public void AgregarPalabra (String palabra){
        int posicion=0;
        for (String s : listaStringPalabras){
           if  (s.compareTo(palabra)>=0){
               break;
           }
           posicion++;
        }
        listaStringPalabras.add(posicion,palabra);     
    }
    
    public void MostrarElementos(int lon){
        int c=0;
        for (String s : listaStringPalabras){
            if (s.length()==lon){
                System.out.println(s);
                c++;
            }
            
        }
         System.out.println("La cantidad de palabras con la misma longitud son: "+c+" : \n");
    }
    public void ImprimirLista(){
        for (String s : listaStringPalabras){
            System.out.println(s);
        }
    }
}
