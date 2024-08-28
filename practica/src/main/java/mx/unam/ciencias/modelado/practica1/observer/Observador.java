package mx.unam.ciencias.modelado.practica1.observer;

/**
 * Interfaz observador, aquellas clases que implementen esta interfaz
 * recibiran notificaciones de un sujeto.
 */
public interface Observador{
    /**
     * Método que recibe una actualizacion.
     * @param novedad una cadena que describe la notificación.
     */
    public void actualizar(String novedad);
}