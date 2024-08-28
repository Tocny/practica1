package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de los ataques de los personajes.
 * Todos los ataques esencialmente funcionan igual, por eso se abstrae esta clase.
 */
public abstract class AtaqueAbstracto implements Ataque{
    /**Daño del ataque. */
    private double danio = 5;

    /**Constructor de la clase */
    public AtaqueAbstracto() {}

    /**
     * Implementación del método de ejecución.
     * @param emisor el personaje que ejcuta el ataque.
     * @param objetivo el personaje que recibe el ataque.
     * @return una cadena que describe el ataque ocurrido.
     */
    @Override public String ejecutaAtaque(Personaje emisor, Personaje objetivo){
        objetivo.recibeDanio(danio);
        return "➢ " + emisor.getNombre() + " casteó " + nombreAtaque() + " contra " + objetivo.getNombre();
    }

    /**
     * getter del daño del ataque.
     * @return el valor del atributo danio.
     */
    @Override public double getDanio(){
        return danio;
    }

    /**
     * Setter del daño del ataque.
     * @param danio el nuevo valor del atributo danio.
     */
    @Override public void setDanio(double danio){
        this.danio = danio;
    }

    /**
     * Getter del nombre del ataque.
     * @return una cadena con el nombre del ataque.
     */
    @Override public abstract String nombreAtaque();
}