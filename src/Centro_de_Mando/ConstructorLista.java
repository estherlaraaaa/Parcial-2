/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Centro_de_Mando;

import Jugador.ListaJugador;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConstructorLista {
    static ListaCM listaCM = new ListaCM();
    Scanner leer = new Scanner(System.in);
    int id;
    String nombre;
    int recurso1;
    int recurso2;
    int recurso3;
    int nivel; 
    
    public ConstructorLista(){}
    public ConstructorLista(int id, String nombre, int recurso1, int recurso2, int recurso3, int nivel){
    this.id = id;
    this.nombre = nombre;
    this.recurso1 = recurso1;
    this.recurso2 = recurso2;
    this.recurso3 = recurso3;
    this.nivel = nivel;
    }
      public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRecurso1(int recurso1){
        this.recurso1 = recurso1;
    }
    public void setRecurso2(int recurso2){
        this.recurso2 = recurso2;
    }
    public void setRecurso3(int recurso3){
        this.recurso3 = recurso3;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public int getId(){
    return id;
    }
    public String getNombre(){
    return nombre;
    }
    public int getRecurso1(){
    return recurso1;
    }
    public int getRecurso2(){
    return recurso2;
    }
    public int getRecurso3(){
    return recurso3;
    }
    public int getNivel(){
    return nivel;
    }
    
}
