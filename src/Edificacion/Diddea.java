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
public class Diddea implements Edificacion {



    @Override
    public void crear(int idjugador) {
        int recurso1 = 100;
        int recurso2 = 0;
        int recurso3 = 2000;
        
        listaEdificacion.Agregar(6, "Diddea ", 3000, 2, idjugador);
    }

    @Override
    public void mostrar(int id) {
        listaEdificacion.Mostrar(id);
    }
    
}
