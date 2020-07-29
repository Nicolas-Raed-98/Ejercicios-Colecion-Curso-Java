
package Ejercicio9;


public class Jugador {
    int id;
    String nombre;
    boolean estaVivo;
    
    public Jugador(int id, String nombre, boolean estaVivo){
    this.id=id;
    this.nombre="Jugador";
    this.estaVivo=estaVivo;
    } 

    public void Disparar(Revolver x){
      this.estaVivo=!x.Disparar();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    
}    

