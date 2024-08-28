package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase del ataque concreto Golpe. extiende de {@link AtaqueAbstracto} */
public class Golpe extends AtaqueAbstracto{
    /**Constructor de la clase */
    public Golpe() {}

    /**
     * Implementación del método abstracto. 
     * @return La cadena "Golpe".
     */
    @Override public String nombreAtaque(){
        return "Golpe";
    }

}