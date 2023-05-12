package presentacion;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;

public class testFiguras {
    public static void main(String[] args) {
        Figura figura = new Figura(10, 20);
        Circulo circulo = new Circulo(30, 40, 5.0);
        Rectangulo rectangulo = new Rectangulo(50, 60, 8.0, 6.0);

        System.out.println(figura.posicion());
        System.out.println(circulo.posicion());
        System.out.println(rectangulo.posicion());
    }
}