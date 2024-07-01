package visual;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelHabitat extends JButton {
    private Mediator mediator;
    private int Type;

    PanelHabitat(int type){
        this.setBorder(new LineBorder(new Color(123,123,123), 5));

        // Cambiar imagen segun tipo
        this.Type = type;
        switch (Type){
            case 0:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\normal.png"));
                break;
            case 1:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\lucha.png"));
                break;
            case 2:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\vuelo.png"));
                break;
            case 3:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\veneno.png"));
                break;
            case 4:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\tierra.png"));
                break;
            case 5:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\roca.png"));
                break;
            case 6:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\bicho.png"));
                break;
            case 7:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fantasma.png"));
                break;
            case 8:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\acero.png"));
                break;
            case 9:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\fuego.png"));
                break;
            case 10:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\agua.png"));
                break;
            case 11:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\planta.png"));
                break;
            case 12:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\electrico.png"));
                break;
            case 13:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\psiquico.png"));
                break;
            case 14:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hielo.png"));
                break;
            case 15:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\dragon.png"));
                break;
            case 16:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\siniestro.png"));
                break;
            case 17:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\hada.png"));
                break;
            default:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Habitats\\SeleccionHabitat.png"));
                break;
        }

        this.setSize(426,230);
        this.add(new JLabel("" + type));
        this.setVisible(true);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }
}
