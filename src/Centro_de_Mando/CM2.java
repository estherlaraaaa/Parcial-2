/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Centro_de_Mando;

import static Centro_de_Mando.ConstructorLista.listaCM;

/**
 *
 * @author User
 */
public class CM2 implements Centro_de_Mando {

    @Override
    public void almacenar() {
        
    }

    @Override
    public void mejorar() {
        
    }

    @Override
    public void mostrarRecursos(int id) {
       listaCM.Mostrar(id);
    }

    @Override
    public void pagar() {
        
    }

    @Override
    public void crear() {
        listaCM.Agregar(2, "Centro de Mando", 100, 1000, 500, 10);
    }
    
}
