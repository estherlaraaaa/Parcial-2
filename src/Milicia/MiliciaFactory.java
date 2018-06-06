/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;

/**
 *
 * @author User
 */
public class MiliciaFactory implements AbstractFactory {

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
        return null;
    }

    @Override
    public Milicia getMilicia(int type) {
        switch (type) {
            case 1:
                return new Escuadrones();
            case 2:
                return new Especialistas();
        }
        return null;
    }
}
