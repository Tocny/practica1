package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Interfaz para los poderes especiales de un personaje.
 */
public interface Poder extends Accion{
    /**
     * Método de ejecución del poder.
     * @param emisor el personeje que utiliza el poder.
     * @param objetivo el personaje afectado por el poder.
     * @return una descripción.
     */
    public String ejecutaPoder(Personaje emisor, Personaje objetivo);

    /**
     * Getter del nombre del poder.
     * @return una cadena con el nombre del poder.
     */
    public String nombrePoder();

    /**
     * Méodo para las acciones concretas del poder.
     * @param objetivo el personaje que recibe los efectos del poder.
     */
    public void poderConcreto(Personaje objetivo);
}