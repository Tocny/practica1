package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Ataque;

/**Clase del poder concreto Hielo. extiende de {@link PoderAbstracto} */
public class Hielo extends PoderAbstracto{

    /**Una reducción de daño. */
    private double reduccion = 2;

    /**Constructor de la clase. */
    public Hielo(){}

    /**
     * Implementacion concreta del poder. 
     * @param objetivo el personaje sobre el cual se aplica la accion.
     * Este poder en particular reduce el daño del ataque básico de un personaje.
     */
    @Override public void poderConcreto(Personaje objetivo){
        Ataque ataque = objetivo.getAtaque();
        double danio = ataque.getDanio();
        ataque.setDanio(danio/reduccion);
        objetivo.setAtaque(ataque);
    }

    /**
     * Implementación del getter del nombre.
     * @return La cadena "Hielo".
     */
    @Override public String nombrePoder(){
        return "Hielo";
    }
}