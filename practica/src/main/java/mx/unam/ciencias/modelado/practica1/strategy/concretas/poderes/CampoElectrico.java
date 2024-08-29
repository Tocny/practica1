package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;

/**Clase del poder concreto CampoElectrico. extiende de {@link PoderAbstracto} */
public class CampoElectrico extends PoderAbstracto{

    /**El daño del poder. */
    private double danioPoder = 20;

    /**Constructor de la clase. */
    public CampoElectrico(){}

    /**
     * Implementación concreta del poder.
     * @param objetivo un personaje sobre el que se ejcuta la accion.
     */
    @Override public void poderConcreto(Personaje objetivo){
        objetivo.recibeDanio(danioPoder);
    }

    /**
     * Getter del nombre del poder.
     * @return La cadena "Campo Eléctrico".
     */
    @Override public String nombrePoder(){
        return "Campo Eléctrico";
    }
}