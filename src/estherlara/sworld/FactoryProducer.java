/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Centro_de_Mando.Centro_de_MandoFactory;
import Edificacion.EdificacionFactory;
import Jugador.JugadorFactory;
import Milicia.MiliciaFactory;
import Raza.RazaFactory;
import Vehiculo.VehiculoFactory;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public interface FactoryProducer {

    public static AbstractFactory getFactory(int type) {
        try {
            switch (type) {
                case 1:
                    return new JugadorFactory();
                case 2:
                    return new Centro_de_MandoFactory();
                case 3:
                    return new EdificacionFactory();
                case 4:
                    return new RazaFactory();
                case 5:
                    return new VehiculoFactory();
                case 6:
                    return new MiliciaFactory();
            }
            return null;
        } catch (InputMismatchException e) {
            System.err.println("Por favor, ingrese una de las opciones.");

        }
        return null;
    }

}
