
package Ejercicio6;

import java.util.HashMap;
import java.util.Scanner;


public class MainTienda {

    
    public static void main(String[] args) {
        HashMap<String,Float> listaProductos = new HashMap<String,Float>();
    Scanner sc = new Scanner(System.in);
    TiendaService service = new TiendaService();
    Tienda tienda = new Tienda();
    int opcionElegida = 0;
    

    while (opcionElegida != 5) {
        System.out.println("Introduce el numero de la opción que quieras:");
        System.out.println("1.- Introducir producto");
        System.out.println("2.- Modificar precio");
        System.out.println("3.- Mostrar todos los productos");
        System.out.println("4.- Eliminar producto");
        System.out.println("5.- Salir");
        opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1:
                System.out.println("Introduce el códido del producto:");
                tienda.setCodigo(sc.next()); 
                System.out.println("Introduce el precio del producto:");
                tienda.setPrecio(sc.nextFloat());
                service.guardarProducto(tienda.getCodigo(),tienda.getPrecio(), listaProductos);
                break;
            case 2:
                System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
               tienda.setCodigo(sc.next() );
                service.modificaPrecio(tienda.getCodigo(), listaProductos);
                break;
            case 3:
                service.mostrarProductos(listaProductos);
                break;
            case 4:
                System.out.println("Introduce el códido del producto que quieres eliminar:");
                tienda.setCodigo(sc.next());
                service.eliminaProducto(tienda.getCodigo(), listaProductos);
                break;
            case 5:
                break;   // Si la opcion es 5 no se hace nada 
            default:
                System.out.println("Tienes que introducir una opción valida");
        }

    }
}
    }
    

