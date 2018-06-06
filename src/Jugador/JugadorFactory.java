/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Edificacion.Edificacion;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;

/**
 *
 * @author User
 */
public class JugadorFactory implements AbstractFactory {

    @Override
    public Jugador getJugador(int type) {
        switch (type) {
            case 1:
                return new Jugador1();
            case 2:
                return new Jugador2();
            
        }
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
        return null;
    }

    @Override
    public Milicia getMilicia(int type) {
        return null;
    }
    
}