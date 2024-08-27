package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import java.util.ArrayList;

public class Copiar extends PoderAbstracto{

    public Copiar(Personaje personaje){
        super(personaje);
    }

    /**
     * Implementacion del poder concreto del personaje.
     * @param objetivo un objetivo al cual aplicarle el poder.
     */
    @Override public void poderConcreto(Personaje objetivo){
        if(super.personaje.getFranquicia() == objetivo.getFranquicia()){
            super.setPersonaje(objetivo);
            super.personaje.setAtaqueBasico(objetivo.getAtaqueBasico());
            super.personaje.setDefenza(objetivo.getDefenza());
            super.personaje.setPoderes(new ArrayList<Poder>());
            for(Poder poder : objetivo.getPoderes()){
                personaje.agregarPoder(poder);
            }
        }
    }

    @Override public String nombrePoder(){
        return "Copiar";
    }

}
