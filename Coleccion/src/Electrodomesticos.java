
public class Electrodomesticos {
    int precioBase;
    String consumoEnergetico;
    int peso;
    String color;
    
    public Electrodomesticos(int precioBase, String cconsumoEnergetico, int peso, String color){
    this.precioBase=precioBase;
    this.consumoEnergetico=consumoEnergetico;
    this.peso=peso;
    this.color=color;
    }
    public Electrodomesticos(int precio, int peso){
    this.precioBase=100;
    this.peso=5;
    }
}
