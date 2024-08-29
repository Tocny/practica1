package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Interfaz para los ataques básicos.
 * Constituye un ataque de poco daño.
 */
public interface Ataque extends Accion{
    /**
     * Método de ejecución de ataque, requiere un emisor y un objetivo.
     * @param emisor el personaje que emite el ataque.
     * @param objetivo el personaje que recibe el ataque.
     * @return una descripción.
     */
    public String ejecutaAtaque(Personaje emisor, Personaje objetivo);

    /**
     * Método getter del Daño que hace el ataque, este depende de las clases concretas.
     * @return el daño que inflinge el ataque.
     * */
    public double getDanio();

    /**
     * Método para setear el daño del ataque.
     * @param danio el nuevo daño del ataque.
     */
    public void setDanio(double danio);

    /**
     * Getter del nombre del ataque.
     * @return una cadena con el nombre del ataque.
     */
    public String nombreAtaque();
}