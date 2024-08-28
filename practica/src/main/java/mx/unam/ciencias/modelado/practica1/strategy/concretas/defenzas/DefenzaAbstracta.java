package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos.AtaqueAbstracto;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Defenza;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class DefenzaAbstracta implements Defenza{
    /**Daño reducido */
    private static final double DANIO_REDUCIDO = 1;

    /**Constructor de la clase */
    public DefenzaAbstracta() {}

    /**Implementacion de la defenza. */
    @Override public String ejecutaDefenza(Personaje agredido, Personaje agresor){
        agredido.recibeCuracion(DANIO_REDUCIDO);
        return agredido.getEstado() + " Usó " + nombreDefenza() + " para defenderse contra el ataque de " + agresor.getEstado();
    }

    /**Getter del nombre de la defenza. */
    protected abstract String nombreDefenza();
}