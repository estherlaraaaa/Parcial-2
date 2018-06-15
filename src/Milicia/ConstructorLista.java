/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructorLista {
    static ListaMilicia listaMilicia = new ListaMilicia();
    static ListaMilicia listaMilicia2 = new ListaMilicia();
    
    Scanner leer = new Scanner(System.in);

    int id;
    String nombreMilicia;
    int vida;
    int fase;
    int idjugador;
    int ataque; 
    int mira; 

    public ConstructorLista() {
    }
    
     public ConstructorLista(int id, String nombreMilicia, int idjugador, int vida, int fase, int ataque, int mira) {
        this.id = id;
        this.nombreMilicia = nombreMilicia;
        this.idjugador = idjugador;
        this.vida = vida;
        this.fase = fase;
        this.ataque=ataque; 
        this.mira=mira; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreMilicia(String nombreMilicia) {
        this.nombreMilicia = nombreMilicia;
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
    
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public void setMira(int mira) {
        this.mira = mira;
    }

    public int getId() {
        return id;
    }
    
    public String getNombreEdificacion() {
        return nombreMilicia;
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
    public int getAtaque() {
        return ataque;
    }
    public int getMira() {
        return mira;
    }
}
