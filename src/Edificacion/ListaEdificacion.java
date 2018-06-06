/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

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

    public void Agregar(int id, String nombreEdificacion, int vida, int fase, int idjugador) {
        ConstructorLista edificacion = new ConstructorLista();
        edificacion.setId(id);
        edificacion.setNombreEdificacion(nombreEdificacion);
        edificacion.setIdjugador(idjugador);
        edificacion.setVida(vida);
        edificacion.setFase(fase);

        listae.add(edificacion);

    }

    public void Mostrar(int id) {
        int count = 0;
        for (int i=0;i<listae.size();i++) {
            if (id == listae.get(count).idjugador) {
                System.out.println("EDIFICACIONES DEL JUGADOR :" + listae.get(count).idjugador);
                System.out.println("Edificación : "+listae.get(count).nombreEdificacion);
            }
            count = count + 1;
        }

    }

}
