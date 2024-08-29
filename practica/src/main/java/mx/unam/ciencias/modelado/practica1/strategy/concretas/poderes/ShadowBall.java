package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto ShadowBall. extiende de {@link PoderAbstracto} */
public class ShadowBall extends PoderAbstracto{

    /**EL daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public ShadowBall(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje que recibe la acción.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre.
     * @return La cadena "Shadow Ball".
     */
    @Override public String nombrePoder(){
        return "Shadow Ball";
    }
}