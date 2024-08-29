package mx.unam.ciencias.modelado.practica1.personajes;

import mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes.*;

/**Clase del personaje Dittuu */
public class Dittuu extends Personaje{
    /**Constructor de la clase, construye al personaje acorde a la clase  {@link Personaje}*/
    public Dittuu(){
        super("Dittuu", Franquicia.Chinpokomon);
        super.setAtaque(new Golpe());
        super.setDefenza(new Endurecer());
        super.agregarPoder(new Copiar(this, "Mimetismo"));
        super.agregarPoder(new Azote());
        super.agregarPoder(new DragonPulse());
        super.agregarPoder(new ShadowBall());
    }
}