package mx.unam.ciencias.modelado.practica1.observer;

public interface Sujeto{
    public void registrarObservador(Observador observador);
    public void eliminarObservador(Observador observador);
    public void notificarObservadores(String novedad);
}