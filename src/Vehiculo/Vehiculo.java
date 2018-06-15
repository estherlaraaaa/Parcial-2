/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author User
 */
public interface Vehiculo {
    void crear(int idjugador); 
    void atacar(int idjugador); 
    void mostrar(int id); 
    void ponerMira(int id, int atacando, int mira); 
    
}
