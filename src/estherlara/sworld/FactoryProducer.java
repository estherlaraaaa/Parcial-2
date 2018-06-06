/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Edificacion.EdificacionFactory;
import Jugador.JugadorFactory;
import Milicia.MiliciaFactory;
import Raza.RazaFactory;
import Vehiculo.VehiculoFactory;

/**
 *
 * @author User
 */
public interface FactoryProducer {
    public static AbstractFactory getFactory(int type){
        switch (type){
            case 1:
                return  new JugadorFactory();
            case 2:
                return new RazaFactory();
            case 3:
                return new VehiculoFactory();
            case 4:
                return new EdificacionFactory();
            case 5:
                return new MiliciaFactory();
        }
        return null;
    }
    
}
