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
public class GrupoQ implements Edificacion  {


    @Override
    public void crear(int idjugador) {
        int recurso1 = 1000;
        int recurso2 = 0;
        int recurso3 = 500;
        
        listaEdificacion.Agregar(5,  "GrupoQ", 3000, 3, idjugador);
    }

    @Override
    public void mostrar(int id) {
        listaEdificacion.Mostrar(id);
    }
    
}
