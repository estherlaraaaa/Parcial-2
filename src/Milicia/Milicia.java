/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author User
 */
public interface Milicia {
    void entrenar();
    void mostrar(int idjugador);  
    void crear(int idjugador); 
    void usar(int id); 
    void mostrarA(int idjugador);
    void ponerMira(int id, int atacando, int mira ); 
    void atacar(int idjugador); 
}
