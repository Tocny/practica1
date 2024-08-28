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

    /**Implementacion del ataque. */
    @Override public String ejecutaPoder(Personaje emisor, Personaje objetivo){
        poderConcreto(objetivo);
        return emisor.getEstado() + " Usó el poder especial " + nombrePoder() + " contra " + objetivo.getEstado();
    }

    /**Getter del nombre del poder. */
    @Override public abstract String nombrePoder();

    /**Método concreto del poder y su uso particular. */
    @Override public abstract void poderConcreto(Personaje objetivo);
}