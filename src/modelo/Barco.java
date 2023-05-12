package modelo;

public class Barco extends Vehiculo{
    private int numMastiles;

    public Barco(String marca, String modelo, double precio, String color, int numMastiles) {
        super(marca, modelo, precio, color);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    //Sobreescritura de los métodos acelerar y frenar de la super clase Vehiculo
    @Override
    public void acelerar(int velocidad) {
        super.acelerar(velocidad);
        System.out.println("El barco ha aumentado su velocidad a " + this.getVelocidad() + " nudos.");
    }

    @Override
    public void frenar(int velocidad) {
        super.frenar(velocidad);
        System.out.println("El barco ha disminuido su velocidad a " + this.getVelocidad() + " nudos.");
    }
}
