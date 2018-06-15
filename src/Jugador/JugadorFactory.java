/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class JugadorFactory implements AbstractFactory {

    @Override
    public Jugador getJugador(int type) {
        try {
            switch (type) {
                case 1:
                    return new Jugador1();
                case 2:
                    return new Jugador2();

            }
            return null;
        } catch (InputMismatchException e) {
            System.err.println("Por favor, ingrese una de las opciones.");

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

    @Override
    public Centro_de_Mando getCentro_De_Mando(int type) {
        return null;
    }

}
