package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

public interface Objeto extends Accion{
    public String consumirObjeto(Personaje consumidor);
    /**Método concreto del poder y su uso particular. */
    public void objetoConcreto(Personaje consumidor);
    /**Getter del nombre del objeto. */
    public String nombreObjeto();
    /**Getter de la descripcion del objeto. */
    public String descripcion();
}