package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Ataque extends Accion{
    String ejecutaAtaque(Personaje objetivo);
}