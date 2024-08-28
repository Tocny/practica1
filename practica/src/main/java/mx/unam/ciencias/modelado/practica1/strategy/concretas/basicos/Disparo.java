package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Disparo extends AtaqueAbstracto{
    /**Constructor de la clase. */
    public Disparo() {}

    /**Implementacion del método abstracto. */
    @Override public String nombreAtaque(){
        return "Disparo";
    }

}