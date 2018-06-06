/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructorLista {

    static ListaEdificacion listaEdificacion = new ListaEdificacion();
    Scanner leer = new Scanner(System.in);

    int id;
    String nombreEdificacion;
    int vida;
    int fase;
    int idjugador;

    public ConstructorLista() {
    }

    public ConstructorLista(int id, String nombreEdificacion, int idjugador, int vida, int fase) {
        this.id = id;
        this.nombreEdificacion = nombreEdificacion;
        this.idjugador = idjugador;
        this.vida = vida;
        this.fase = fase;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreEdificacion(String nombreEdificacion) {
        this.nombreEdificacion = nombreEdificacion;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public int getId() {
        return id;
    }

    public String getNombreEdificacion() {
        return nombreEdificacion;
    }

    public int getIdjugador() {
        return idjugador;
    }

    public int getVida() {
        return vida;
    }

    public int getFase() {
        return fase;
    }

}

