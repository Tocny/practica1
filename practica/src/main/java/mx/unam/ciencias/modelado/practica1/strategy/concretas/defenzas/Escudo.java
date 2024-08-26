package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class DustCrusher extends DefenzaAbstracta{
    /**Constructor de la clase
     * @param personaje un personaje que deberá defenderse.
     */
    public DustCrusher(Personaje personaje) {
        super(personaje);
    }

    @Override public String nombreDefenza(){
        return "Escudo";
    }
}