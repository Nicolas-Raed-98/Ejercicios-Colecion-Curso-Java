/*Implemente un programa para la Librería Yennifer haciendo
uso de listas. Para ello, se debe crear una clase llamada Libro
que guarde la información de cada uno de los libros de una Biblioteca.
La clase Libro debe guardar el título del libro, autor, número de 
ejemplares del libro y número de ejemplares prestados. La clase 
contendrá además los siguientes métodos: 
• Constructor por defecto. 
• Constructor con parámetros. 
• Métodos Setters/getters 
• Método préstamo que incrementa el atributo correspondiente 
cada vez que se realice un préstamo del libro. No se podrán prestar
libros de los que no queden ejemplares disponibles para prestar.
Devuelve true si se ha podido realizar la operación y false en caso
contrario.
• Método devolución que decremente el atributo correspondiente 
cuando se produzca la devolución de un libro. No se podrán devolver 
libros que no se hayan prestado. Devuelve true si se ha podido
realizar la operación y false en caso contrario. 
• Método toString para mostrar los datos de los libros.
*/
package Ejercicio5;





public class LibroMain {

  public static void main(String[] args) {
      LibroService service = new LibroService();
      Libro libros = new Libro();
     // List<Libro>listaLibros = new ArrayList();
      service.agregarLibro(libros);
      libros.toString();
      service.prestamoLibros();
      service.devolucionLibro();
      service.mostrarLista();
      
    }
    
}
