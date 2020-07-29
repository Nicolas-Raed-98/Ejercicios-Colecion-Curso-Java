 /*Crear una clase llamada Palabra que mantenga información sobre
 diferentes palabras que se le van a ir agregando por medio del 
 método add(String). Al final, el programa debe permitirnos conocer 
 el conjunto de palabras de una determinada longitud ingresada por el
 usuario. Este conjunto deberá estar ordenado alfabéticamente. 
 Crear una aplicación que muestre toda la información que disponga 
 la clase Palabra.*/
package Ejercicio1;

import java.util.Scanner;


public class MainPalabra {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        PalabraService palabraService = new PalabraService ();
            
        String entrada=leer.next();
        while (entrada.compareTo("Listo")!=0){
         palabraService.AgregarPalabra(entrada);
         entrada=leer.next();
        }
        
        System.out.println("Ingrese la longitud de las palabras que quiere ver");
        int lon=leer.nextInt();
        
        palabraService.MostrarElementos(lon);
        palabraService.ImprimirLista();
       
        
        
        
    }
    
}
