package mx.unam.ciencias.modelado.practica1.observer;

import java.util.ArrayList;
import java.util.List;

public class Combate implements Sujeto{
    /**Lista de espectadores. */
    private List<Observador> espectadores;

    /**Constructor de la clase, inicializa la lista de espectadores. */
    public Combate(){
        this.espectadores = new ArrayList<>();
    }

    /**
     * Método que agrega un observador a la lista de espectadores.
     * @param observador una instancia de la interfaz Observador.
     */
    public void registrarObservador(Observador observador){
        espectadores.add(observador);
    }

    /**
     * Método que elimina un observador de la lista de espectadores.
     * @param observador una instancia de la interfaz Observador.
     */
    public void eliminarObservador(Observador observador){
        espectadores.remove(observador);
    }

    /**
     * Método que manda una notificacion a todos los espectadores.
     * @param novedad una novedad que ha de notificarse.
     */
    public void notificarObservadores(String novedad){
        for(Observador espectador: espectadores){
            espectador.actualizar(novedad);
        }
    }

}