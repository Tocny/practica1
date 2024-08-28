package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Machetazo extends AtaqueAbstracto{
    /**Constructor de la clase */
    public Machetazo() {}

    /**Implementación del método abstracto. */
    @Override public String nombreAtaque(){
        return "Machetazo";
    }
}