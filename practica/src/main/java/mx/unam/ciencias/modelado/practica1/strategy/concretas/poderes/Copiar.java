package mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes;

import mx.unam.ciencias.modelado.practica1.personajes.Personaje;
import mx.unam.ciencias.modelado.practica1.strategy.interfaces.Poder;
import java.util.ArrayList;

/**Clase del poder concreto Copiar. extiende de {@link PoderAbstracto} */
public class Copiar extends PoderAbstracto{
    /**Personaje base. */
    private Personaje personaje;
    /**Nombre particular del poder. */
    private String nombrePoder;
    /**La efectividad del poder sobre otro Personaje. */
    private String estadoDeEfectividad = "";

    /**
     * Para este poder si necesitamos una relacion fuerte entre las clases. 
     * @param personaje el personaje asociado al poder.
     * @param nombrePoder el nombre concreto del personaje.
     */
    public Copiar(Personaje personaje, String nombrePoder){
        this.personaje = personaje;
        this.nombrePoder = nombrePoder;
    }

    /**
     * Implementacion del poder concreto del personaje.
     * @param objetivo un objetivo al cual aplicarle el poder.
     */
    @Override public void poderConcreto(Personaje objetivo){
        if(personaje.getFranquicia() == objetivo.getFranquicia()){
            String nombre = personaje.getNombre();
            personaje = objetivo;
            personaje.setNombre(nombre);
        } else{
            estadoDeEfectividad = "(inefectivo)";
        }
    }

    /**
     * Implementación del método nombrePoder.
     * @return Una cadena con el nombre concreto del poder y si este fué o no efectivo.
     */
    @Override public String nombrePoder(){
        return nombrePoder + estadoDeEfectividad;
    }

}
