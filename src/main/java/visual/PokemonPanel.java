package visual;

import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class PokemonPanel extends JLabel{
    private int x_pos;
    private int y_pos;
    private int[] bounds = new int[4];
    Random random;
    public PokemonPanel(Species specie){
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
}
