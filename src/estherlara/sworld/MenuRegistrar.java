/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Jugador.Jugador;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuRegistrar {

    Scanner leer = new Scanner(System.in);

    AbstractFactory factory;

    public void Registro() {

        for (int i = 1; i <= 2; i++) {
            String nombre = "";
            int raza = 0;

            System.out.println("\033[36m----------REGISTRANDO JUGADOR " + i + "--------------");
            System.out.println("\033[35mIngrese su nombre por favor");
            nombre = leer.nextLine();
            System.out.println("\033[35mCon qué raza desea jugar: \n1.Soldados. \n2.Duende. \n3.Extraterrestres.");
            raza = leer.nextInt();
            leer.nextLine();

            factory = FactoryProducer.getFactory(1);
            Jugador jugador = factory.getJugador(i);
            jugador.registrar(i, nombre, raza);
            
            factory = FactoryProducer.getFactory(2);
            Centro_de_Mando CM = factory.getCentro_De_Mando(i);
            CM.crear();
        }

        MenuGeneral general = new MenuGeneral();

        Random generadorAleatorios = new Random();
 
        int random = 1 + generadorAleatorios.nextInt(2);
        
        general.SubMenu(random);

    }

}
