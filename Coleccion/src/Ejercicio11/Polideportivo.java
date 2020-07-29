
package Ejercicio11;


public class Polideportivo implements Edificio,InstalacionDeportiva{
    String nombre;
    int superficie;
    
    public Polideportivo(String nombre, int superficie){
        this.nombre=nombre;
        this.superficie=superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", superficie=" + superficie + '}';
    }
    
    @Override
    public int getSuperficieEdificio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
    public String getTipoDeInstalacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
