package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto Azote. extiende de {@link PoderAbstracto} */
public class Azote extends PoderAbstracto{
    /**Daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public Azote(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje sobre el que se ejcuta el poder.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre del poder.
     * @return la cadena "Azote"
     */
    @Override public String nombrePoder(){
        return "Azote";
    }
}