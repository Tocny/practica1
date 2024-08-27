package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class AtaqueAbstracto implements Ataque{
    /**Daño del ataque. */
    private final double DANIO = 1;

    /**Implementacion del ataque. */
    @Override public String ejecutaAtaque(Personaje emisor, Personaje objetivo){
        objetivo.recibeDanio(DANIO);
        return (emisor.getNombre() + " casteó " + nombreAtaque() + " contra " + objetivo.getNombre());
    }

    /**Getter del nombre de la defenza. */
    protected abstract String nombreAtaque();
}