package visual;
import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;

public interface Mediator {
    public void notify(Component sender, String event);
    public void notify(Component sender, String event, Species specie);
}