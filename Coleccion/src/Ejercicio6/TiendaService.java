
package Ejercicio6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class TiendaService {
    public void guardarProducto(String codigo, float precio, HashMap <String,Float> listaProductos){
    if (listaProductos.containsKey(codigo)) {
        System.out.println("No se puede introducir el producto. El código esta repetido.");
    } else {
        listaProductos.put(codigo, precio);               
    }
}

public void modificaPrecio(String codigo, HashMap<String,Float> listaProductos){
    Scanner sc = new Scanner(System.in);
    if (listaProductos.containsKey(codigo)) {
        System.out.println("Introduce el precio del producto:");
        listaProductos.put(codigo, sc.nextFloat());            
    } else {
        System.out.println("No hay ningun producto con ese código.");
    }
}
public void mostrarProductos(HashMap<String, Float> listaProductos) {
    String clave;
    Iterator<String> productos = listaProductos.keySet().iterator();
    System.out.println("Hay los siguientes productos:");
    while(productos.hasNext()){
        clave = productos.next();
        System.out.println(clave + " - " + listaProductos.get(clave));
    }        
}
public void mostrarProductos2(HashMap<String, Float> listaProductos) {
    Iterator iterador = listaProductos.entrySet().iterator();
    //Iterator<Map.Entry<String, Float>> iterador = listaProductos.entrySet().iterator();
    Map.Entry producto;
    while (iterador.hasNext()) {
        producto = (Map.Entry) iterador.next();
        //producto = iterador.next(); Si se usase tambien la otra linea comentada.
        System.out.println(producto.getKey() + " - " + producto.getValue());
    } 
}
public void eliminaProducto(String codigo, HashMap<String,Float> listaProductos) {
    if (listaProductos.containsKey(codigo)) {
        listaProductos.remove(codigo);
    } else {
        System.out.println("No hay ningun producto con ese código.");  
    }       
} 


}