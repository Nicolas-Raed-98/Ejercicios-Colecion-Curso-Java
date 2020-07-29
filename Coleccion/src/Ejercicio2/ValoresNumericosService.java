
package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ValoresNumericosService {
    Scanner leer = new Scanner(System.in);
    List<Integer>listaIntegerValores = new ArrayList();
    
    public void leerValroes(){
        int valor=0;
        do{
             valor=leer.nextInt();
            if (valor!=-99){
                listaIntegerValores.add(valor);
            }
            
        }while (valor!=-99);
        
    }
    
    private int calcularSuma(){
        Iterator<Integer> iterator = listaIntegerValores.iterator();
        int suma=0;
            while (iterator.hasNext()){
                suma+=iterator.next();
                
            }
           return suma;
    }
    private float calcularMedia(){
        if (listaIntegerValores.size()==0){
        return 0;
        }
       float suma=calcularSuma();
       return suma/listaIntegerValores.size();
    }
    public void mostrarResultados(){
        int suma=calcularSuma();
        float media=calcularMedia();
        int c=0;
        for (int m : listaIntegerValores){
            if (m>media){
            c++;
            }
        }
            System.out.println("La suma es "+suma);
            System.out.println("La media es "+media );
            System.out.println("La cantidad de valores superiores a la media son "+c);
    }
}
