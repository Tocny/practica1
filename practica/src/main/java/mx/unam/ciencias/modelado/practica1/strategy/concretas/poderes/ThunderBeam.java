package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto ThunderBeam. extiende de {@link PoderAbstracto} */
public class ThunderBeam extends PoderAbstracto{

    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public ThunderBeam(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo el personaje que recibe la acción.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre.
     * @return La cadena "Thunder Beam".
     */
    @Override public String nombrePoder(){
        return "Thunder Beam";
    }
}