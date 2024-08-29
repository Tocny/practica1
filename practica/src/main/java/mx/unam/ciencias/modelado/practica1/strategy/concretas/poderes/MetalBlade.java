package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto MetalBlade. extiende de {@link PoderAbstracto} */
public class MetalBlade extends PoderAbstracto{

    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public MetalBlade(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje sobre el que se aplica la accion.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre del poder.
     * @return La cadena "Metal Blade".
     */
    @Override public String nombrePoder(){
        return "Metal Blade";
    }
}