package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;

/**
 * Clase del objeto concreto SuperMushroom. extiende de {@link ObjetoAbstracto} 
 * El SuperMushroom es un item que incrementa el daño de los ataques básicos de un personaje.
 */
public class SuperMushroom extends ObjetoAbstracto{
    /**Incremento de daño del item. */
    private static final double INCREMENTO = 2;

    /**
     * Implementacion concreta del poder.
     * @param consumidor el personaje que consume el objeto.
     */
    @Override public void objetoConcreto(Personaje consumidor){
        Ataque ataque = consumidor.getAtaque();
        ataque.setDanio(ataque.getDanio() * INCREMENTO);
        consumidor.setAtaque(ataque);
    }

    /**
     * Implementación del método para el nombre del objeto.
     * @return La cadena "Super Mushroom".
     */
    @Override public String nombreObjeto(){
        return "Super Mushroom";
    }

    /**
     * Implementación del método descripción.
     * @return Una cadena que decribe el objeto SuperMushroom.
     */
    @Override public String descripcion(){
        return "Se incrementó su daño de ataque x" + INCREMENTO + ".";
    }
}