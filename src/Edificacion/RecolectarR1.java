/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificacion;

import Centro_de_Mando.Centro_de_Mando;
import static Edificacion.ConstructorLista.listaEdificacion;
import static Edificacion.ConstructorLista.listaEdificacion2;
import Jugador.Jugador;
import Milicia.Milicia;
import Raza.Raza;
import Vehiculo.Vehiculo;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;
import estherlara.sworld.MenuGeneral;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RecolectarR1 implements Edificacion {

    AbstractFactory factory;
    Jugador jugador;
    Milicia milicia;
    Vehiculo vehiculo;
    Centro_de_Mando CM;
    Raza raza;
    Edificacion edificacion;

    @Override
    public void crear(int idjugador) {
        int recurso1 = 400;
        int recurso2 = 100;
        int recurso3 = 0;

        factory = FactoryProducer.getFactory(2);
        Centro_de_Mando CM = factory.getCentro_De_Mando(idjugador);
        CM.pagar(idjugador, recurso1, recurso2, recurso3);

        factory = FactoryProducer.getFactory(1);
        Jugador jugador = factory.getJugador(idjugador);

        factory = FactoryProducer.getFactory(4);
        Raza raza = factory.getRaza(jugador.EnseñarRaza(idjugador));

        if (idjugador == 1) {
            listaEdificacion.Agregar("Recolectador de recursos 1", raza.vida(1000), raza.fase(2), idjugador);
        } else {
            listaEdificacion2.Agregar("Recolectador de recursos 1", raza.vida(1000), raza.fase(2), idjugador);
        }

    }

    @Override
    public void mostrar(int id) {
        if (id == 1) {
            listaEdificacion.Mostrar(id);

        } else {

            listaEdificacion2.Mostrar(id);

        }
    }

    @Override
    public void CambiarFase(int id) {
        if (id == 1) {
            listaEdificacion.CambiarFase();
        } else {
            listaEdificacion2.CambiarFase();
        }
    }

    @Override
    public void generadorR(int id) {
    }

    @Override
    public void agarrarAtaque(int id, int mira, int ataque) {
        if (id == 1) {
            listaEdificacion.agarrarAtaque(id, mira, ataque);
        } else {
            listaEdificacion2.agarrarAtaque(id, mira, ataque);
        }
    }

    @Override
    public void mostrarMirador(int id, int turno) {
        MenuGeneral menu = new MenuGeneral();
         Scanner leer = new Scanner(System.in);
        if (id == 1) {
            if (listaEdificacion.Verificar(id) == 1) {
                listaEdificacion.Mostrar(id);
            } else {
                factory = FactoryProducer.getFactory(2);
                CM = factory.getCentro_De_Mando(id);
                CM.mostrarCM(id);

                System.out.println("¿Deseas atacar centro de mando?\n1.Si\n2. No");
                int o = 0;
                int atacante = 0;
                o = leer.nextInt();
                leer.nextLine();
                if (o == 1) {
                    int n = 0;
                    System.out.println("¿Con qué quieres atacar?\n1. Milicia\n2. Vehiculo");
                    n = leer.nextInt();
                    leer.nextLine();

                    if (n == 1) {
                        factory = FactoryProducer.getFactory(6);
                        milicia = factory.getMilicia(1);
                        milicia.mostrar(id);

                        atacante = leer.nextInt();
                        leer.nextLine();

                        factory = FactoryProducer.getFactory(2);
                        CM = factory.getCentro_De_Mando(id);
                        CM.agarrarAtaque(id, id, atacante);

                    } else if (n == 2) {
                        factory = FactoryProducer.getFactory(5);
                        vehiculo = factory.getVehiculo(1);
                        vehiculo.mostrar(id);

                        atacante = leer.nextInt();
                        leer.nextLine();

                        factory = FactoryProducer.getFactory(2);
                        CM = factory.getCentro_De_Mando(id);
                        CM.agarrarAtaque(id, id, atacante);
                    }
                    menu.CambiarFase(2, turno);
                } else {
                    menu.CambiarFase(1, turno-1);
                }

            }

        } else if (id == 2) {
            if (listaEdificacion2.Verificar(id) == 1) {
                listaEdificacion2.Mostrar(id);
            } else {

                factory = FactoryProducer.getFactory(2);
                CM = factory.getCentro_De_Mando(id);
                CM.mostrarCM(id);

                System.out.println("¿Deseas atacar centro de mando?\n1.Si\n2. No");
                int o = 0;
                int atacante = 0;
                o = leer.nextInt();
                leer.nextLine();
                if (o == 1) {
                    int n = 0;
                    System.out.println("¿Con qué quieres atacar?\n1. Milicia\n2. Vehiculo");
                    n = leer.nextInt();
                    leer.nextLine();

                    if (n == 1) {
                        factory = FactoryProducer.getFactory(6);
                        milicia = factory.getMilicia(1);
                        milicia.mostrar(id);

                        atacante = leer.nextInt();
                        leer.nextLine();

                        factory = FactoryProducer.getFactory(2);
                        CM = factory.getCentro_De_Mando(id);
                        CM.agarrarAtaque(id, id, atacante);

                    } else if (n == 2) {
                        factory = FactoryProducer.getFactory(5);
                        vehiculo = factory.getVehiculo(1);
                        vehiculo.mostrar(id);

                        atacante = leer.nextInt();
                        leer.nextLine();

                        factory = FactoryProducer.getFactory(2);
                        CM = factory.getCentro_De_Mando(id);
                        CM.agarrarAtaque(id, id, atacante);
                    }
                    menu.CambiarFase(1, turno);
                } else {
                    menu.CambiarFase(2, turno-1);
                }

            }
        }
    }
}
