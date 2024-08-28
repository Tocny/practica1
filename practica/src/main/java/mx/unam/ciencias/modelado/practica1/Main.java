package mx.unam.ciencias.modelado.practica1;

import mx.unam.ciencias.modelado.practica1.personajes.*;
import mx.unam.ciencias.modelado.practica1.simulaciones.Simulador;
import mx.unam.ciencias.modelado.practica1.observer.*;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        
        Personaje kirby = new Korby();
        Personaje megaman = new MeganMan();
        Personaje dittuu = new Dittuu();
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(kirby);
        personajes.add(megaman);
        personajes.add(dittuu);

        Espectador tilin = new Espectador("tilin", kirby);
        Espectador pepe = new Espectador("pepe", megaman);
        Espectador coca = new Espectador("pepe", megaman);
        Combate combate = new Combate();
        combate.registrarObservador(tilin);
        combate.registrarObservador(pepe);
        combate.registrarObservador(coca);

        Simulador simulacion = new Simulador(combate, personajes);
        simulacion.simular();

    }
}