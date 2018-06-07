/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import static Jugador.ConstructorLista.listaJugador;

/**
 *
 * @author User
 */
public class Jugador1 implements Jugador {



    @Override
    public void registrar(int id, String nombre, int raza) {
        listaJugador.Agregar(id, nombre, raza, 10000, 10000, 10);

    }

    @Override
    public void mostrarTurno(int id) {
       listaJugador.Mostrar(id);
    }

}
