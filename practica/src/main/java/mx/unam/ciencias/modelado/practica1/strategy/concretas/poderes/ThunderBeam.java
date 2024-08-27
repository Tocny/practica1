package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class ThunderBeam extends PoderAbstracto{

    private double danioPoder = 20;

    public ThunderBeam(){}

    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    @Override public String nombrePoder(){
        return "Thunder Beam";
    }
}