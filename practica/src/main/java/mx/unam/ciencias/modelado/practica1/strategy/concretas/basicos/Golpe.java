package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Golpe extends AtaqueAbstracto{
    /**Constructor de la clase
     * @param personaje un personaje que deberá defenderse.
     */
    public Golpe(Personaje personaje) {
        super(personaje);
    }

    @Override nombreAtaque(){
        return "golpe";
    }

}