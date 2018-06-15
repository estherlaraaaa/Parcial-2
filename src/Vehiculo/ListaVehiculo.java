/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

import Edificacion.Edificacion;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaVehiculo {
    private ArrayList<ConstructorLista> listav;

    public ListaVehiculo() {
        listav = new ArrayList<>();
    }
    
    
    public void Agregar(String nombreVehiculo, int idjugador, int vida, int ataque, int fase) {
        ConstructorLista vehiculo = new ConstructorLista();
        vehiculo.setId(listav.size()+1);
        vehiculo.setNombreVehiculo(nombreVehiculo);
        vehiculo.setIdjugador(idjugador);
        vehiculo.setVida(vida);
        vehiculo.setAtaque(ataque);
        vehiculo.setFase(fase); 

        listav.add(vehiculo); 

    }
    
    
    public void Mostrar(int id) {
       /* int count = 0;
        for (ConstructorLista Vehiculo : listav) {
            if (id == listav.get(count).idjugador && listav.get(count).fase==0) {             
                System.out.println(listav.get(count).nombreVehiculo);
            }else if (id == listav.get(count).idjugador && listav.get(count).fase>0){
                System.out.println(listav.get(count).nombreVehiculo + " No esta listoo");
            }
            count = count + 1;
        }*/
       int count = 0;
        for (ConstructorLista vehiculo : listav) {
            if (id == listav.get(count).idjugador && listav.get(count).fase == 0) {                
                System.out.println(listav.get(count).id + "--" + listav.get(count).nombreVehiculo);
                
            } else if (id == listav.get(count).idjugador && listav.get(count).fase > 0) {                
                System.out.println(listav.get(count).nombreVehiculo + " No esta listoo");
            }
            count = count + 1;
        }

    }
    
    
    public void ponerMira(int id, int atacando, int mira){
        int count = 0;
        for(ConstructorLista vehiculo: listav){
            if (listav.get(count).id==atacando){
                listav.get(count).setMira(mira);
            }
            count= count +1; 
        }
    }    
    
    public void Atacar(){
        AbstractFactory factory; 
        int count = 0;
        int ataque = 0; 
        
        for(ConstructorLista milicia: listav){
            int fase = 0; 
            if (listav.get(count).mira!=0){
                factory = FactoryProducer.getFactory(5);
                Edificacion edificacion = factory.getEdificacion(1);
                if(listav.get(count).idjugador==2){
                    fase = 1;
                }else{
                    fase = 2; 
                }
                edificacion.agarrarAtaque(fase, listav.get(count).mira, listav.get(count).ataque);
                    
            }
          count = count + 1;  
        }
       
        
        
    }
    
    
    
    
}
