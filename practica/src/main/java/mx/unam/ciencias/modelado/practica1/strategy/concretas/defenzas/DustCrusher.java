package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class DustCrusher extends DefenzaAbstracta{
    /**Constructor de la clase.*/
    public DustCrusher() {}

    /**Implementación del método abstracto. */
    @Override public String nombreDefenza(){
        return "DustCrusher";
    }
}