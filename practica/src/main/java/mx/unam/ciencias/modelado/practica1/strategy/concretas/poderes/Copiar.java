package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

public class Copiar extends PoderAbstracto{

    public Copiar(Personaje personaje){
        supe(personaje);
    }

    @Override public void poderConcreto(Personaje objetivo){
        if(super.personaje.getFranquicia() == objetivo.getFranquicia()){
            super.setPersonaje(objetivo);
        }
    }

    @Override public String nombrePoder(){
        return "Copiar.";
    }

}
