/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Edificacion.Edificacion;
import Jugador.Jugador;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuGeneral {

    AbstractFactory factory;

    public void Menu(int random) {

        factory = FactoryProducer.getFactory(1);
        Jugador jugador = factory.getJugador(random);
        jugador.mostrarRecursos(random);
        System.out.println("¿Qué deseas hacer?  \n1.Crear Edificacion. \n2. Mostrar Edificaciones. \n3.Crear Milicia. \n4.Atacar . \n5.Defender. \n6.Abandonar partida :(  ");
        
    }
    
    /*AGREGAR LO MISMO DE ARRIBA CON EDIFICACION*/

    public void SubMenu(int random) {
        int opcion = 0;
        int o = 0;
        Scanner leer = new Scanner(System.in);
        while (opcion != 6) {
            Menu(random);
            opcion = leer.nextInt();
            factory = FactoryProducer.getFactory(4);
            Edificacion edificacion = factory.getEdificacion(random);
            switch (opcion) {
                case 1:
                    System.out.println("¿Qué edificacion deseas crear?");
                    System.out.println("1.Recolectador de recursos 1. \n2. Recolectador de recursos 2. \n3. Generador de recursos. \n4. Cuartel de entrenamiento. \n5. Fabrica vehicular 1. \n6. Fabrica vehicular 2. ");
                    o = leer.nextInt();
                    edificacion.crear(random);   
                    break;
                case 2:                   
                    edificacion.mostrar(random);
                    break;
                case 3:
                    System.out.println("¿Qué Milicia deseas crear?");
                    System.out.println("Lista de milicia");
                    break;
                case 4:
                    System.out.println("¿Qué desea atacar?");
                    System.out.println("Lista de enemigos...");
                    break;
                case 5:
                    System.out.println("¿Qué desea defender?");
                    System.out.println("Lista de cosas que tengo");
                    break;
                case 6:
                    System.out.println("¿Seguro que deseas abandonar la partida?\n1. Si\n2. No");
                   
                    break;
                default:
                    System.out.println("Por favor ingrese una opción valida.");
            }
            if (random == 1) {
                random = 2;
            } else {
                random = 1;
            }

        }
    }

}
