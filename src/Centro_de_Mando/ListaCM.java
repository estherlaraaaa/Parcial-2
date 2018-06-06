/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Centro_de_Mando;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaCM {
    
    private ArrayList <ConstructorLista> listaCM;
    
    public ListaCM () {
    
    listaCM= new ArrayList <>();
     
}
    public void Agregar (int id, String nombre, int recurso1, int recurso2, int recurso3, int nivel){
    ConstructorLista centromando = new ConstructorLista ();
    centromando.setId(id);
    centromando.setNombre(nombre);
    centromando.setRecurso1(recurso1);
    centromando.setRecurso2(recurso2);
    centromando.setRecurso3(recurso3);
    centromando.setNivel(nivel);
 
    listaCM.add(centromando);
    
}
    public void Mostrar (int id){
    int count = 0;
    for (ConstructorLista Centro_de_Mando : listaCM){
        if(id==listaCM.get(count).id){
            System.out.println("TURNO DEL JUGADOR:"+listaCM.get(count).nombre);
            
                System.out.println("Billetes "+listaCM.get(count).recurso1);
                System.out.println("Coras "+listaCM.get(count).recurso2);
                System.out.println("Centavos "+listaCM.get(count).recurso3); 
        }
       
        count = count+1;
        
        }

}
    
}
