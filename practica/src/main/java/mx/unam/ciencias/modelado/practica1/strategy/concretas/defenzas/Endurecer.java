package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase de la defenza concreta Endurecer. extiende de {@link DefenzaAbstracta} */
public class Endurecer extends DefenzaAbstracta{
    /**Constructor de la clase. */
    public Endurecer() {}

    /**
     * Implementación del método abstracto. 
     * @return La cadena "Endurecer".
     */
    @Override public String nombreDefenza(){
        return "Endurecer";
    }
}