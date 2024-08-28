package mx.unam.ciencias.modelado.practica1;

import mx.unam.ciencias.modelado.practica1.personajes.*;
import mx.unam.ciencias.modelado.practica1.simulaciones.Simulador;
import mx.unam.ciencias.modelado.practica1.observer.*;

import java.util.ArrayList;

public class Main{

    public static void simulacion(){
        Personaje kirby = new Korby();
        Personaje megaman = new MeganMan();
        Personaje dittuu = new Dittuu();
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(kirby);
        personajes.add(megaman);
        personajes.add(dittuu);

        Espectador marco = new Espectador("Marco", kirby);
        Espectador guillermo = new Espectador("Guillermo", megaman);
        Espectador adam = new Espectador("Adam", dittuu);
        Combate combate = new Combate();
        combate.registrarObservador(marco);
        combate.registrarObservador(guillermo);
        combate.registrarObservador(adam);

        Simulador simulacion = new Simulador(combate, personajes);
        simulacion.simular();
    }

    public static void main(String[] args){
        simulacion();
        simulacion();
        simulacion();
    }
}