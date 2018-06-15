/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Jugador.Jugador;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;
import java.util.InputMismatchException;

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
        try {
            switch (type) {
                case 1:
                    return new Escuadrones();
                case 2:
                    return new Especialistas();
            }
        } catch (InputMismatchException e) {
            System.err.println("\033[31mPor favor, ingrese una de las opciones.");

        }
        return null;
    }

    @Override
    public Centro_de_Mando getCentro_De_Mando(int type) {
        return null;
    }
}
