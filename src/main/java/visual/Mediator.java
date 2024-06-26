package visual;

import javax.swing.*;
import java.awt.*;

public interface Mediator {
    public void notify(Component sender, String event);
}