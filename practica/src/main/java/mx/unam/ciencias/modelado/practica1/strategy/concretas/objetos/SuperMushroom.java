package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;

public class SuperMushroom extends ObjetoAbstracto{
    /**Curacion del item. */
    private static final double INCREMENTO = 2;

    /**Implementacion concreta del poder. */
    @Override public void objetoConcreto(Personaje consumidor){
        Ataque ataque = consumidor.getAtaque();
        ataque.setDanio(ataque.getDanio() * INCREMENTO);
        consumidor.setAtaque(ataque);
    }

    /**Implementación del getter del nombre. */
    @Override public String nombreObjeto(){
        return "Super Mushroom";
    }

    @Override public String descripcion(){
        return "Se incrementó su daño de ataque X" + INCREMENTO + ".";
    }
}