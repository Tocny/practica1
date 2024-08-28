package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class AtaqueAbstracto implements Ataque{
    /**Daño del ataque. */
    private double danio = 5;

    /**Implementacion del ataque. */
    @Override public String ejecutaAtaque(Personaje emisor, Personaje objetivo){
        objetivo.recibeDanio(danio);
        return (emisor.getEstado() + " casteó " + nombreAtaque() + " contra " + objetivo.getEstado());
    }

    @Override public double getDanio(){
        return danio;
    }

    @Override public void setDanio(double danio){
        this.danio = danio;
    }

    /**Getter del nombre de la defenza. */
    @Override public abstract String nombreAtaque();
}