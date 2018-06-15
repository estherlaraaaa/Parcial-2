/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import Centro_de_Mando.Centro_de_Mando;
import static Edificacion.ConstructorLista.listaEdificacion;
import static Edificacion.ConstructorLista.listaEdificacion2;
import Jugador.Jugador;
import Raza.Raza;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;

/**
 *
 * @author User
 */
public class Entrenamiento implements Edificacion {

    AbstractFactory factory;

    @Override
    public void crear(int idjugador) {
        int recurso1 = 500;
        int recurso2 = 0;
        int recurso3 = 400;

        factory = FactoryProducer.getFactory(2);
        Centro_de_Mando CM = factory.getCentro_De_Mando(idjugador);
        CM.pagar(idjugador, recurso1, recurso2, recurso3);

        factory = FactoryProducer.getFactory(1);
        Jugador jugador = factory.getJugador(idjugador);

        factory = FactoryProducer.getFactory(4);
        Raza raza = factory.getRaza(jugador.EnseñarRaza(idjugador));

        if (idjugador == 1) {
            listaEdificacion.Agregar("Entrenamiento", raza.vida(4000), raza.fase(2), idjugador);
        } else {
            listaEdificacion2.Agregar("Entrenamiento", raza.vida(4000), raza.fase(2), idjugador);
        }

    }

    @Override
    public void mostrar(int id) {
        if(id==1){
        listaEdificacion.Mostrar(id);
        }else{
        listaEdificacion2.Mostrar(id);
        }
    }

    @Override
    public void CambiarFase(int id) {
        if (id == 1) {
            listaEdificacion.CambiarFase();
        } else {
            listaEdificacion2.CambiarFase();
        }
    }

    @Override
    public void generadorR(int id) {
    }

    @Override
    public void agarrarAtaque(int id, int mira, int ataque) {
        if (id == 1) {
            listaEdificacion.agarrarAtaque(id, mira, ataque);
        } else {
            listaEdificacion2.agarrarAtaque(id, mira, ataque);
        }
        
    }

    @Override
    public void mostrarMirador(int id) {
        if (id == 1) {
            if (listaEdificacion.Verificar(id) == 1) {
                listaEdificacion.Mostrar(id);
            } else {
                factory = FactoryProducer.getFactory(2);
                Centro_de_Mando CM = factory.getCentro_De_Mando(id);
                CM.mostrarCM(id);                
            }
        } else {
            if (listaEdificacion2.Verificar(id) == 1) {
                listaEdificacion2.Mostrar(id);
            } else {
                factory = FactoryProducer.getFactory(2);
                Centro_de_Mando CM = factory.getCentro_De_Mando(id);
                CM.mostrarCM(id);
            }
        }
    }

}
