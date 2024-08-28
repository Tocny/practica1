package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Endurecer extends DefenzaAbstracta{
    /**Constructor de la clase. */
    public Endurecer() {}

    /**Implementación del método abstracto. */
    @Override public String nombreDefenza(){
        return "Endurecer";
    }
}