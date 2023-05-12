package modelo;


//Clase Círculo que hereda de la clase Figura
public class Circulo extends Figura{
    private double radio;

    public Circulo(int x, int y, double r) {
        //Recogemos los el valor de los parámetros del constructor padre
        super(x, y);
        //Propiedad propia de Círculo
        this.radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double r) {
        this.radio = r;
    }

    //Sobreescribimos el método posicion()
    @Override
    public String posicion() {
        return super.posicion() + ", Radio: " + radio;
    }
}
