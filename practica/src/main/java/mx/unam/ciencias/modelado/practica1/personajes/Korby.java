package mx.unam.ciencias.modelado.practica1.personajes;

import mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes.*;


public class Korby extends Personaje{
    public Korby(){
        super("Korby", Franquicia.Nientiendo);
        super.setAtaque(new Machetazo());
        super.setDefenza(new Escudo());
        super.agregarPoder(new Copiar(this, "Deborar"));
        super.agregarPoder(new CampoElectrico());
        super.agregarPoder(new Fuego());
        super.agregarPoder(new Hielo());
    }
}