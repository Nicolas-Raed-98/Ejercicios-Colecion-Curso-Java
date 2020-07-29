
package Ejercicio7;

public class Recuento {
    String key;
    int cantidadDeVotos;
    
    public Recuento(String key, int cantidadDeVotos){
        this.key=key;
        this.cantidadDeVotos=cantidadDeVotos;
    
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }
    
}
