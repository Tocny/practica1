package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase de la defenza concreta Escudo. extiende de {@link DefenzaAbstracta} */
public class Escudo extends DefenzaAbstracta{
    /**Constructor de la clase. */
    public Escudo() {}

    /**
     * Implementación del método abstracto.
     * @return La cadena "Escudo".
     */
    @Override public String nombreDefenza(){
        return "Escudo";
    }
}