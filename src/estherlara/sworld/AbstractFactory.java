/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;

/**
 *
 * @author User
 */
public interface AbstractFactory {

    Jugador getJugador(int type);

    Edificacion getEdificacion(int type);

    Raza getRaza(int type);

    Vehiculo getVehiculo(int type);

    Milicia getMilicia(int type);

}
