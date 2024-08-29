package mx.unam.ciencias.modelado.practica1.strategy.concretas.objetos;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;

/**Clase del objeto concreto Panacea. extiende de {@link ObjetoAbstracto} 
 * La panacea es un item que cura 100 puntos de vida.
 */
public class Panacea extends ObjetoAbstracto{
    /**Curacion del item. */
    private static final double CURACION = 100;

    /**
     * Implementacion concreta del poder.
     * @param consumidor el personaje que consume el objeto.
     */
    @Override public void objetoConcreto(Personaje consumidor){
        consumidor.recibeCuracion(CURACION);
    }

    /**
     * Implementación del getter del nombre.
     * @return La cadena "Panacea".
     */
    @Override public String nombreObjeto(){
        return "Panacea";
    }

    /**
     * Implementación de la descripción.
     * @return Una cadena que describe la función del objeto Panacea.
     */
    @Override public String descripcion(){
        return "se restauraron" + CURACION + "puntos de vida.";
    }
}