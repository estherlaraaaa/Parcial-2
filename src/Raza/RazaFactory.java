/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Jugador.Jugador;
import Jugador.Jugador1;
import Jugador.Jugador2;
import Milicia.Milicia;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;

/**
 *
 * @author User
 */
public class RazaFactory implements AbstractFactory {

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
        switch (type) {
            case 1:
                return new Soldados();
            case 2:
                return new Duende();

        }
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
