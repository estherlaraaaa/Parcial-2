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
public class Centro_de_Mando implements Edificacion {

    @Override
    public void crear(int idjugador) {
        listaEdificacion.Agregar(1, "Centro de mando",10000, 3, idjugador );
    }

    @Override
    public void mostrar(int id) {
        listaEdificacion.Mostrar(id);
    }
    
}
