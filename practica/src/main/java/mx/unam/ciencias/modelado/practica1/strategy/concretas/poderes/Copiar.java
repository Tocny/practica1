package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import java.util.ArrayList;

public class Copiar extends PoderAbstracto{
    /**Personaje base. */
    private Personaje personaje;
    /**Nombre particular del poder. */
    private String nombrePoder;

    /**Para este poder si necesitamos una relacion fuerte entre las clases. */
    public Copiar(Personaje personaje, String nombrePoder){
        this.personaje = personaje;
        this.nombrePoder = nombrePoder;
    }

    /**
     * Implementacion del poder concreto del personaje.
     * @param objetivo un objetivo al cual aplicarle el poder.
     */
    @Override public void poderConcreto(Personaje objetivo){
        if(personaje.getFranquicia() == objetivo.getFranquicia()){
            String nombre = personaje.getNombre();
            personaje = objetivo;
            personaje.setNombre(nombre);
        }
    }

    /**Implementación del método nombrePoder. */
    @Override public String nombrePoder(){
        return nombrePoder;
    }

}
