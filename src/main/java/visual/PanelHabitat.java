package visual;

import org.pokemon.Habitat;
import org.pokemon.Type;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelHabitat extends JButton {
    private Mediator mediator;
    private int type;
    private Habitat habitat;

    public PanelHabitat(int t) {
        this.setBorder(new LineBorder(new Color(123, 123, 123), 5));

        // Cambiar imagen segun tipo
        this.type = t;
        switch (type){
            case 0:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\normal.png"));
                habitat = new Habitat(Type.NORMAL);
                break;
            case 1:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\lucha.png"));
                habitat = new Habitat(Type.FIGHTING);
                break;
            case 2:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\vuelo.png"));
                habitat = new Habitat(Type.FLYING);
                break;
            case 3:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\veneno.png"));
                habitat = new Habitat(Type.POISON);
                break;
            case 4:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\tierra.png"));
                habitat = new Habitat(Type.GROUND);
                break;
            case 5:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\roca.png"));
                habitat = new Habitat(Type.ROCK);
                break;
            case 6:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\bicho.png"));
                habitat = new Habitat(Type.BUG);
                break;
            case 7:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fantasma.png"));
                habitat = new Habitat(Type.GHOST);
                break;
            case 8:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\acero.png"));
                habitat = new Habitat(Type.STEEL);
                break;
            case 9:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fuego.png"));
                habitat = new Habitat(Type.FIRE);
                break;
            case 10:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\agua.png"));
                habitat = new Habitat(Type.WATER);
                break;
            case 11:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\planta.png"));
                habitat = new Habitat(Type.GRASS);
                break;
            case 12:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\electrico.png"));
                habitat = new Habitat(Type.ELECTRIC);
                break;
            case 13:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\psiquico.png"));
                habitat = new Habitat(Type.PSYCHIC);
                break;
            case 14:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hielo.png"));
                habitat = new Habitat(Type.ICE);
                break;
            case 15:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\dragon.png"));
                habitat = new Habitat(Type.DRAGON);
                break;
            case 16:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\siniestro.png"));
                habitat = new Habitat(Type.DARK);
                break;
            case 17:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hada.png"));
                habitat = new Habitat(Type.FAIRY);
                break;
            default:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\SeleccionHabitat.png"));
                habitat = new Habitat(Type.NORMAL);
                break;
        }

        this.setSize(426,230);
        this.add(new JLabel("" + t));
        this.setVisible(true);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }
}
