package mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public class Disparo extends AtaqueAbstracto{
    /**Constructor de la clase
     * @param personaje un personaje que deberá defenderse.
     */
    public Disparo(Personaje personaje) {
        super(personaje);
    }

    @Override public String nombreAtaque(){
        return "Disparo";
    }

}