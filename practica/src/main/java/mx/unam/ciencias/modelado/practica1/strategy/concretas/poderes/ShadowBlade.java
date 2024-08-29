package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto ShadowBlade. extiende de {@link PoderAbstracto} */
public class ShadowBlade extends PoderAbstracto{

    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public ShadowBlade(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje que recibe la acción.s
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre.
     * @return La cadena "Shadow Blade"
     */
    @Override public String nombrePoder(){
        return "Shadow Blade";
    }
}