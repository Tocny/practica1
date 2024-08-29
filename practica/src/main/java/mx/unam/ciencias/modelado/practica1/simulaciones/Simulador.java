package mx.unam.ciencias.modelado.practica1.simulaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import mx.unam.ciencias.modelado.practica1.observer.*;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos.*;

public class Simulador{
    /**Instancia de combate. */
    private Combate combate;
    /**Lista de personajes. */
    private List<Personaje> personajes;
    /**Objetos que pueden desplegarse durante la simulación. */
    private List<Objeto> objetos;
    /**Instancia de random. */
    private Random random;

    /**
     * Constructor de la clase, inicializa los atributos.
     * @param combate una instancia de {@link Combate}
     * @param personajes una lista de instancias de {@link Personaje}
     */
    public Simulador(Combate combate, List<Personaje> personajes){
        this.combate = combate;
        this.personajes = personajes;
        this.random = new Random();
        objetos = new ArrayList<>();
        listaObjetos();
        for(Personaje personaje : personajes){
            personaje.setItems(objetos);
        }
    }

    /**Método que empieza la simulación aleatoria. */
    public void simular(){
        while(personajesVivos() > 1){
            Personaje personajeAleatorio = personajeAleatorio();
            accionAleatoria(personajeAleatorio);
        }

        Personaje ganador = ganador();
        String evento = "<<<<" + ganador.getNombre() +  ">>>> Ha ganado el combate.";
        combate.notificarObservadores(evento);
        combate.finDelCombate();
    }

    /**
     * Método que construye una lista de objetos que podran ser usados en la simulación.
     */
    private void listaObjetos(){
        objetos.add(new SuperMushroom());
        objetos.add(new Panacea());
        objetos.add(new BombaSmash(personajes));
    }

    /**
     * Método que devuelve el número de personajes vivos en el combate.
     * @return el número de personajes vivos de la lista personajes.
     */
    private int personajesVivos(){
        int vivos = 0;
        for(Personaje personaje: personajes){
            if(personaje.getHP() > 0){
                vivos++;
            }
        }
        return vivos;
    }

    /**
     * Método que toma un personaje aleatorio de la lista de personajes.
     * @return un personaje aleatorio.
     */
    private Personaje personajeAleatorio(){
        int indiceAleatorio = random.nextInt(personajes.size());
        Personaje personaje = personajes.get(indiceAleatorio);

        //En caso de que esté muerto.
        if(personaje.getHP() <= 0){
            return personajeAleatorio();
        }

        return personaje;
    }

    /**
     * Método que toma un objetivo aleatorio de la lista de personajes.
     * @param personaje Se trata de un personaje emisor de una accion.
     * @return un personaje aleatorio que será objetivo del personaje del parámetro.
     */
    private Personaje objetivoAleatorio(Personaje personaje){
        Personaje objetivo = personajeAleatorio();
        
        while(personaje == objetivo){
            objetivo = personajeAleatorio();
        }

        return objetivo;
    }

    /**
     * Método que ejecuta una accion aleatoria de un personaje sobre otro.
     * O bien, de un personaje tomando un item o poder de la arena.
     * @param personaje una instancia de personaje.
     */
    private void accionAleatoria(Personaje personaje){
        //Una cadena que representa un evento.
        String evento = "";

        //Acción aleatoria.
        List<Accion> acciones = personaje.getAcciones();
        int indiceAleatorio = random.nextInt(acciones.size());
        Accion accionAleatoria = acciones.get(indiceAleatorio);

        //Para los casos respectivos de la accion seleccionada.
        if(accionAleatoria instanceof Ataque || accionAleatoria instanceof Poder){
            //Objetivo aleatorio.
            Personaje objetivo = objetivoAleatorio(personaje);
            boolean objetivoSeDefiende = random.nextBoolean() && (objetivo.getHP() > 0);

            evento = personaje.ejecutaAccion(accionAleatoria, objetivo);

            if(objetivoSeDefiende){
                evento += "\n" + objetivo.ejecutaAccion(objetivo.getDefenza(), personaje);
            }

            if(objetivo.getHP() <= 0){
                evento += "\n" + objetivo.getNombre() + " Ha muerto por el ataque de " + personaje.getNombre();
            }

        } else if(accionAleatoria instanceof Objeto){
            evento = personaje.ejecutaAccion(accionAleatoria, personaje);
        }

        combate.notificarObservadores(evento);
    }

    /**
     * Método que obtiene el ganador después de una simulación.
     * @return el único personaje con vida.
     */
    private Personaje ganador(){
        for(Personaje personaje : personajes){
            if(personaje.getHP() > 0){
                personaje.setGanador(true);
                return personaje;
            }
        }
        return null;
    }

}