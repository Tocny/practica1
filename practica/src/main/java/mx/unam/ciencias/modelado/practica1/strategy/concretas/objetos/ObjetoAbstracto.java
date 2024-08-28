package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Objeto;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para la ejecución de la defenza de los personajes.
 * Todas las defenzas funcionan igual, por eso se abstrae esta clase.
 */
public abstract class ObjetoAbstracto implements Objeto{

    /**Constructor de la clase */
    public ObjetoAbstracto() {}

    /**Implementacion de la defenza. */
    @Override public String consumirObjeto(Personaje consumidor){
        objetoConcreto(consumidor);
        return consumidor.getEstado() + " Usó el item " + nombreObjeto() + ", " + descripcion();
    }

    /**Método concreto del poder y su uso particular. */
    @Override public abstract void objetoConcreto(Personaje consumidor);

    /**Getter del nombre de la defenza. */
    @Override public abstract String nombreObjeto();

    /**Getter de la descripcion del objeto. */
    @Override public abstract String descripcion();
}