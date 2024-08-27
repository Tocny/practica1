package mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Defenza;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class DefenzaAbstracta implements Defenza{
    /**Personaje que se va a defender. */
    private Personaje personaje;

    /**Constructor de la clase
     * @param personaje un personaje que deberá defenderse.
     */
    public DefenzaAbstracta(Personaje personaje) {
        this.personaje = personaje;
    }

    /**Implementacion de la defenza. */
    @Override public String ejecutaDefenza(Personaje agresor){
        double danioReducido = Ataque.DANIO_ATAQUE;
        personaje.recibeCuracion(danioReducido);
        return personaje.getNombre() + " Usó " + nombreDefenza() + " contra el ataque de " + agresor.getNombre() + " y recibió la mitad del daño.";
    }

    /**Setter del personaje asociado. */
    public void setPersonaje(Personaje personaje){
        this.personaje = personaje;
    }

    /**Getter del nombre de la defenza. */
    protected abstract String nombreDefenza();
}