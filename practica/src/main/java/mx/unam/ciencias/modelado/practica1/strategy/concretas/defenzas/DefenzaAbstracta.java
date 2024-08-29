package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos.AtaqueAbstracto;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Defenza;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan esencialmente igual, por eso se abstrae esta clase.
 */
public abstract class DefenzaAbstracta implements Defenza{
    /**Daño reducido. */
    private double danioReducido = 5;

    /**Constructor de la clase */
    public DefenzaAbstracta() {}

    /**
     * Implementacion de la defenza.
     * @param agredido el personaje que recibió el ataque.
     * @param agresor el presonaje que emitió el ataque.
     * @return una cadena con el evento sucitado.
     */
    @Override public String ejecutaDefenza(Personaje agredido, Personaje agresor){
        agredido.recibeCuracion(danioReducido);
        return "\t↳" + agredido.getNombre() + " Usó " + nombreDefenza() + " para defenderse contra el ataque de " + agresor.getNombre();
    }

    /**
     * Getter del daño que mitiga la defenza.
     * @return el valor del atributo danioReducido.
     */
    @Override public double getDanioReducido(){
        return danioReducido;
    }

    /**
     * Setter del daño que reduce la defenza.
     * @param danioReducido el nuevo valor del atributo danioReducido.
     */
    @Override public void setDanioReducido(double danioReducido){
        this.danioReducido = danioReducido;
    }

    /**
     * Getter del nombre de la defenza.
     * @return una cadena con el nombre de la defenza.
     */
    @Override public abstract String nombreDefenza();
}