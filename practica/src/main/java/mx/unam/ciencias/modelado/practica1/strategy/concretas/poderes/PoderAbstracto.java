package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class PoderAbstracto implements Poder{
    /**Personaje que va a atacar. */
    protected Personaje personaje;
    /**Daño del ataque. */
    private static final double DANIO_PODER = 2;

    /**Constructor de la clase
     * @param personaje un personaje que deberá defenderse.
     */
    public PoderAbstracto(Personaje personaje) {
        this.personaje = personaje;
    }

    /**Implementacion del ataque. */
    @Override public String ejecutaPoder(Personaje objetivo){
        poderConcreto(objetivo);
        return personaje.getNombre() + " Usó el poder especial " + nombrePoder() + " contra " + objetivo.getNombre();
    }

    /**Setter del personaje asociado. */
    public void setPersonaje(Personaje personaje){
        this.personaje = personaje;
    }

    /**Getter del nombre de la defenza. */
    protected abstract String nombrePoder();

    /**Método concreto del poder y su uso particular. */
    protected abstract void poderConcreto(Personaje objetivo);
}