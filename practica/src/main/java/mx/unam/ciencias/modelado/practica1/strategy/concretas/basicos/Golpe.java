package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Golpe extends AtaqueAbstracto{
    /**Constructor de la clase */
    public Golpe() {}

    /**Implementación del método abstracto. */
    @Override public String nombreAtaque(){
        return "Golpe";
    }

}