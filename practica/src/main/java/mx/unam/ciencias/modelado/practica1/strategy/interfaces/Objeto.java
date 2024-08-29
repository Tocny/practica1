package mx.unam.ciencias.modelado.practica1.strategy.interfaces;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**
 * Interfaz para objetos consumibles durante un combate.
 */
public interface Objeto extends Accion{

    /**
     * Método para cons
     * @param consumidor el personaje que consume el objeto.
     * @return una descripción.
     **/
    public String consumirObjeto(Personaje consumidor);

    /**
     * Método concreto del poder y su uso particular. 
     * @param consumidor el personaje que consume.
     * */
    public void objetoConcreto(Personaje consumidor);

    /**
     * Getter del nombre del objeto. 
     * @return una cadena con el nombre del objeto.
     */
    public String nombreObjeto();

    /**
     * Getter de la descripcion del objeto.
     * @return una cadena descriptiva.
     */
    public String descripcion();
}