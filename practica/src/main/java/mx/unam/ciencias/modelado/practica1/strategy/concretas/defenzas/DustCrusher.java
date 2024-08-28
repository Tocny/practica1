package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase de la defenza concreta DustCrusher. extiende de {@link DefenzaAbstracta} */
public class DustCrusher extends DefenzaAbstracta{
    /**Constructor de la clase.*/
    public DustCrusher() {}

    /**
     * Implementación del método abstracto.
     * @return la cadena "DustCrusher"
     */
    @Override public String nombreDefenza(){
        return "DustCrusher";
    }
}