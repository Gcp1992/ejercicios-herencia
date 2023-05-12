package presentacion;

import modelo.Barco;
import modelo.Coche;
import modelo.Vehiculo;

public class testVehiculos {

    public static void main(String[] args) {
        // Instancia y métodos de Vehiculo
        Vehiculo vehiculo = new Vehiculo("Ford", "Focus", 15000.0, "Rojo");
        vehiculo.acelerar(50);
        vehiculo.frenar(20);
        System.out.println("Velocidad actual del vehiculo: " + vehiculo.getVelocidad());

        // Instancia y métodos de Coche
        Coche coche = new Coche("Toyota", "Corolla", 20000.0, "Azul", 5);
        coche.acelerar(70);
        coche.frenar(30);
        System.out.println("Velocidad actual del coche: " + coche.getVelocidad());
        System.out.println("Numero de puertas del coche: " + coche.getNumPuertas());

        // Instancia y métodos de Barco
        Barco barco = new Barco("Yamaha", "F250", 50000.0, "Blanco", 8);
        barco.acelerar(20);
        barco.frenar(10);
        System.out.println("Velocidad actual del barco: " + barco.getVelocidad());
        System.out.println("Número de mastiles del barco: " + barco.getNumMastiles());
    }
}



