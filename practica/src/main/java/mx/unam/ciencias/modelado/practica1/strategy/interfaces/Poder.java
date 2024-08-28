package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Poder extends Accion{
    public String ejecutaPoder(Personaje emisor, Personaje objetivo);
    public String nombrePoder();
    public void poderConcreto(Personaje objetivo);
}