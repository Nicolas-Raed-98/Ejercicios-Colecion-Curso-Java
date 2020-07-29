
package Ejercicio12;


public class MainAnimal {


    public static void main(String[] args) {
       Animales perro = new Perro("Stich","Carnivoro",15,"Doberman");
       perro.Alimentarse();
       Animales perro1 = new Perro ("Teddy","Croquetas",10,"Chihuahua");
       perro1.Alimentarse();
       Animales gato = new Gato ("Pelusa","Galletas",15,"Siames");
       gato.Alimentarse();
       Animales caballo = new Caballo ("Spark","Pasto",25,"Fino");
       caballo.Alimentarse();
    }
    
}
