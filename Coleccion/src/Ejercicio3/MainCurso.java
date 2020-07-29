/*Se necesita implementar un sistema en el que se puedan cargar 
alumnos, a los cuales los caracterizan el nombre y apellido, 
el número de legajo, el sexo, condición (regular o condicional)
y la nota final. Estos alumnos se deben cargar en una asignatura
, llamada Curso Programación Egg. Implemente las clases y métodos
necesarios para esta situación, teniendo en cuenta lo que se pide
a continuación:
• Mostrar en pantalla todos los alumnos que se encuentren
en la asignatura. 
• Mostrar en pantalla los alumnos que se encuentren como 
condicional y su cantidad.
• Ordenar los alumnos de acuerdo a su nota (de mayor a menor)
y mostrarlo en pantalla. 
• Ordenar los alumnos de acuerdo a su nota (de menor a mayor) 
y mostrarlo en pantalla. 
• Ordenar los alumnos por nombre y apellido y mostrarlo en 
pantalla */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;



public class MainCurso {

 
    public static void main(String[] args) { 
       
       
       Alumno alumnos = new Alumno();
       CursoService service = new CursoService("Programacion Egg");
       List<Alumno>listaAlumnos = new ArrayList();
       service.agregarAlumno(listaAlumnos, alumnos);
       service.mostrarAlumnos(listaAlumnos, alumnos);
       service.mostrarCondicionNota(listaAlumnos,alumnos);
       service.ordenNotaMayor(listaAlumnos,alumnos);
       service.ordenarPorNombre(listaAlumnos, alumnos);
       service.ordenarPorApellido(listaAlumnos, alumnos);
    }
}
