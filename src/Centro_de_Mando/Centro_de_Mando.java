/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Centro_de_Mando;

/**
 *
 * @author User
 */
public interface Centro_de_Mando {
    void crear(); 
    void almacenar();
    void mejorar(int id); 
    void mostrarRecursos(int id); 
    void pagar(int idjugador, int recurso1, int recurso2, int recurso3); 
    void mostrarCM(int id); 
    void generador(int id, int recurso1, int recurso2, int recurso3); 
    void agarrarAtaque(int id, int mira, int ataque); 
}