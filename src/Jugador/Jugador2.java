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
public class Jugador2 implements Jugador {

    @Override
    public void registrar(int id, String nombre, int raza) {
        listaJugador.Agregar(id, nombre, raza, 0, 0, 0);
    }
    
    @Override
    public void mostrarTurno(int id) {
       listaJugador.Mostrar(id);
    }

    @Override
    public int EnseñarRaza(int id) {
        return listaJugador.EnseñarRaza(id);
    }
    
}
