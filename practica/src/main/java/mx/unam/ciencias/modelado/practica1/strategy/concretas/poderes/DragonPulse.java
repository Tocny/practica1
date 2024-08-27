package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class DragonPulse extends PoderAbstracto{

    private double danioPoder = 20;

    public DragonPulse(Personaje personaje){
        super(personaje);
    }

    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    @Override public String nombrePoder(){
        return "Dragon Pulse";
    }
}