
package Ejercicio11;


public class EdificioOficinas implements Edificio{
    int cantidadDeOficinas;
    int superficieOficina;
    public EdificioOficinas(int cantidadDeOficinas, int superficieOficina){
        this.cantidadDeOficinas=cantidadDeOficinas;
        this.superficieOficina=superficieOficina;
    }

    @Override
    public String toString() {
        return "EdificioOficinas{" + "cantidadDeOficinas=" + cantidadDeOficinas + ", superficieOficina=" + superficieOficina + '}';
    }

    
    
    public int getCantidadDeOficinas() {
        return cantidadDeOficinas;
    }

    public void setCantidadDeOficinas(int cantidadDeOficinas) {
        this.cantidadDeOficinas = cantidadDeOficinas;
    }

    public int getSuperficieOficina() {
        return superficieOficina;
    }

    public void setSuperficieOficina(int superficieOficina) {
        this.superficieOficina = superficieOficina;
    }
    
    @Override
    public int getSuperficieEdificio() {
        return getSuperficieOficina();
    }
    
}
