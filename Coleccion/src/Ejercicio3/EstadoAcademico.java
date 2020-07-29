
package Ejercicio3;

import java.util.Comparator;


class EstadoAcademico implements Comparator <Alumno>{

    @Override
    public int compare(Alumno o1, Alumno o2) {
        if (o1.getNotafinal()>o2.getNotafinal()){
                return 1;
        }
        else if(o1.getNotafinal()<o2.getNotafinal()){
            
                return -1;
            }
        
        else {
                return 0;
        }
                
        
    }
    
    public int compararApellidos (Alumno o1, Alumno o2){
        if (o1.getApellido().compareTo(o2.getApellido())>0){
            return 1;
        }
        else if (o1.getApellido().compareTo(o2.getApellido())<0){
            return -1;
        }
        else{
            return 0;
        }
    
    }
    
    public int compararNombres(Alumno o1, Alumno o2){
        if(o1.getNombre().compareTo(o2.getNombre())>0){
            return 1;
        }
         else if (o1.getNombre().compareTo(o2.getNombre())<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    
}


