package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto DragonPulse. extiende de {@link PoderAbstracto} */
public class DragonPulse extends PoderAbstracto{

    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public DragonPulse(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje sobre el que se ejecuta la accion.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre del poder.
     * @return La cadena "Dragon Pulse".
     */
    @Override public String nombrePoder(){
        return "Dragon Pulse";
    }
}