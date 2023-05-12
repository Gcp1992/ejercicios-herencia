package modelo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    private String color;
    private int velocidad;


    //Constructor vacio
    public Vehiculo() {
    }

    //Constructor con parametros
    public Vehiculo(String marcap, String modelop, double preciop, String colorp) {
        this.marca = marcap;
        this.modelo = modelop;
        this.precio = preciop;
        this.color=colorp;
    }

    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int velocidad) {
        this.velocidad += velocidad;
    }

    public void frenar(int velocidad) {
        this.velocidad -= velocidad;
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }
}








