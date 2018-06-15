/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;
import Jugador.Jugador;
/**
 *
 * @author User
 */
public class Final {
    AbstractFactory factory;
    public void mostrar(int id){
        
        factory = FactoryProducer.getFactory(1);
        Jugador jugador = factory.getJugador(id);
        System.out.flush();
        System.out.println("");
        System.out.println("HAZ GANADOOOOO!!!");
        jugador.mostrarTurno(id);
        System.exit(0);
        
    }
}
