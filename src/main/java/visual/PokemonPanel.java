package visual;

import org.pokemon.Species;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PokemonPanel extends JLabel{
    private int[] bounds = new int[4];
    public int new_x;
    public int new_y;
    public boolean moving;
    Random random;
    public PokemonPanel(Species specie){
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
}
