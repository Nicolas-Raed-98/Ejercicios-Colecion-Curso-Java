// CLASE HIJA GATO

package Ejercicio12;


public class Gato extends Animales{
        
     String nombre;
    String alimentacion;
    int edad;
    String raza;
    public Gato(String nombre, String alimentacion, int edad, String raza){
        this.nombre=nombre;
        this.alimentacion=alimentacion;
        this.edad=edad;
        this.raza=raza;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Alimentarse() {
        System.out.println(getNombre()+" se alimenta de "+getAlimentacion());
    }
}


