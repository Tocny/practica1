package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase del ataque concreto Machetazo. extiende de {@link AtaqueAbstracto} */
public class Machetazo extends AtaqueAbstracto{
    /**Constructor de la clase */
    public Machetazo() {}

    /**
     * Implementación del método abstracto.
     * @return La cadena "Machetazo".
     */
    @Override public String nombreAtaque(){
        return "Machetazo";
    }
}