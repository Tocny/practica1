package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class Hielo extends PoderAbstracto{

    private double danioPoder = 10;

    /**Constructor de la clase. */
    public Hielo(){}

    /**Implementacion concreta del poder. */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**Implementación del getter del nombre. */
    @Override public String nombrePoder(){
        return "Hielo";
    }
}