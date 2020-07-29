

package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class CursoService {
    Scanner leer = new Scanner(System.in);
    String curso="";
    int notafinal;
    List<Alumno> listaAlumnos = new ArrayList();
    public CursoService(String curso){
    this.curso=curso;
    }  
    
      
    public List<Alumno> agregarAlumno (List<Alumno> listaAlumnos,Alumno alumnos){
        
        listaAlumnos.add(new Alumno("Nicolas", "Raed", 0001,7));
        listaAlumnos.add(new Alumno("Juan", "Sosa", 0002,5));
        listaAlumnos.add(new Alumno("Martina", "Perez", 0003,9));
        
        return listaAlumnos;
    
    }
    
    public void mostrarAlumnos (List<Alumno> listaAlumnos,Alumno alumnos){
        for  (Alumno a : listaAlumnos){
            System.out.print(a.getNombre()+" , ");
            System.out.println(a.getApellido());
            System.out.println("Numero de legajo: "+a.getNumerolegajo());
            System.out.println("Nota final: "+a.getNotafinal());
        
        } 
    }
    public void mostrarCondicionNota(List<Alumno> listaAlumnos,Alumno alumnos){   
        System.out.println("Estado Academico");
        int c=0;
    
        for(Alumno a : listaAlumnos){
            if (a.getNotafinal()>=7){
            System.out.println(a.getApellido()+" alumno regular con "+a.getNotafinal()); } 
            else {
                 System.out.println(a.getApellido()+" alumno condicional con "+a.getNotafinal());
                 c++;
            }
                
        }
        System.out.println("La cantidad de alumnos condicionales son "+c);
    }  
    
    public void ordenNotaMayor(List<Alumno> listaAlumnos,Alumno alumnos){
     Collections.reverse(listaAlumnos);
        System.out.println("Alumnos ordenados de Mayor a Menor");
        for(Alumno a : listaAlumnos){  
            System.out.println(a.getApellido()+" "+a.getNotafinal()); } 
            
                 
     Collections.sort(listaAlumnos, new EstadoAcademico()); 
        System.out.println("Alumnos ordenados de Menor a Mayor");  
        for(Alumno a : listaAlumnos){
        System.out.println(a.getApellido()+" "+a.getNotafinal());
        }
                
    }
    public void ordenarPorNombre(List<Alumno> listaAlumnos,Alumno alumnos){
        Collections.reverse(listaAlumnos); 
        System.out.println("Alumnos ordenados por nombre");  
        for(Alumno a : listaAlumnos){
        System.out.println(a.getNombre());
        }
    
    }
    public void ordenarPorApellido(List<Alumno> listaAlumnos,Alumno alumnos){
        Collections.reverse(listaAlumnos); 
        System.out.println("Alumnos ordenados por nombre");  
        for(Alumno a : listaAlumnos){
        System.out.println(a.getApellido());
        }
    
    }
    
       
        
    
    
}    

   