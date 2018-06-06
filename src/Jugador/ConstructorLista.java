/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructorLista {
    static ListaJugador listaJugador = new ListaJugador();
    Scanner leer = new Scanner(System.in);
    int id;
    String nombre;
    int raza;
    int oro;
    int elixir;
    int diamantes;
 


    public ConstructorLista(){}
    public ConstructorLista(int id, String nombre, int raza, int oro, int elixir, int diamantes){
    this.id = id;
    this.nombre = nombre;
    this.raza = raza;
    this.oro = oro;
    this.elixir = elixir;
    this.diamantes = diamantes;
    }
      public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(int raza){
        this.raza = raza;
    }
    public void setOro(int oro){
        this.oro = oro;
    }
    public void setElixir(int elixir){
        this.elixir = elixir;
    }
    public void setDiamantes(int diamantes){
        this.diamantes = diamantes;
    }
    public int getId(){
    return id;
    }
    public String getNombre(){
    return nombre;
    }
    public int getRaza(){
    return raza;
    }
    public int getOro(){
    return oro;
    }
    public int getElixir(){
    return elixir;
    }
    public int getDiamantes(){
    return diamantes;
    }
}

