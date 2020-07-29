
package Ejercicio5;

import Ejercicio3.Alumno;
import Ejercicio4.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class LibroService {
    
    List<Libro>listaLibros = new ArrayList();
    
    public List<Libro> agregarLibro(Libro libros){
    listaLibros.add(new Libro("El Principito","Juan",100,50));
    listaLibros.add(new Libro("Oscuridad","Francisco",900,30));
    listaLibros.add(new Libro("Superman","Jhon",40,10));
    return listaLibros;
    }
    
    public String prestamoLibros(){
        Scanner leer = new Scanner(System.in);
        
        Iterator<Libro> iterator = listaLibros.iterator();
        int c=0;
        System.out.println("¿Que libro quiere llevar?");    
            String llevar=leer.next();
        while(iterator.hasNext()){
             Libro l=iterator.next();
            
          
          if(l.getTitulo().equals(llevar)){
              System.out.println("¿Cuantos ejemplares quiere llevar?");
              int cantidad=leer.nextInt();
              if (cantidad<l.getNumeroEjemplares()){
                  l.ejemplaresPrestados=l.ejemplaresPrestados+cantidad;
                  System.out.println("Verdadero");
              }
              else{
                  System.out.println("No hay esa cantidad de ejemplares para prestar");
                  System.out.println("Falso");;
              }
            }
              
        }    
       return llevar;
    }    
    
    public void devolucionLibro(){
            Scanner leer = new Scanner(System.in);
        
        Iterator<Libro> iterator = listaLibros.iterator();
        int c=0;
        System.out.println("¿Que libro quiere devolver?");    
            String devolucion=leer.next();
           Libro libro=null;
        while(iterator.hasNext()){
             Libro l=iterator.next();
          if (devolucion.compareTo(l.getTitulo())==0){
              libro=l;
              break;
          
          }
        }   
           if (libro!= null){
               System.out.println("Cuantos ejemplares va devolver?");
              c=leer.nextInt();
              libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-c);
              System.out.println("Verdadero");      
               
           }
           else{
               System.out.println("Ese libro no fue prestado");
               System.out.println("Falso");
           }
    
    }
    
    public void mostrarLista(){
    for (Libro l : listaLibros){
        System.out.println(l);
    
    }
    }
    
    
    
    

    

}