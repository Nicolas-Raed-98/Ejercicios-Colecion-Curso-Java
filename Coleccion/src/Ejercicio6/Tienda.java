
package Ejercicio6;


public class Tienda {
    float precio;
    String codigo;
    public Tienda(){
    
    }
    public Tienda (float precio, String codigo){
    this.precio=precio;
    this.codigo=codigo;
   
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
