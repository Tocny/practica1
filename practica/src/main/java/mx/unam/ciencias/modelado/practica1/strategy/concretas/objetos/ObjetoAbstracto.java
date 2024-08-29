package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Objeto;
import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Clase abstracta para los objetos de los personajes.
 * No todos los objetos funcionan igual, pero el mensaje tiende a ser el mismo.
 */
public abstract class ObjetoAbstracto implements Objeto{

    /**Constructor de la clase */
    public ObjetoAbstracto() {}

    /**
     * Implementacion de la accion consumirObjeto.
     * @param consumidor el personaje que consume el objeto.
     */
    @Override public String consumirObjeto(Personaje consumidor){
        objetoConcreto(consumidor);
        return "✦ " + consumidor.getNombre() + " Usó el item " + nombreObjeto() + ", " + descripcion();
    }

    /**
     * Método concreto del poder y su uso particular.
     * @param consumidor el personaje que experimenta los efectos del objeto.
     */
    @Override public abstract void objetoConcreto(Personaje consumidor);

    /**
     * Getter del nombre de la defenza.
     * @return una cadena con el nombre del objeto.
     */
    @Override public abstract String nombreObjeto();

    /**
     * Getter de la descripcion del objeto.
     * @return una cadena describiendo qué hace el objeto. 
     */
    @Override public abstract String descripcion();
}