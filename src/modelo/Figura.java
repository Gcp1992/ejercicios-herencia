package modelo;

public class Figura {
    //Propiedades
    private int coordenadaX;
    private int coordenadaY;

    //Constructor vacío
    public Figura() {
    }

    //Constructor
    public Figura(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }

    //Getters y Setters
    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int x) {
        this.coordenadaX = x;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int y) {
        this.coordenadaY = y;
    }

    //Método de la clase

    public String posicion() {
        return "Posición de la figura: (" + this.coordenadaX + "," + this.coordenadaY + ")";
    }
}







