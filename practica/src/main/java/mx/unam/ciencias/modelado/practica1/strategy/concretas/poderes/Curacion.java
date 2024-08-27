package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class Curacion extends PoderAbstracto{

    private double curacion = 15;

    public Curacion(Personaje personaje){
        super(personaje);
    }

    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeCuracion(curacion);
    }

    @Override public String nombrePoder(){
        return "Curacion";
    }
}