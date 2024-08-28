package mx.unam.ciencias.modelado.practica1.personajes;

import mx.unam.ciencias.modelado.practica1.strategy.interfaces.*;
import java.util.ArrayList;

public class Personaje{
    protected String nombre;
    protected double hp = 100;
    protected Ataque ataque;
    protected Defenza defenza;
    protected ArrayList<Poder> poderes;
    protected Franquicia franquicia;
    public boolean ganador;

    public Personaje(String nombre, Franquicia franquicia){
        this.nombre = nombre;
        this.hp = hp;
        this.franquicia = franquicia;
        poderes = new ArrayList<>();
        ganador = false;
    }

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
        }

        return evento;
    }

    public String defenza(Personaje agresor){
        return defenza.ejecutaDefenza(this, agresor);
    }

    public String ataque(Personaje objetivo){
        return ataque.ejecutaAtaque(this, objetivo);
    }

    public ArrayList<Accion> getAcciones(){
        ArrayList<Accion> lista = new ArrayList<Accion>();
        lista.add(ataque);
        for(Poder poder : poderes){
            lista.add((Accion) poder);
        }
        return lista;
    }

    public Franquicia getFranquicia(){
        return franquicia;
    }

    public Ataque getAtaque(){
        return ataque;
    }

    public void setAtaque(Ataque ataque){
        this.ataque = ataque;
    }

    public void setDefenza(Defenza defenza){
        this.defenza = defenza;
    }

    public void setPoderes(ArrayList<Poder> poderes){
        this.poderes = poderes;
    }

    public void setGanador(boolean ganador){
        this.ganador = ganador;
    }

    public boolean esGanador(){
        return ganador == true;
    }

    public void agregarPoder(Poder poder){
        poderes.add(poder);
    }

    public double getHP(){
        return hp;
    }

    public void recibeDanio(double danio){
        hp = Math.max(0,hp-danio);
    }

    public void recibeCuracion(double curacion){
        hp = Math.min(100,hp+curacion);;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getEstado(){
        return nombre + "(hp:" + hp + ")";
    }

}