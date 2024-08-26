package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Poder extends Accion{
    public String ejecutaPoder(Personaje objetivo);
}