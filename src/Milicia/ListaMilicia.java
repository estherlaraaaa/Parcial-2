/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import Edificacion.Edificacion;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaMilicia {

    private ArrayList<ConstructorLista> listam;

    public ListaMilicia() {
        listam = new ArrayList<>();
    }

    public void Agregar(String nombreMilicia, int vida, int fase, int idjugador, int ataque, int mira) {
        ConstructorLista milicia = new ConstructorLista();
        milicia.setId(listam.size() + 1);
        milicia.setNombreMilicia(nombreMilicia);
        milicia.setIdjugador(idjugador);
        milicia.setVida(vida);
        milicia.setFase(fase);
        milicia.setAtaque(ataque);
        milicia.setMira(mira);

        listam.add(milicia);

    }

    public void Mostrar(int id) {
        /*int count = 0;
        for (int i=0;i<listam.size();i++) {
            if (id == listam.get(count).idjugador) {             
                System.out.println("Milicia : "+listam.get(count).nombreMilicia);
                System.out.println("  ");
            }
            count = count + 1;
        }*/
        int count = 0;
        for (ConstructorLista milicia : listam) {
            if (id == listam.get(count).idjugador && listam.get(count).fase == 0) {
                System.out.println(listam.get(count).id + "\033[34m--" + listam.get(count).nombreMilicia);

            } else if (id == listam.get(count).idjugador && listam.get(count).fase > 0) {
                System.out.println(listam.get(count).nombreMilicia + " \033[32m¡AUN NO TERMINO MI ENTRENAMIENTO PARA ATACAR!");
            }
            count = count + 1;
        }

    }

    public void MostrarA(int id) {
        int count = 0;
        for (ConstructorLista milicia : listam) {
            if (id == listam.get(count).idjugador && listam.get(count).mira != 0) {
                System.out.println(listam.get(count).id + "\033[32m--" + listam.get(count).nombreMilicia);
            }
            count = count + 1;
        }
    }

    public void Usar(int id) {
        int count = 0;
        for (int i = 0; i < listam.size(); i++) {
            if (listam.get(count).fase != 0) {
                listam.get(count).setFase(listam.get(count).getFase() - 1);
            }
            count = count + 1;
        }
    }

    public void ponerMira(int id, int atacando, int mira) {
        int count = 0;
        for (ConstructorLista milicia : listam) {
            if (listam.get(count).id == atacando) {
                listam.get(count).setMira(mira);
            }
            count = count + 1;
        }
    }

    public void Atacar() {
        AbstractFactory factory;
        int count = 0;

        for (ConstructorLista milicia : listam) {
            int fase = 0;
            if (listam.get(count).mira != 0) {

                if (listam.get(count).idjugador == 2) {
                    fase = 1;
                } else {
                    fase = 2;
                }
                factory = FactoryProducer.getFactory(3);
                Edificacion edificacion = factory.getEdificacion(1);
                edificacion.agarrarAtaque(fase, listam.get(count).mira, listam.get(count).ataque);

            }
            count = count + 1;
        }

    }

}
