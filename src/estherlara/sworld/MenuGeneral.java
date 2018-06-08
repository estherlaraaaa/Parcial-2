/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Centro_de_Mando.Centro_de_Mando;
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
        jugador.mostrarTurno(random);

        factory = FactoryProducer.getFactory(2);
        Centro_de_Mando CM = factory.getCentro_De_Mando(random);
        CM.mostrarRecursos(random);
        System.out.println("\033[35m¿Qué deseas hacer?  \n1.Crear Edificacion. \n2. Mostrar Edificaciones. \n3.Crear Milicia. \n4.Atacar . \n5.Abandonar partida :(  ");
        System.out.println("   ");
    }
    
    public void CambiarFase (int random){
        if (random == 1) {
                random = 2;
            } else {
                random = 1;
            }
        SubMenu(random);
    }

    public void MostrarEnemigo(int random) {
        int enemigo;
        if (random == 1) {
            enemigo = 2;
        } else {
            enemigo = 1;
        }
        factory = FactoryProducer.getFactory(3);
        Edificacion edificacion = factory.getEdificacion(1);
        edificacion.mostrar(enemigo);

    }

    
    public void SubMenu(int random) {
        int opcion = 0;
        int o = 0;
        Scanner leer = new Scanner(System.in);
        while (opcion != 6) {
            Menu(random);
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\033[35m¿Qué edificacion deseas crear?");
                    System.out.println("   ");
                    System.out.println("1.Recolectador de recursos 1. \n2. Recolectador de recursos 2. \n3. Generador de recursos. \n4. Cuartel de entrenamiento. \n5. Fabrica vehicular 1. \n6. Fabrica vehicular 2. ");
                    o = leer.nextInt();
                    System.out.println("  ");
                    factory = FactoryProducer.getFactory(3);
                    Edificacion edificacion = factory.getEdificacion(o);
                    edificacion.crear(random);
                    CambiarFase(random); 
                    break;
                case 2:
                    factory = FactoryProducer.getFactory(3);
                    Edificacion edificacion2 = factory.getEdificacion(random);
                    edificacion2.mostrar(random);
                    break;
                case 3:
                    System.out.println("\033[35m¿Qué Milicia deseas crear?");
                    System.out.println("Lista de milicia");
                    System.out.println("  ");
                    CambiarFase(random); 
                    System.out.println("   ");
                    break;
                case 4:
                    System.out.println("\033[35m¿Qué desea atacar?");
                    MostrarEnemigo(random);
                    System.out.println("  ");
                    CambiarFase(random); 
                    System.out.println("   ");
                    break;
                case 5:
                    System.out.println("\033[35m¿Seguro que deseas abandonar la partida?\n1. Si\n2. No");
                    System.out.println("   ");
                    break;
                default:
                    System.out.println("\033[31mPor favor ingrese una opción valida.");
            }
           
        }
    }

}
