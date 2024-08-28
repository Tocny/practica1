package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase del ataque concreto Disparo. extiende de {@link AtaqueAbstracto} */
public class Disparo extends AtaqueAbstracto{
    /**Constructor de la clase. */
    public Disparo() {}

    /**
     * Implementacion del método abstracto.
     * @return la cadena "Disparo".
     */
    @Override public String nombreAtaque(){
        return "Disparo";
    }

}