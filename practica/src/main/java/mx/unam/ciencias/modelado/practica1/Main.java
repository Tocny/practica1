package mx.unam.ciencias.modelado.practica1;

import mx.unam.ciencias.modelado.practica1.personajes.*;
import mx.unam.ciencias.modelado.practica1.simulaciones.Simulador;
import mx.unam.ciencias.modelado.practica1.observer.*;

import java.util.ArrayList;

/**Clase Main */
public class Main{

    /**Método para la simulación de un combate. */
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
        Espectador christian = new Espectador("Christian", megaman);
        Combate combate = new Combate();
        combate.registrarObservador(marco);
        combate.registrarObservador(guillermo);
        combate.registrarObservador(adam);
        combate.registrarObservador(christian);

        Simulador simulacion = new Simulador(combate, personajes);
        simulacion.simular();
    }

    /**Método principal, ejecuta todo el programa. */
    public static void main(String[] args){
        simulacion();
        simulacion();
        simulacion();
    }
}