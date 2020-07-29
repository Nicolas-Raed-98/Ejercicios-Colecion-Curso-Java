
package Ejercicio7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.UUID;


public class Simulador {
    
    List<String>listanombre = new ArrayList();
    List<String>listaapellido = new ArrayList();
    List<Long>listaDNI = new ArrayList();
    List<Alumno>listaAlumnos = new ArrayList();
    TreeSet<Alumno>ordenarAlumno = new TreeSet<Alumno>();
    HashSet<Voto> votos = new HashSet<Voto>();
    HashMap<String,Integer> recuentoVotos=new HashMap<String,Integer>();
    TreeSet<Recuento> ordenarVotos=new TreeSet<Recuento>();
    public void nombresYApellidosAleatorios(){
       for (int i=0 ; i<10 ; i++){
         Random r1 = new Random();
         String nombre=UUID.randomUUID().toString();
         listanombre.add(nombre);
         
       }
       for (int i=0 ; i<=10 ; i++){
          Random r1 = new Random();
         String apellido=UUID.randomUUID().toString();
         listaapellido.add(apellido);
       }    
       for (int i=0 ; i<=10 ; i++){
          Random r1 = new Random();
          long DNI;
           DNI = (long) ((Math.random()*99999999));
          
          listaDNI.add(DNI);
       }
       
    }
    public void crearAlumnos(int cantidad){
        for(int i=0 ; i<=cantidad ; i++){
            int indice=generarIndiceAleatorio();
            int indiceApellido=generarIndiceAleatorio();
            int indiceDNI=generarIndiceAleatorio();
           String Nombre = listanombre.get(indice);
           String Apellido = listaapellido.get(indiceApellido);
           long DNI = listaDNI.get(indiceDNI);
            listaAlumnos.add(new Alumno(Nombre,Apellido,DNI));
        }      
    }
    public void mostrarAlumnos(){
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while(iterator.hasNext()){
           Alumno alumno = iterator.next();
            System.out.println(alumno.getNombre()+" , "+alumno.getApellido()+" , "+alumno.getDNI());
        }
    }
    private int generarIndiceAleatorio(){
         Random r = new Random();
         return r.nextInt(listanombre.size());
    }
    
    public void ordenarLista(){
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while(iterator.hasNext()){
           Alumno alumno = iterator.next();
          ordenarAlumno.add(alumno);
        }
       
        
    }
    public void mostarListaOrdenada(){
     for (Alumno i : ordenarAlumno){
            System.out.println(i.getNombre()+" , "+i.getApellido()+" , "+i.getDNI());
        }
    }
    
    public void simularVotos() throws Exception{
        
        Iterator<Alumno> iterator = ordenarAlumno.iterator();
        while(iterator.hasNext()){
           Alumno alumno = iterator.next();
            for(int i=0 ; i<3 ; i++){
                int indiceVotado=generarIndiceAleatorio();
                Alumno postulante = (Alumno) ordenarAlumno.toArray()[indiceVotado];
                if(alumno.compareTo(postulante)!=0){
                    votos.add(new Voto(alumno,postulante));
                }
           }
        }
    }
    public void recuentoVotos(){
        Iterator<Voto> iterator = votos.iterator();
        while(iterator.hasNext()){
           Voto voto = iterator.next();
           String key=voto.votado.getNombre()+" , "+voto.votado.getApellido();
            if (recuentoVotos.containsKey(key)){
                recuentoVotos.put(key,recuentoVotos.get(key)+1);
                
            }
            else{
                 recuentoVotos.put(key,1);
            }
        }  
    
    }
    public void ordenarVotados(){
        Iterator iterador = recuentoVotos.entrySet().iterator();
    
         Map.Entry voto;
            while (iterador.hasNext()) {
                voto = (Map.Entry) iterador.next();
           ordenarVotos.add(new Recuento((String)voto.getKey(),(int)voto.getValue()));
    
        }
    }
    public void facilitadores(){
        int c=0;
        System.out.println("Los"
                + " facilitadores son:");
        for (Recuento i : ordenarVotos){
            System.out.println(i.key+" , "+i.cantidadDeVotos);
            c++;
            if (c==4){
                break;
            }
            
            
        
        }
        
    
    }
}    
