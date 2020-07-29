package Ejercicio4;

import java.util.Scanner;

/*Crear una clase llamada ListaCantantesFamosos que disponga
de un atributo ArrayList que contenga objetos de tipo CantanteFamoso.
La clase debe tener un método que permita añadir objetos 
de tipo CantanteFamoso a la lista. La clase CantanteFamoso
tendrá como atributos el nombre (String) y discoConMasVentas (
String), y los métodos getters y setters.  
14  
Se debe además crear una clase Test con el método main que 
inicialice un objeto ListaCantantesFamosos y agregue manualmente
5 objetos de tipo CantanteFamoso a la la lista. Luego, usando un 
Iterator mostrar los nombres de cada cantante y su disco con más 
ventas por pantalla.   Además, se debe pedir al usuario un nombre
y disco con más ventas de otro cantante famoso, y una vez introducidos
los datos mostrar la lista actualizada usando también un Iterator.
Una vez mostrada la lista actualizada, se debe dar opción a elegir 
entre volver a introducir los datos de otro cantante o salir del programa.
Se podrán introducir tantos datos de cantantes como se desee. Para ello use
un bucle while que le dé la opción de elegir al usuario
package Ejercicio4;*/


public class Test {

    
    public static void main(String[] args) {
        
        ListaCantantesFamosos cantantes = new ListaCantantesFamosos();
        CantanteFamoso c1 = new CantanteFamoso("Paulo Londra");
        CantanteFamoso c2 = new CantanteFamoso("Morat");
        CantanteFamoso c3 = new CantanteFamoso("Andres Calamaro");
        CantanteFamoso c4 = new CantanteFamoso("LPDA");
        CantanteFamoso c5 = new CantanteFamoso("Tini");
        DiscosVendidos d1 = new DiscosVendidos(100, "Tal vez");
        DiscosVendidos d2 = new DiscosVendidos(50, "Colombia");
        DiscosVendidos d3 = new DiscosVendidos(500, "Adios");
        DiscosVendidos d4 = new DiscosVendidos(1000, "Loco");
        DiscosVendidos d5 = new DiscosVendidos(850, "Fresa");
        DiscosVendidos d6 = new DiscosVendidos(180, "Hola");
        DiscosVendidos d7 = new DiscosVendidos(900, "Nicolas");
        DiscosVendidos d8 = new DiscosVendidos(1500, "Hasta luego");
        DiscosVendidos d9 = new DiscosVendidos(1001, "Ayer");
        DiscosVendidos d10 = new DiscosVendidos(1900, "Oye");
       cantantes.agregarCantantes(c1);
       cantantes.agregarCantantes(c2);
       cantantes.agregarCantantes(c3);
       cantantes.agregarCantantes(c4);
       cantantes.agregarCantantes(c5);
       cantantes.nuevoDisco(c1, d1);
       cantantes.nuevoDisco(c2, d2);
       cantantes.nuevoDisco(c3, d3);
       cantantes.nuevoDisco(c4, d4);
       cantantes.nuevoDisco(c5, d5);
       cantantes.nuevoDisco(c1, d6);
       cantantes.nuevoDisco(c2, d7);
       cantantes.nuevoDisco(c3, d8);
       cantantes.nuevoDisco(c4, d9);
       cantantes.nuevoDisco(c5, d10);
       cantantes.mostrarLista();
        
       Scanner leer = new Scanner(System.in);
       String nuevoCantante="";
         while(nuevoCantante.compareTo("Salir")!=0){
        System.out.println("Ingrese otro cantante famoso con su disco con mas ventas");
        nuevoCantante=leer.next();
        if(nuevoCantante.compareTo("Salir")==0){
        break;
        }
        String nombreDisco=leer.next();
        int ventasDisco=leer.nextInt();
        CantanteFamoso cnuevo = new CantanteFamoso(nuevoCantante);
        DiscosVendidos dnuevo = new DiscosVendidos(ventasDisco,nombreDisco);
        cantantes.agregarCantantes(cnuevo);
        cantantes.nuevoDisco(cnuevo, dnuevo);
        cantantes.mostrarLista();
         }
     
       
    }
    
    
}
