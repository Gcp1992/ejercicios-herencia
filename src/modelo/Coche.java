package modelo;

public class Coche extends Vehiculo{
    private int numPuertas;

    public Coche(String marca, String modelo, double precio, String color, int numPuertasp) {
        super(marca, modelo, precio, color);
        this.numPuertas = numPuertasp;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
