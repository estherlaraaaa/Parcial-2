/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructorLista {
    static ListaVehiculo listaVehiculo = new ListaVehiculo();
    static ListaVehiculo listaVehiculo2 = new ListaVehiculo();
    
    Scanner leer = new Scanner(System.in);

    int id;
    String nombreVehiculo;
    int vida;
    int idjugador;
    int ataque;
    int fase; 
    int mira; 


    public ConstructorLista() {
    }
    
    public ConstructorLista(int id, String nombreVehiculo, int idjugador, int vida, int ataque, int fase, int mira) {
        this.id = id;
        this.nombreVehiculo = nombreVehiculo;
        this.idjugador = idjugador;
        this.vida = vida;
        this.ataque = ataque;
        this.fase=fase; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreVehiculo(String nombreVehiculo) {
        this.nombreVehiculo = nombreVehiculo;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public void setFase(int fase) {
        this.fase = fase;
    }
    public void setMira(int mira) {
        this.mira = mira;
    }

    public int getId() {
        return id;
    }
    
    public String getNombreVehiculo() {
        return nombreVehiculo;
    }

    public int getIdjugador() {
        return idjugador;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }
    public int getFase() {
        return fase;
    }
    public int getMira() {
        return mira;
    }
}
