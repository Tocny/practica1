package mx.unam.ciencias.modelado.practica1.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

/**
 * La clase ReaderWriter proporciona métodos utilitarios para leer y escribir archivos de texto.
 */
public class ReaderWriter {

    /**
     * Lee el contenido de un archivo y devuelve sus líneas como un arreglo de cadenas.
     * Si el archivo no se encuentra, devuelve {@code null}.
     * @param fileName el nombre del archivo que se desea leer.
     * @return un arreglo de cadenas con las líneas del archivo, o {@code null} si el archivo no existe.
     */
    public static String[] read(String fileName) {
        String line;
        LinkedList<String> l = null;
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader(fileName));
            l = new LinkedList<>();
            while ((line = in.readLine()) != null) {
                l.add(line);
            }
        } catch (FileNotFoundException e) {
            // Manejo de archivo inexistente
            return null;
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        return l != null ? l.toArray(new String[l.size()]) : null;
    }

    /**
     * Escribe una cadena en un archivo. Si el archivo ya existe, el contenido se añade al final del archivo.
     * Cada llamada añade una nueva línea al archivo.
     * @param articulo la cadena que se desea escribir en el archivo.
     * @param fileName el nombre del archivo en el que se desea escribir.
     */
    public static void write(String articulo, String fileName) {
        FileWriter out = null;

        try {
            out = new FileWriter(fileName, true);
            out.write(articulo);
            out.write("\n");
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
