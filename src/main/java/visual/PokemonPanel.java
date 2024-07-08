package visual;

import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Panel de pokémon que se dibujarán en los hábitats, permite mostrarlos en pantalla y su movimiento
 * @see PanelHabitat
 */
public class PokemonPanel extends JLabel{
    /**
     * Límites para evitar que al moverse salgan de pantalla
     */
    private int[] bounds = new int[4];

    /**
     * Coordenada x al cual se dirigirá al moverse
     */
    public int new_x;

    /**
     * Coordenanda y al cual se dirigirá al moverse
     */
    public int new_y;

    /**
     * Variable booleana que permite saber al mediador si el pokémon se está moviendo o no
     * @see ConcreteMediator
     */
    public boolean moving;

    /**
     * Variable para establecer un punto de partida aleatorio en el hábitat
     */
    private Random random;

    /**
     * Variable que indicará la especie del pokémon
     */
    private Species specie;

    /**
     * Constructor del panel pokémon, lo crea en el panel hábitat
     * @see PanelHabitat
     * @param s Especie del pokémon que se creará, permite obtener la imágen
     */
    public PokemonPanel(Species s){
        this.specie = s;
        moving = false;
        new_x = 0;
        new_y = 0;
        random = new Random();
        bounds[0] = 0;
        bounds[1] = 350;
        bounds[2] = 0;
        bounds[3] = 150;

        ImageIcon IMG = new ImageIcon(specie.getImg().getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
        this.setIcon(IMG);
        this.setSize(new Dimension(90,90));
        this.setLocation(bounds[0] + random.nextInt(bounds[1]), bounds[2] + random.nextInt(bounds[3]));
        this.setVisible(true);
    }

    /**
     * Método que permite al mediador mover la posición del pokémon si la variable moving es verdadera
     * @see ConcreteMediator
     */
    public void movePos(){
        int delta_x = 1;
        int delta_y = 1;

        if (this.getX() <= new_x - 5 || this.getX() >= new_x + 5){
            if (this.getX() < new_x){
                this.setLocation(this.getX() + delta_x, this.getY());
            }else{
                this.setLocation(this.getX() - delta_x, this.getY());
            }
        }

        if (this.getY() <= new_y - 5 || this.getY() >= new_y + 5){
            if (this.getY() < new_y){
                this.setLocation(this.getX(), this.getY() + delta_y);
            }else{
                this.setLocation(this.getX(), this.getY() - delta_y);
            }
        }

        if (this.getX() > new_x - 5 && this.getX() < new_x + 5){
            if (this.getY() > new_y - 5 && this.getY() < new_y + 5){
                moving = false;
            }
        }

        this.repaint();
    }

    /**
     * Este método cambiará la imágen del pokémon desde el mediador si este está con hambre o no
     * @see Mediator
     * @param is_hungry Dirá si el pokémon está hambriento o no
     */
    public void setHungryIcon(boolean is_hungry){
        if (is_hungry){
            ImageIcon IMG = new ImageIcon(specie.getImg().getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));

            ImageFilter filter = new GrayFilter(true, 30);
            ImageProducer producer = new FilteredImageSource(IMG.getImage().getSource(), filter);
            Image ImgIconGris = Toolkit.getDefaultToolkit().createImage(producer);
            this.setIcon(new ImageIcon(ImgIconGris));
        }else{
            ImageIcon IMG = new ImageIcon(specie.getImg().getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH));
            this.setIcon(IMG);
        }

    }
}
