package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Panacea extends ObjetoAbstracto{
    /**Curacion del item. */
    private static final double CURACION = 100;

    /**Implementacion concreta del poder. */
    @Override public void objetoConcreto(Personaje consumidor){
        consumidor.recibeCuracion(CURACION);
    }

    /**Implementación del getter del nombre. */
    @Override public String nombreObjeto(){
        return "Panacea";
    }

    @Override public String descripcion(){
        return "se restauraron todos sus puntos de vida.";
    }
}