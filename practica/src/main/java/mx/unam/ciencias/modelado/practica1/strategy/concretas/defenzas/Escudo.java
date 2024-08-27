package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Escudo extends DefenzaAbstracta{
    /**Constructor de la clase. */
    public Escudo() {}

    /**Implementación del método abstracto. */
    @Override public String nombreDefenza(){
        return "Escudo";
    }
}