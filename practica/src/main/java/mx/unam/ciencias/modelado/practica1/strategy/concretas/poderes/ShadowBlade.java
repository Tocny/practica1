package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class ShadowBlade extends PoderAbstracto{

    private double danioPoder = 20;

    public ShadowBlade(){}

    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    @Override public String nombrePoder(){
        return "Shadow Blade";
    }
}