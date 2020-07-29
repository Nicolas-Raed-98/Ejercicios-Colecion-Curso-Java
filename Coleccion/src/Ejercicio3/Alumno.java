
package Ejercicio3;

public class Alumno {
    String nombre;
    String apellido;
    long numerolegajo;
    String sexo;
    int notafinal;
   
    public Alumno(){
    }
    
    public Alumno(String nombre, String Apellido, long numerolegajo,int NotaFinal){
    this.nombre=nombre;
    this.apellido=Apellido;
    this.numerolegajo=numerolegajo;
    this.notafinal=NotaFinal;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getNumerolegajo() {
        return numerolegajo;
    }

    public void setNumerolegajo(long numerolegajo) {
        this.numerolegajo = numerolegajo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", numerolegajo=" + numerolegajo + ", sexo=" + sexo + '}';
    }

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

    
    
    
}
