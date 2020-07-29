
package Ejercicio7;


public class MainVotacion {

    
    public static void main(String[] args) throws Exception {
        
        Simulador simulador = new Simulador();
        
        simulador.nombresYApellidosAleatorios();
        simulador.crearAlumnos(10);
        simulador.mostrarAlumnos();
        simulador.ordenarLista();
        simulador.mostarListaOrdenada();
        simulador.simularVotos();
        simulador.recuentoVotos();
        simulador.facilitadores();
        
        
    }
    
}
