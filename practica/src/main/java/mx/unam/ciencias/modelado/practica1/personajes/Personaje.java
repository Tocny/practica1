package mx.unam.ciencias.modelado.practica1.personajes;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase base de todos los personajes. Define el comportamiento general de los personajes.
 */
public class Personaje{
    /**Nombre del personaje. */
    protected String nombre;
    /**Puntos de vida. */
    protected double hp = 100;
    /**Ataque básico. */
    protected Ataque ataque;
    /**Defenza. */
    protected Defenza defenza;
    /**Lista de poderes. */
    protected List<Poder> poderes;
    /**Lista de items. */
    protected List<Objeto> items;
    /**Franquicia a la que pertenece. */
    protected Franquicia franquicia;
    /**Un indicador de ser ganador o no. */
    public boolean ganador;

    /**
     * Constructor de la clase.
     * @param nombre el nombre del personaje.
     * @param franquicia la franquicia a la que pertenece.
     */
    public Personaje(String nombre, Franquicia franquicia){
        this.nombre = nombre;
        this.hp = hp;
        this.franquicia = franquicia;
        poderes = new ArrayList<>();
        items = new ArrayList<>();
        ganador = false;
    }

    /**
     * Metodo que maneja todas las posibles acciones que puede ejecutar el personaje.
     * @param accion la acción que se va a ejecutar.
     * @param objetivo donde se va a aplicar la acción.
     * @return descripción del evento que se ejecutó.
     */
    public String ejecutaAccion(Accion accion, Personaje objetivo){
        String evento = "";

        if(accion == this.defenza){
            evento = defenza(objetivo);

        } else if(accion == this.ataque){
            evento = ataque(objetivo);

        } else if(poderes.contains(accion)){
            int indice = poderes.indexOf(accion);
            Poder poder = poderes.get(indice);
            evento = poder.ejecutaPoder(this, objetivo);

        } else if(items.contains(accion)){
            Objeto item = (Objeto) accion;
            evento = item.consumirObjeto(this);
        }

        return evento;
    }

    /**
     * Método particular de la defenza.
     * @param agresor el personaje que está emitiendo el ataque sobre el de la clase.
     */
    public String defenza(Personaje agresor){
        return defenza.ejecutaDefenza(this, agresor);
    }

    /**
     * Método particular de la defenza.
     * @param objetivo el personaje sobre quien se ejecuta el ataque.
     */
    public String ataque(Personaje objetivo){
        return ataque.ejecutaAtaque(this, objetivo);
    }

    /**
     * Método que recopila todas las acciones del personaje.
     * @return una lista de acciones.
     */
    public ArrayList<Accion> getAcciones(){
        ArrayList<Accion> lista = new ArrayList<Accion>();
        lista.add(ataque);
        for(Poder poder : poderes){
            lista.add((Accion) poder);
        }
        for(Objeto item : items){
            lista.add((Accion) item);
        }
        return lista;
    }

    /**
     * Getter de la franquicia.
     * @return la franquicia a la que pertenece el personaje.
     */
    public Franquicia getFranquicia(){
        return franquicia;
    }

    /**
     * Getter del ataque.
     * @return el ataque básico del personaje.
     */
    public Ataque getAtaque(){
        return ataque;
    }

    /**
     * Setter del ataque.
     * @param ataque el nuevo ataque.
     */
    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }

    /**
     * Getter de la defenza.
     * @return la defenza del personaje.
     */
    public Defenza getDefenza(){
        return defenza;
    }

    /**
     * Setter de la defenza.
     * @param defenza la nueva defenza.
     */
    public void setDefenza(Defenza defenza){
        this.defenza = defenza;
    }

    /**
     * getter de los poderes del personaje.
     * @return una lista de poderes.
     */
    public List<Poder> getPoderes(){
        return poderes;
    }

    /**
     * Setter de los poderes.
     * @param poderes la nueva lista de poderes.
     */
    public void setPoderes(List<Poder> poderes){
        this.poderes = poderes;
    }
    
    /**
     * Método para agregar poderes.
     * @param poder el nuevo poder.
     */
    public void agregarPoder(Poder poder){
        poderes.add(poder);
    }

    /**
     * setter del atributo ganador.
     * @param ganador un booleano que indique el nuevo valor de this.ganador.
     */
    public void setGanador(boolean ganador){
        this.ganador = ganador;
    }

    /**Indicador si el atributo ganador es verdadero. */
    public boolean esGanador(){
        return ganador == true;
    }

    /**
     * Getter de los items.
     * @return la lista de items del personaje.
     */
    public List<Objeto> getItems(){
        return items;
    }

    /**
     * Setter de los items.
     * @param items la nueva lista de items.
     */
    public void setItems(List<Objeto> items){
        this.items = items;
    }

    /**
     * Método para agregar un item a la lista.
     * @param objeto el nuevo item.
     */
    public void agregaItem(Objeto objeto){
        items.add(objeto);
    }

    /**
     * getter de los puntos de vida.
     * @return el valor de hp.
     */
    public double getHP(){
        return hp;
    }

    /**
     * Método para recibir daños.
     * @param danio la cantidad de daño.
     */
    public void recibeDanio(double danio){
        hp = Math.max(0,hp-danio);
    }

    /**
     * Método para recibir curación.
     * @param curacion la cantidad de curación.
     */
    public void recibeCuracion(double curacion){
        hp = Math.min(100,hp+curacion);;
    }

    /**
     * Getter del nombre del personaje.
     * @return el valor del atributo nombre.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Setter del nombre del personaje.
     * @param nombre el nuevo nombre.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Getter del estado del personaje.
     * @return una cadena indicando nombre y vida del personaje.
     */
    public String getEstado(){
        String estado = nombre;
        if(hp > 0){
            estado += "(hp:" + hp + ")";
        }else{
            estado += "(muerto)";
        }
        return estado;
    }

}