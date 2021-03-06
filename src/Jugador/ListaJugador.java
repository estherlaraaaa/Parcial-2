/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import static java.lang.Math.random;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaJugador {

    private ArrayList<ConstructorLista> listaj;

    public ListaJugador() {

        listaj = new ArrayList<>();

    }

    public void Agregar(int id, String nombre, int raza, int oro, int elixir, int diamantes) {
        ConstructorLista jugador = new ConstructorLista();
        jugador.setId(id);
        jugador.setNombre(nombre);
        jugador.setRaza(raza);

        listaj.add(jugador);

    }
    
    public void Agregar(ConstructorLista jugador) throws Exception{
        if(jugador != null){
            if (!listaj.contains(jugador)) {
                listaj.add(jugador);               
            }
            Exception e = new Exception("\033[31mNO PUEDEN JUGADORES DUPLICADOS");
            throw e;
        }else{
            throw new Exception("\033[31mNO EXISTE JUGADOR NULO");
        }
    }
    

    public void Mostrar(int id) {
        int count = 0;
        for (ConstructorLista jugador : listaj) {
            if (id == listaj.get(count).id) {
                System.out.println("\033[36mTURNO DE: " + listaj.get(count).nombre);
                System.out.println("   ");
            }

            count = count + 1;

        }
       
    }

    public int EnseñarRaza(int id){
        int count = 0;
        int raza = 0; 
        for (ConstructorLista jugador : listaj) {
            if (id == listaj.get(count).id) {
                raza= listaj.get(count).raza; 
            }
            count = count + 1;
        }  
        return raza; 
        }
    

/*public void Mostrar (int id){
    int count = 0;
    for (ConstructorLista jugador : listaj){
        if(id==listaj.get(count).id){
            System.out.println("TURNO DEL JUGADOR:"+listaj.get(count).nombre);
            if(1==listaj.get(count).raza){
                System.out.println("Billetes "+listaj.get(count).oro);
                System.out.println("Coras "+listaj.get(count).elixir);
                System.out.println("Centavos "+listaj.get(count).diamantes); 
            }else if (2==listaj.get(count).raza){
                System.out.println("Oro "+listaj.get(count).oro);
                System.out.println("Elixir "+listaj.get(count).elixir);
                System.out.println("Diamantes "+listaj.get(count).diamantes);   
            } else {
                System.out.println("Monedas "+listaj.get(count).oro);
                System.out.println("Fichas "+listaj.get(count).elixir);
                System.out.println("Cacao "+listaj.get(count).diamantes);
            }  
        }
       
        count = count+1;
        
        }

}*/
}
