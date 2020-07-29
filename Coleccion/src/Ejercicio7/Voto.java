
package Ejercicio7;


public class Voto {
    Alumno votante;
    Alumno  votado;
    
    public Voto(Alumno votante, Alumno votado) throws Exception{
        if (votante.compareTo(votado)==0){
            throw new Exception("El alumno no puede votarse a sí mismo");
        }
        this.votante=votante;
        this.votado=votado;
    
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public Alumno getVotado() {
        return votado;
    }

    public void setVotado(Alumno votado) {
        this.votado = votado;
    }
    
    
}
