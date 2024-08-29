package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto Fuego. extiende de {@link PoderAbstracto} */
public class Fuego extends PoderAbstracto{
    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public Fuego(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje sobre el que se realiza la accion.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre.
     * @return La cadena "Fuego".
     */
    @Override public String nombrePoder(){
        return "Fuego";
    }
}