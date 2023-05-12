package modelo;

//Clase Rectángulo que hereda de la clase Figura
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(int x, int y, double ancho, double alto) {
        //Recogemos los el valor de los parámetros del constructor padre
        super(x, y);
        //Propiedad propia de Rectangulo
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    //Sobreescribimos el método posicion()
    @Override
    public String posicion() {
        return super.posicion() + ", Ancho: " + ancho + ", Alto: " + alto;
    }
}
