package mx.unam.ciencias.modelado.practica1.personajes;

import mx.unam.ciencias.modelado.practica1.strategy.concretas.basicos.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.defenzas.*;
import mx.unam.ciencias.modelado.practica1.strategy.concretas.poderes.*;

/**Clase del personaje MeganMan */
public class MeganMan extends Personaje{
    /**Constructor de la clase, construye al personaje acorde a la clase  {@link Personaje}*/
    public MeganMan(){
        super("MeganMan", Franquicia.Copcam);
        super.setAtaque(new Disparo());
        super.setDefenza(new DustCrusher());
        super.agregarPoder(new Copiar(this, "Derrotar"));
        super.agregarPoder(new ShadowBlade());
        super.agregarPoder(new ThunderBeam());
        super.agregarPoder(new MetalBlade());
    }
}