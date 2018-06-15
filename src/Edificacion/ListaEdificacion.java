/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import Centro_de_Mando.Centro_de_Mando;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;
import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaEdificacion {

    private ArrayList<ConstructorLista> listae;

    public ListaEdificacion() {

        listae = new ArrayList<>();

    }

    public void Agregar(String nombreEdificacion, int vida, int fase, int idjugador) {
        ConstructorLista edificacion = new ConstructorLista();
        edificacion.setId(listae.size() + 1);
        edificacion.setNombreEdificacion(nombreEdificacion);
        edificacion.setIdjugador(idjugador);
        edificacion.setVida(vida);
        edificacion.setFase(fase);

        listae.add(edificacion);

    }

    public void Mostrar(int id) {
        int count = 0;
        for (ConstructorLista edificacion : listae) {
            if (id == listae.get(count).idjugador && listae.get(count).fase == 0) {
                System.out.println(listae.get(count).id + "\033[34m--" + listae.get(count).nombreEdificacion + " \033[34mVIDA: " +listae.get(count).vida);

            } else if (id == listae.get(count).idjugador && listae.get(count).fase > 0) {
                System.out.println(listae.get(count).id + "\033[34m--" + listae.get(count).nombreEdificacion+ " \033[34mVIDA: " + listae.get(count).vida + " \033[35mNo esta lista");
            }
            count = count + 1;
        }

    }

    public void CambiarFase() {
        int count = 0;
        for (int i = 0; i < listae.size(); i++) {
            if (listae.get(count).fase != 0) {
                System.out.println("  ");
                listae.get(count).setFase(listae.get(count).getFase() - 1);
            }
            count = count + 1;
        }
    }

    public void agarrarAtaque(int id, int mira, int ataque) {
        int count = 0;
        for (ConstructorLista edificacion : listae) {
            int fase = 0;
            if (listae.get(count).id == mira) {
                if (listae.get(count).vida == 0) {
                    if (id == 2) {
                        fase = 1;
                    } else {
                        fase = 2;
                    }
                    listae.remove(count);
                } else {
                    listae.get(count).setVida(listae.get(count).getVida() - ataque);
                }
            }
            count = count + 1; 
        }
    }

    public void GeneradorR(int id) {
        AbstractFactory factory;
        int count = 0;
        for (ConstructorLista edificacion : listae) {
            if (listae.get(count).idjugador == id && listae.get(count).fase == 0 && "Generador de recursos".equals(listae.get(count).nombreEdificacion)) {
                factory = FactoryProducer.getFactory(2);
                Centro_de_Mando CM = factory.getCentro_De_Mando(id);
                CM.generador(id, 0, 0, 15);
            }
            count = count + 1;
        }

    }
    
    public int Verificar(int id) {
        AbstractFactory factory;
        int count = 0;
        for (ConstructorLista edificacion : listae) {
            if (listae.get(count).idjugador == id && listae.get(count).vida > 0) {
                return 1;
            }
            count = count + 1;
        }
        return 0;
    }
}
