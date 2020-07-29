
package Ejercicio7;


public class Alumno implements Comparable<Alumno>{
    String Apellido;
    String Nombre;
    long DNI;
    
    public Alumno(){
    }
    public Alumno(String Nombre,String Apellido, long DNI){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.DNI=DNI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    @Override
    public int compareTo(Alumno o) {
       if (o.Nombre.compareTo(this.Nombre)==0 && 
               o.Apellido.compareTo(this.Apellido)==0 
               ){
           return 0;
        }
       if (o.Apellido.compareTo(this.Apellido)==0 ){
           return o.Nombre.compareTo(this.Nombre); 
       }
       return o.Apellido.compareTo(this.Apellido);
    }
    
    
    
}
