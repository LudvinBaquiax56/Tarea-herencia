/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author baquiax
 */
public class Camioneta extends Vehiculo implements Movimiento {

    private static final String COMBUSTIBLE = "Diesel";

    public Camioneta(int cantidadGalones, int NoPasajeros, int VelocidadMaxima, int aceleracion) {
        super(COMBUSTIBLE, cantidadGalones, NoPasajeros, VelocidadMaxima, aceleracion);
    }

    @Override
    public void funcionVehiculo() {
        System.out.println("Puedo transportar muchas personas para un viaje largo");
    }

    @Override
    public void girarDerecha() {
        System.out.println("Hice un giro hacia la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Hice un giro hacia la izquierda");
    }

    @Override
    public String toString() {
        return "Camioneta{" + "combustible=" + super.getCombustible() + ", cantidadGalones="
                + super.getCantidadGalones() + ", NoPasajeros=" + super.getNoPasajeros()
                + ", VelocidadMaxima=" + super.getVelocidadMaxima() + ", aceleracion=" + super.getAceleracion() + '}';
    }

}
