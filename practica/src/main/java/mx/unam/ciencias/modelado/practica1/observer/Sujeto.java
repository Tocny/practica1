package mx.unam.ciencias.modelado.practica1.observer;

/**
 * La interfaz Sujeto define los métodos que deben implementar las clases que desean ser observadas
 * por instancias de Observador, siguiendo el patrón de diseño Observer.
 */
public interface Sujeto {

    /**
     * Registra un observador para recibir notificaciones del sujeto.
     * @param observador una instancia de la interfaz {@link Observador}.
     */
    public void registrarObservador(Observador observador);

    /**
     * Elimina un observador registrado para que deje de recibir notificaciones.
     * @param observador una instancia de la interfaz {@link Observador}.
     */
    public void eliminarObservador(Observador observador);

    /**
     * Notifica a todos los observadores acerca de una novedad en el Sujeto.
     * @param novedad una cadena que describe la novedad.
     */
    public void notificarObservadores(String novedad);
}
