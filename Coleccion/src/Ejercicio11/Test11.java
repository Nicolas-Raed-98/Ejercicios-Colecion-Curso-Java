
package Ejercicio11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test11 {

    public static void main(String[] args) {
          List<Polideportivo> polideportivos = new ArrayList();
          List<EdificioOficinas> oficinas = new ArrayList();
          
          for (int i = 0; i <= 2; i++) {
            polideportivos.add(new Polideportivo("Polideportivo "+i,500));
        }
          for (int i = 0; i <=1; i++) {
            oficinas.add(new EdificioOficinas(150,250));
        }
          Iterator<Polideportivo> iterator = polideportivos.iterator();
        while(iterator.hasNext()){
            Polideportivo polideportivo = iterator.next();
            System.out.println(polideportivo.toString());
        }
          Iterator<EdificioOficinas> iteratorOf = oficinas.iterator();
        while(iteratorOf.hasNext()){
            EdificioOficinas oficina = iteratorOf.next();
            System.out.println(oficina.toString());
        }
    }
    
}
