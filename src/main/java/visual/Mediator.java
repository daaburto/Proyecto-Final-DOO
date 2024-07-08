package visual;
import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;

/**
 * Interfaz que maneja los eventos entre los paneles de la interfaz gráfica
 */
public interface Mediator {
    /**
     * Método que maneja los eventos entre los paneles
     * @param sender Es el objeto que está enviando el mensaje
     * @param event Es el evento que se manejará
     */
    public void notify(Component sender, String event);

    /**
     * Método que también maneja los eventos entre los paneles, pero permite usar la especie de un pokemon en concreto
     * @param sender Es el objeto que está enviando el mensaje
     * @param event Es el evento que se manejará
     */
    public void notify(Component sender, String event, Species specie);
}