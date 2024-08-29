package mx.unam.ciencias.modelado.practica1.observer;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.files.ReaderWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz Observador acorde al patrón de diseño Observer.
 */
public class Espectador implements Observador{
    /**Identificador del espectador. */
    private String id;
    /**Personaje favorito que el espectador apoyará. */
    private Personaje personajeFavorito;
    /**La bitácora de eventos del combate. */
    private List<String> bitacora;
    /**Terminacion del archivo bitácora. */
    private String terminacion = ".txt";

    /**
     * Constructor de la clase, inicializa los atributos.
     * @param id el identificador del espectador.
     * @param personajeFavorito el personaje que apoya.
     */
    public Espectador(String id, Personaje personajeFavorito){
        this.id = id;
        this.personajeFavorito = personajeFavorito;
        bitacora = new ArrayList<>();
        bitacora.add("Espectador: " + id);
    }

    /**
     * Método para actualizar la bitácora con una nueva notificación.
     * @param novedad una cadena con un evento.
     */
    public void actualizar(String novedad){
        String notificación = novedad + "\t" +personajeFavorito.getEstado();
        bitacora.add(notificación);
    }

    /**Método para finalizar el combate con un mensaje personalizado. */
    public void guardarActualizaciones(){
        if(personajeFavorito.esGanador()){
            bitacora.add(personajeFavorito.getNombre() + " ha ganado el combate.");
        }else{
            bitacora.add(personajeFavorito.getNombre() + " ha perdido el combate.");
        }
        generaArchivo();
    }

    /**
     * ToString de la clase.
     * @return Una cadena con todos los eventos de la bitácora.
     */
    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        for(String evento: bitacora){
            sb.append(evento);
            sb.append("\n");
        }
        return sb.toString();
    }

    /**Método para guardar la bitácora en una archivo. */
    public void generaArchivo(){
        ReaderWriter.write(toString(), id + terminacion);
    }
}