/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

/**
 *
 * @author User
 */
public interface Edificacion {
    void crear(int idjugador); 
    void mostrar(int id); 
    void CambiarFase(int id); 
    void generadorR(int id); 
    void agarrarAtaque(int id, int mira, int ataque); 
    void mostrarMirador(int id, int turno);
}
