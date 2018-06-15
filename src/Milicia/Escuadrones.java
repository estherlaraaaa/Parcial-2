/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Jugador.Jugador;
import static Milicia.ConstructorLista.listaMilicia;
import static Milicia.ConstructorLista.listaMilicia2;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;

/**
 *
 * @author User
 */
public class Escuadrones implements Milicia {

    AbstractFactory factory;
    Jugador jugador;
    Milicia milicia;
    Vehiculo vehiculo;
    Centro_de_Mando CM;
    Raza raza;
    Edificacion edificacion;

    @Override
    public void entrenar() {

    }

    @Override
    public void crear(int idjugador) {
        int recurso1 = 1000;
        int recurso2 = 2000;
        int recurso3 = 0;

        factory = FactoryProducer.getFactory(2);
        Centro_de_Mando CM = factory.getCentro_De_Mando(idjugador);
        CM.pagar(idjugador, recurso1, recurso2, recurso3);
        
        factory = FactoryProducer.getFactory(4);
        raza = factory.getRaza(idjugador);

        if (idjugador == 1) {
            listaMilicia.Agregar("Escuadron", raza.vida(2000), raza.fase(1), idjugador, raza.ataque(55), 0);
        } else {
            listaMilicia2.Agregar("Escuadron", raza.vida(2000), raza.fase(1), idjugador, raza.ataque(125), 0);
        }

    }

    @Override
    public void usar(int id) {
        if (id == 1) {
            listaMilicia.Usar(id);
        } else {
            listaMilicia2.Usar(id);
        }
    }

    @Override
    public void mostrar(int idjugador) {
        if (idjugador == 1) {
            listaMilicia.Mostrar(idjugador);
        } else {
            listaMilicia2.Mostrar(idjugador);
        }
    }

    @Override
    public void mostrarA(int idjugador) {
        if (idjugador == 1) {
            listaMilicia.MostrarA(idjugador);
        } else {
            listaMilicia2.MostrarA(idjugador);
        }
    }

    @Override
    public void ponerMira(int id, int atacando, int mira) {
        if (id == 1) {
            listaMilicia.ponerMira(id, atacando, mira);
        } else {
            listaMilicia2.ponerMira(id, atacando, mira);
        }
    }

    @Override
    public void atacar(int idjugador) {
        if(idjugador==1){
            listaMilicia.Atacar();
        }else{
            listaMilicia2.Atacar();
        }
    }

}
