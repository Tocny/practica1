package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class Curacion extends PoderAbstracto{

    private double curacion = 15;

    /**Constructor de la clase. */
    public Curacion(){}

    /**Implementacion concreta del poder. */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeCuracion(curacion);
    }

    /**Implementación del getter del nombre. */
    @Override public String nombrePoder(){
        return "Curacion";
    }
}