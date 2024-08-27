package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Defenza extends Accion{
    public String ejecutaDefenza(Personaje agredido, Personaje agresor);
}