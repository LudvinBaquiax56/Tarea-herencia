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
public class VehiculoCarga extends Vehiculo implements Movimiento {

    public VehiculoCarga(int cantidadGalones, int NoPasajeros, int VelocidadMaxima, int aceleracion) {
        super("Diesel", cantidadGalones, NoPasajeros, VelocidadMaxima, aceleracion);
    }

    @Override
    public void funcionVehiculo() {
        System.out.println("Puedo transportar cargas muy pesadas ");
    }

    @Override
    public void girarDerecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void girarIzquierda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" + "combustible=" + super.getCombustible() + ", cantidadGalones="
                + super.getCantidadGalones() + ", NoPasajeros=" + super.getNoPasajeros()
                + ", VelocidadMaxima=" + super.getVelocidadMaxima() + ", aceleracion=" + super.getAceleracion() + '}';
    }

}
