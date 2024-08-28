package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Interfaz de la Defenza de un personaje.
 */
public interface Defenza extends Accion{
    /**
     * Método de ejecución de la defenza, requiere de un agresor y un agredido.
     * @param agredido el personaje que recibió el ataque.
     * @param agresor el personaje que emitió el ataque.
     * @return una descripción.
     */
    public String ejecutaDefenza(Personaje agredido, Personaje agresor);

    /**
     * Método getter de la defenza que hace la accion, este depende de las clases concretas.
     * @return el daño que niega la defenza.
     * */
    public double getDanioReducido();

    /**
     * Método para setear el daño negado del ataque.
     * @param danioReducido el nuevo valor de la negación de daño.
     */
    public void setDanioReducido(double danioReducido);


    /**Getter del nombre de la defenza. */
    public String nombreDefenza();
}