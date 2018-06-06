/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import Jugador.Jugador;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;

/**
 *
 * @author User
 */
public class EdificacionFactory implements AbstractFactory {

    @Override
    public Jugador getJugador(int type) {
        return null;
    }

    @Override
    public Edificacion getEdificacion(int type) {
        switch (type) {
            case 1:
                return new RecolectarR1();
            case 2:
                return new RecolectarR2();
            case 3:
                return new GenerarR();
            case 4:
                return new Entrenamiento();
            case 5:
                return new Diddea();
            case 6:
                return new GrupoQ();
            case 7:
                return new Centro_de_Mando();

        }
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
