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
public abstract class Vehiculo {

    private String combustible;
    private int cantidadGalones;
    private int NoPasajeros;
    private int VelocidadMaxima;
    private int aceleracion;

    /**
     * Crea un objeto de tipo Vehiculo;
     *
     * @param combustible
     * @param cantidadGalones
     * @param NoPasajeros
     * @param VelocidadMaxima
     * @param aceleracion
     */
    public Vehiculo(String combustible, int cantidadGalones, int NoPasajeros, int VelocidadMaxima, int aceleracion) {
        this.combustible = combustible;
        this.cantidadGalones = cantidadGalones;
        this.NoPasajeros = NoPasajeros;
        this.VelocidadMaxima = VelocidadMaxima;
        this.aceleracion = aceleracion;
    }

    public abstract void funcionVehiculo();

    /**
     * @return the combustible
     */
    public String getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the cantidadGalones
     */
    public int getCantidadGalones() {
        return cantidadGalones;
    }

    /**
     * @param cantidadGalones the cantidadGalones to set
     */
    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }

    /**
     * @return the NoPasajeros
     */
    public int getNoPasajeros() {
        return NoPasajeros;
    }

    /**
     * @param NoPasajeros the NoPasajeros to set
     */
    public void setNoPasajeros(int NoPasajeros) {
        this.NoPasajeros = NoPasajeros;
    }

    /**
     * @return the VelocidadMaxima
     */
    public int getVelocidadMaxima() {
        return VelocidadMaxima;
    }

    /**
     * @param VelocidadMaxima the VelocidadMaxima to set
     */
    public void setVelocidadMaxima(int VelocidadMaxima) {
        this.VelocidadMaxima = VelocidadMaxima;
    }

    /**
     * @return the aceleracion
     */
    public int getAceleracion() {
        return aceleracion;
    }

    /**
     * @param aceleracion the aceleracion to set
     */
    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "combustible=" + combustible + ", cantidadGalones="
                + cantidadGalones + ", NoPasajeros=" + NoPasajeros + ", VelocidadMaxima=" 
                + VelocidadMaxima + ", aceleracion=" + aceleracion + '}';
    }

}
