/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import Vehiculo.Camioneta;
import Vehiculo.Vehiculo;
import Vehiculo.VehiculoCarga;
import Vehiculo.VehiculoDeCarrera;

/**
 *
 * @author baquiax
 */
public class VectorVehiculos {

    Vehiculo[] vehiculos;

    public VectorVehiculos() {
        vehiculos = new Vehiculo[20];
        llenarVehiculos();
    }

    public VectorVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void llenarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            vehiculos[i] = elegirVehiculo();
        }
    }

    public void validarVehiculos() {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.print((i + 1) + ". ");
            validarVehiculo(vehiculos[i]);
            System.out.println("..........................");
        }
        
    }

    public Vehiculo elegirVehiculo() {
        int opcion = generarNumeroAleatorio();
        Vehiculo aux = null;
        switch (opcion) {
            case 0:
                aux = new VehiculoCarga(8, 2, 60, 10);
                break;
            case 1:
                aux = new VehiculoDeCarrera(20, 1, 200, 30);
                break;
            case 2:
                aux = new Camioneta(35, 30, 45, 3);
                break;
            default:
                aux = new Camioneta(35, 30, 45, 3);
        }
        return aux;
    }

    public void validarVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof VehiculoCarga) {
            System.out.println("Vehiculo de Carga");
            vehiculo.funcionVehiculo();
        } else if (vehiculo instanceof VehiculoDeCarrera) {
            System.out.println("Vehiculo de Carreras");
            vehiculo.funcionVehiculo();
        } else if (vehiculo instanceof Camioneta) {
            System.out.println("Camioneta");
            vehiculo.funcionVehiculo();
        }
    }

    public int generarNumeroAleatorio() {
        return (int) (Math.random() * 2);
    }
}
