/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import Jugador.Jugador;
import Raza.Raza;
import static Vehiculo.ConstructorLista.listaVehiculo;
import static Vehiculo.ConstructorLista.listaVehiculo2;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;

/**
 *
 * @author User
 */
public class Avion implements Vehiculo {

    AbstractFactory factory;

    @Override
    public void crear(int idjugador) {

        factory = FactoryProducer.getFactory(1);
        Jugador jugador = factory.getJugador(idjugador);

        factory = FactoryProducer.getFactory(4);
        Raza raza = factory.getRaza(jugador.EnseñarRaza(idjugador));

        if (idjugador == 1) {
            listaVehiculo.Agregar("Avion", idjugador, raza.vida(1000), raza.ataque(700), raza.fase(1));
        } else {
            listaVehiculo2.Agregar("Avion", idjugador, raza.vida(1000), raza.ataque(700), raza.fase(1));
        }

    }

    @Override
    public void atacar(int idjugador) {
        if (idjugador == 1) {
            listaVehiculo.Atacar();
        } else {
            listaVehiculo2.Atacar();
        }
    }

    @Override
    public void mostrar(int id) {
        if (id == 1) {
            listaVehiculo.Mostrar(id);
        } else {
            listaVehiculo2.Mostrar(id);
        }
    }

    @Override
    public void ponerMira(int id, int atacando, int mira) {
        if (id == 1) {
            listaVehiculo.ponerMira(id, atacando, mira);
        } else {
            listaVehiculo2.ponerMira(id, atacando, mira);
        }
    }

}
