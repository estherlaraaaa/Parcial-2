/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Raza.Raza;
import estherlara.sworld.AbstractFactory;

/**
 *
 * @author User
 */
public class VehiculoFactory implements AbstractFactory {

    @Override
    public Jugador getJugador(int type) {
        return null;
    }

    @Override
    public Edificacion getEdificacion(int type) {
        return null;
    }

    @Override
    public Raza getRaza(int type) {
        return null;
    }

    @Override
    public Vehiculo getVehiculo(int type) {
        switch (type) {
            case 1:
                return new Tanque();
            case 2:
                return new Avion();
            
        }
        return null;
    }

    @Override
    public Milicia getMilicia(int type) {
        return null;
    }
    
}