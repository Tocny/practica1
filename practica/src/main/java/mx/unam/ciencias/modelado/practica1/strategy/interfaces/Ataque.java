package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Ataque extends Accion{
    public String ejecutaAtaque(Personaje emisor, Personaje objetivo);
    public double getDanio();
    public void setDanio(double danio);
    public String nombreAtaque();
}