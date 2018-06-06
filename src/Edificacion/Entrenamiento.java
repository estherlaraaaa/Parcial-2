/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import static Edificacion.ConstructorLista.listaEdificacion;

/**
 *
 * @author User
 */
public class Entrenamiento implements Edificacion {


    @Override
    public void crear(int idjugador) {
        int recurso1 = 1000;
        int recurso2 = 2000;
        int recurso3 = 0;
        
        listaEdificacion.Agregar(7, "Entrenamiento ", 4000, 2, idjugador);
    }

    @Override
    public void mostrar(int id) {
        listaEdificacion.Mostrar(id);
    }
    
}
