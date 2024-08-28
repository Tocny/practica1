package mx.unam.ciencias.modelado.practica1.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Combate representa el contexto de un combate en el que se pueden registrar
 * observadores (observadores), notificarles novedades y gestionar el fin del combate.
 * Implementa la interfaz Sujeto, siguiendo el patrón de diseño Observer.
 */
public class Combate implements Sujeto {

    /** Lista de observadores que están observando el combate. */
    private List<Observador> observadores;

    /**Constructor de la clase Combate.*/
    public Combate() {
        this.observadores = new ArrayList<>();
    }

    /**
     * Registra un nuevo observador en la lista de observadores.
     * Este observador recibirá notificaciones de las novedades del combate.
     * @param observador una instancia de la interfaz {@link Observador}.
     */
    @Override public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    /**
     * Elimina un observador de la lista de observadores.
     * Este observador dejará de recibir notificaciones de las novedades del combate.
     * @param observador una instancia de la interfaz {@link Observador}.
     */
    @Override public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    /**
     * Notifica a todos los observadores registrados sobre una novedad en el combate.
     * @param novedad una cadena de texto que describe la novedad que ha ocurrido en el combate.
     */
    @Override public void notificarObservadores(String novedad) {
        for (Observador observador : observadores) {
            observador.actualizar(novedad);
        }
    }

    /**Finaliza el combate y solicita a todos los observadores que guarden sus actualizaciones. */
    public void finDelCombate() {
        for (Observador observador : observadores) {
            if(observador instanceof Observador){
                Espectador espectador = (Espectador) observador;
                espectador.guardarActualizaciones(); 
            }
        }
    }
}
