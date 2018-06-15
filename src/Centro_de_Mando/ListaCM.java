/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Centro_de_Mando;

import Jugador.Jugador;
import Raza.Raza;
import estherlara.sworld.AbstractFactory;
import estherlara.sworld.FactoryProducer;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ListaCM {

    private ArrayList<ConstructorLista> listaCM;

    public ListaCM() {

        listaCM = new ArrayList<>();

    }

    public void Agregar(String nombre, int recurso1, int recurso2, int recurso3, int nivel) {
        ConstructorLista centromando = new ConstructorLista();
        centromando.setId(listaCM.size() + 1);
        centromando.setNombre(nombre);
        centromando.setVida(1000);
        centromando.setRecurso1(recurso1);
        centromando.setRecurso2(recurso2);
        centromando.setRecurso3(recurso3);
        centromando.setNivel(nivel);

        listaCM.add(centromando);

    }

    public void Mostrar(int id) {
        AbstractFactory factory;

        int count = 0;
        for (ConstructorLista centromando : listaCM) {
            if (id == listaCM.get(count).id) {
                System.out.println("\033[35mNivel del centro de mando: "+listaCM.get(count).nivel);
                factory = FactoryProducer.getFactory(1);
                Jugador jugador = factory.getJugador(id);
                if (jugador.EnseñarRaza(id) == 1) {
                    System.out.println("\033[32mBilletes: " + listaCM.get(count).recurso1 + "  \033[32mCoras: " + listaCM.get(count).recurso2 + "  \033[32mCentavos: " + listaCM.get(count).recurso3);
                } else if (jugador.EnseñarRaza(id) == 2) {
                    System.out.println("\033[32mOro : " + listaCM.get(count).recurso1 + "  \033[32mElixir : " + listaCM.get(count).recurso2 + "  \033[32mGemas : " + listaCM.get(count).recurso3);
                } else if (jugador.EnseñarRaza(id) == 3) {
                    System.out.println("\033[32mMonedas : " + listaCM.get(count).recurso1 + "  \033[32mFichas : " + listaCM.get(count).recurso2 + "  \033[32mCacao : " + listaCM.get(count).recurso3);
                }
            }

            count = count + 1;

        }

    }

    public void MostrarCM(int id) {
        AbstractFactory factory;
        int count = 0;
        for (ConstructorLista centromando : listaCM) {
            if (id == listaCM.get(count).id) {
                System.out.println(listaCM.get(count).nombre + " Vida : "+listaCM.get(count).vida);
            }
            count = count + 1  ; 
        }
    }

    public void Pagar(int id, int recurso1, int recurso2, int recurso3) {
        int count = 0;
        for (int i = 0; i < listaCM.size(); i++) {
            if (listaCM.get(count).id == id) {
                if (listaCM.get(count).recurso1 < recurso1 || listaCM.get(count).recurso2 < recurso2 || listaCM.get(count).recurso3 < recurso3) {
                    System.out.println("\033[32mNO CUENTA CON SUFICIENTE DINERO");
                } else {
                    listaCM.get(count).setRecurso1(listaCM.get(count).getRecurso1() - recurso1);
                    listaCM.get(count).setRecurso2(listaCM.get(count).getRecurso2() - recurso2);
                    listaCM.get(count).setRecurso3(listaCM.get(count).getRecurso3() - recurso3);
                }
            }
            count = count + 1;
        }
    }

    public void Mejorar(int id) {
        int count = 0;

        for (ConstructorLista centromando : listaCM) {
            if (listaCM.get(count).id == id) {

                int calculo = 0;
                int MaxR1 = 10000;
                int MaxR2 = 5000;
                int MaxR3 = 3000;

                switch (listaCM.get(count).getNivel() + 1) {
                    case 1:
                        calculo = 10;
                        break;
                    case 2:
                        calculo = 30;
                        break;
                    case 3:
                        calculo = 50;
                        break;
                    default:
                        break;
                }

                MaxR1 = MaxR1 + ((MaxR1 * calculo) / 100);
                MaxR2 = MaxR2 + ((MaxR2 * calculo) / 100);
                MaxR2 = MaxR2 + ((MaxR3 * calculo) / 100);

                int optimizacion = ((25 * (MaxR1 + MaxR2 + MaxR3)) / 100) / 3;
                Pagar(id, optimizacion, optimizacion, optimizacion);

                if (listaCM.get(count).id == id && listaCM.get(count).nivel <= 3) {
                    listaCM.get(count).setNivel(listaCM.get(count).getNivel() + 1);
                    System.out.println("\033[32m¡HA SUBIDO DE NIVEL!");
                }
                
            }
            count = count + 1;
        }
    }

    public void Generador(int id, int recurso1, int recurso2, int recurso3) {
        int count = 0;
        for (ConstructorLista centromando : listaCM) {
            if (listaCM.get(count).id == id) {

                int calculo = 0;
                int MaxR1 = 10000;
                int MaxR2 = 5000;
                int MaxR3 = 3000;

                switch (listaCM.get(count).getNivel() + 1) {
                    case 1:
                        calculo = 10;
                        break;
                    case 2:
                        calculo = 30;
                        break;
                    case 3:
                        calculo = 50;
                        break;
                    default:
                        break;
                }

                MaxR1 = MaxR1 + ((MaxR1 * calculo) / 100);
                MaxR2 = MaxR2 + ((MaxR2 * calculo) / 100);
                MaxR2 = MaxR2 + ((MaxR3 * calculo) / 100);

                if (listaCM.get(count).getRecurso1() <= MaxR1 || listaCM.get(count).getRecurso2() <= MaxR2 || listaCM.get(count).getRecurso3() <= MaxR3) {
                    listaCM.get(count).setRecurso1(listaCM.get(count).getRecurso1() + recurso1);
                    listaCM.get(count).setRecurso2(listaCM.get(count).getRecurso2() + recurso2);
                    listaCM.get(count).setRecurso3(listaCM.get(count).getRecurso3() + recurso3);
                }
            }
            count = count + 1;
        }
    }

    public void agarrarAtaque(int id, int mira, int ataque) {
        int count = 0;
        for (ConstructorLista centromando : listaCM) {
            int fase = 0;
            if (listaCM.get(count).id == mira) {
                if (listaCM.get(count).vida == 0) {
                    if (id == 2) {
                        fase = 1;
                    } else {
                        fase = 2;
                    }
                    listaCM.remove(count);
                } else {
                    listaCM.get(count).setVida(listaCM.get(count).getVida() - ataque);
                }
            }
            count = count + 1; 
        }
    }
    
    
}
