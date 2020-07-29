
package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CantanteFamoso{
 String nombre;
 
 public CantanteFamoso(String nombre){
 this.nombre=nombre;
 }
 
 private List<DiscosVendidos>listaDiscosVendidos = new ArrayList();
 
    public void agregarDisco(DiscosVendidos disco){
        listaDiscosVendidos.add(disco);
    
    }
    public DiscosVendidos discoMasVendido(){
        Iterator<DiscosVendidos> iterator = listaDiscosVendidos.iterator();
        int cantidadVendida=0;
        DiscosVendidos discosConMasVentas=null;
        while(iterator.hasNext()){
           DiscosVendidos disco = iterator.next();
            if (disco.cantidadVendida>cantidadVendida){
                cantidadVendida=disco.cantidadVendida;
                discosConMasVentas=disco;
            
            }
        }
        return discosConMasVentas;
    }
 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
 
 
    
    
}
