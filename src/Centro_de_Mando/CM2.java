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
    public void mejorar(int id) {
        listaCM.Mejorar(id);
    }

    @Override
    public void mostrarRecursos(int id) {
       listaCM.Mostrar(id);
    }

    @Override
    public void pagar(int idjugador, int recurso1, int recurso2, int recurso3) {
        listaCM.Pagar(idjugador, recurso1, recurso2, recurso3);
    }

    @Override
    public void crear() {
        listaCM.Agregar("Centro de Mando", 10000, 5000, 3000, 0);
    }

    @Override
    public void mostrarCM(int id) {
        listaCM.MostrarCM(id);
    }

    @Override
    public void generador(int id, int recurso1, int recurso2, int recurso3) {
        listaCM.Generador(id, recurso1, recurso2, recurso3);
    }

    @Override
    public void agarrarAtaque(int id, int mira, int ataque) {
        listaCM.agarrarAtaque(id, mira, ataque);
    }
    
}
