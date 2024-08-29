package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import java.util.List;

/**
 * Clase del objeto concreto BombaSmash. extiende de {@link ObjetoAbstracto} 
 * La BombaSmash es un item que hace daño a todos los personaejs excepto al que utiliza el objeto.
 */
public class BombaSmash extends ObjetoAbstracto{

    /**Lista de personajes. */
    private List<Personaje> personajes;
    /**Daño del ataque. */
    private double DANIO = 20;

    /**
     * Constructor de la clase.
     * @param personajes una lista de personajes a los que afectará el item.
     */
    public BombaSmash(List<Personaje> personajes){
        this.personajes = personajes;
    }

    /**
     * Implementación concreta del poder.
     * @param consumidor el personaje que consume el objeto.
     */
    @Override public void objetoConcreto(Personaje consumidor){
        for(Personaje personaje : personajes){
            if(!(personaje == consumidor)){
                personaje.recibeDanio(DANIO);
            }
        }
    }

    /**
     * Implementación del método nombre para el objeto.
     * @return La cadena "Bomba Smash".
     */
    @Override public String nombreObjeto(){
        return "Bomba Smash";
    }

    /**
     * Implementación del método para la descripción.
     * @return Una cadena que describe las acciones del objeto BombaSmash.
     */
    @Override public String descripcion(){
        return "todos los personajes recibieron " + DANIO + " de daño.";
    }
}