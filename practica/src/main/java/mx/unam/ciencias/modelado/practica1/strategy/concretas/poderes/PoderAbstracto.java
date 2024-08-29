package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class PoderAbstracto implements Poder{
    
    /**Constructor de la clase */
    public PoderAbstracto() {}

    /**
     * Implementacion del ataque.
     * @param emisor el personaje que emite el poder.
     * @param objetivo el personaje que recibe los efectos del poder.
     * @return Una cadena que describe la acción.
     */
    @Override public String ejecutaPoder(Personaje emisor, Personaje objetivo){
        poderConcreto(objetivo);
        return "➳ " + emisor.getNombre() + " Usó el poder especial " + nombrePoder() + " contra " + objetivo.getNombre();
    }

    /**
     * Getter del nombre del poder.
     * @return el nombre del poder.
     */
    @Override public abstract String nombrePoder();

    /**
     * Método concreto del poder y su uso particular. 
     * @param objetivo el personaje que recibe la acción.
     */
    @Override public abstract void poderConcreto(Personaje objetivo);
}