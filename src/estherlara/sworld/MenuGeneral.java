/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estherlara.sworld;

import Centro_de_Mando.Centro_de_Mando;
import Edificacion.Edificacion;
import Jugador.Jugador;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MenuGeneral {

    AbstractFactory factory;
    Jugador jugador;
    Milicia milicia;
    Vehiculo vehiculo;
    Centro_de_Mando CM;
    Raza raza;
    Edificacion edificacion;

    public void Menu(int random) {
        factory = FactoryProducer.getFactory(1);
        jugador = factory.getJugador(random);
        jugador.mostrarTurno(random);

        factory = FactoryProducer.getFactory(2);
        CM = factory.getCentro_De_Mando(random);
        CM.mostrarRecursos(random);
        System.out.println(" ");
        System.out.println("\033[35m¿QUÉ DESEAS HACER?  \033[34m\n1.Crear Edificacion. \033[34m\n2. Mostrar Edificaciones. \033[34m\n3.Crear Milicia. \033[34m\n4.Atacar . \033[34m\n5.Mejorar Centro de Mando. \033[34m\n6.Defender \033[34m\n7.Abandonar partida :(  ");
        System.out.println("   ");
    }

    public void CambiarFase(int random, int turno) {
        

        turno = turno + 1;

        if (turno % 2 == 0) {

            factory = FactoryProducer.getFactory(3);
            edificacion = factory.getEdificacion(1);
            edificacion.CambiarFase(random);

            factory = FactoryProducer.getFactory(3);
            edificacion = factory.getEdificacion(3);
            edificacion.generadorR(random);

        }
        
        if (random == 1) {
            random = 2;
        } else {
            random = 1;
        }

        factory = FactoryProducer.getFactory(6);
        milicia = factory.getMilicia(1);
        milicia.atacar(random);
        milicia.usar(random);
        
        SubMenu(random, turno);

    }

    /* public void MostrarEnemigo(int random) {
        int enemigo;
        if (random == 1) {
            enemigo = 2;
        } else {
            enemigo = 1;
        }
        factory = FactoryProducer.getFactory(3);
        edificacion = factory.getEdificacion(1);
        edificacion.mostrar(enemigo);
    }

    public void MiliciaEnemiga(int random) {
        int miliciaEnemiga;
        if (random == 1) {
            miliciaEnemiga = 2;
        } else {
            miliciaEnemiga = 1;
        }
        factory = FactoryProducer.getFactory(6);
        milicia = factory.getMilicia(1);
        milicia.mostrar(miliciaEnemiga);

    }*/
    public void Atacar(int random, int turno) {
        Scanner leer = new Scanner(System.in);
        int atacando = 0;
        int mira = 0;

        int enemigo;
        if (random == 1) {
            enemigo = 2;
        } else {
            enemigo = 1;
        }

        System.out.println("\033[35m¿QUE DESEAS ATACAR? ");
        System.out.println(" ");
        factory = FactoryProducer.getFactory(3);
        edificacion = factory.getEdificacion(1);
        edificacion.mostrarMirador(enemigo,turno);
        atacando = leer.nextInt();

        int w = 0;

        System.out.println("\033[35m¿CON QUE DESEAS ATACAR? \033[34m\n1.Milicia    \033[34m\n2.Vehiculos");
        w = leer.nextInt();
        if (w == 1) {
            factory = FactoryProducer.getFactory(6);
            milicia = factory.getMilicia(1);
            System.out.println("\033[35mTus milicias son: ");
            milicia.mostrar(random);
            mira = leer.nextInt();

            factory = FactoryProducer.getFactory(6);
            milicia = factory.getMilicia(1);
            milicia.ponerMira(random, atacando, mira);

        } else {
            factory = FactoryProducer.getFactory(5);
            vehiculo = factory.getVehiculo(1);
            System.out.println("\033[35mTus vehiculos son: ");
            vehiculo.mostrar(random);
            vehiculo.ponerMira(random, atacando, mira);
            mira = leer.nextInt();
        }
        CambiarFase(random,turno); 
    }

    public void SubMenu(int random, int turno) {
        int opcion = 0;
        int o = 0;
        int p = 0;
        int s = 0;
        turno = turno;
        Scanner leer = new Scanner(System.in);
        while (opcion != 7) {
            Menu(random);
            opcion = leer.nextInt();
            try {
                switch (opcion) {

                    case 1:
                        System.out.println("\033[35m¿QUÉ EDIFICACION DESEAS CREAR?");
                        System.out.println("   ");
                        System.out.println("\033[34m1.Recolectador de recursos 1. \033[34m\n2. Recolectador de recursos 2. \033[34m\n3. Generador de recursos. \033[34m\n4. Cuartel de entrenamiento. \033[34m\n5. Fabrica vehicular 1. \033[34m\n6.Fabrica vehicular 2. ");
                        o = leer.nextInt();
                        System.out.println("  ");
                        factory = FactoryProducer.getFactory(3);
                        edificacion = factory.getEdificacion(o);
                        edificacion.crear(random);
                        CambiarFase(random, turno);
                        break;

                    case 2:
                        System.out.println("\033[34m\nTus edificaciones son: ");
                        System.out.println(" ");
                        factory = FactoryProducer.getFactory(3);
                        edificacion = factory.getEdificacion(1);
                        edificacion.mostrar(random);

                        System.out.println("\033[34m\nTus milicias son: ");
                        System.out.println(" ");
                        factory = FactoryProducer.getFactory(6);
                        milicia = factory.getMilicia(random);
                        milicia.mostrar(random);
                        System.out.println("\033[34m\nTus vehiculos son: ");
                        System.out.println(" ");
                        factory = FactoryProducer.getFactory(5);
                        vehiculo = factory.getVehiculo(random);
                        vehiculo.mostrar(random);
                        break;

                    case 3:
                        System.out.println("\033[35m¿QUÉ MILICIA DESEAS CREAR?");
                        System.out.println(" ");
                        System.out.println("\033[34m1.Escuaadron. \033[34m\n2.Especialista.");
                        p = leer.nextInt();
                        factory = FactoryProducer.getFactory(6);
                        milicia = factory.getMilicia(p);
                        milicia.crear(random);
                        milicia.usar(random);
                        CambiarFase(random, turno);
                        System.out.println("   ");
                        break;

                    case 4:
                        Atacar(random, turno);
                        System.out.println("  ");
                        break;

                    case 5:
                        factory = FactoryProducer.getFactory(2);
                        Centro_de_Mando CM = factory.getCentro_De_Mando(random);
                        CM.mejorar(random);
                        CambiarFase(random, turno);
                        break;

                    case 6:
                        System.out.println("\033[35mDEFENDER");
                        System.out.println(" ");
                        System.out.println("\033[35mESTA ES TU MILICIA ENEMIGA: ");
                        milicia.mostrarA(random);
                        System.out.println("  ");
                        CambiarFase(random, turno);
                        System.out.println("   ");
                        break;

                    case 7:
                        System.out.println("\033[31mHAS ABANDONADO LA PARTIDA");
                        break;

                    default:
                        System.out.println("\033[31mPor favor ingrese una opción valida.");
                }
            } catch (InputMismatchException e) {
                System.err.println("\033[31mPor favor, ingrese una de las opciones.");
                leer.nextLine();
            }
        }
    }

}
