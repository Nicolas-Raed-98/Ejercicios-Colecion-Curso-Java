
package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaCantantesFamosos {
    
    List<CantanteFamoso>listacantantesfamosos = new ArrayList();
    
   
    public void nuevoDisco(CantanteFamoso cantante, DiscosVendidos disco){
        Iterator<CantanteFamoso> iterator = listacantantesfamosos.iterator();
        while(iterator.hasNext()){
           CantanteFamoso c=iterator.next();
           if (c.nombre.compareTo(cantante.nombre)==0){
               c.agregarDisco(disco);
           
           }          
        }   
    }

    public void agregarCantantes(CantanteFamoso cantante) {
        
        listacantantesfamosos.add(cantante);
    }
    public void mostrarLista(){
        Iterator<CantanteFamoso> iterator = listacantantesfamosos.iterator();
        while(iterator.hasNext()){
          CantanteFamoso m =  iterator.next();
            System.out.println(m.nombre );
            System.out.println(m.discoMasVendido().nombreDisco );
            System.out.println(m.discoMasVendido().cantidadVendida );
            System.out.println(" - ");
        }
    }
    
}
