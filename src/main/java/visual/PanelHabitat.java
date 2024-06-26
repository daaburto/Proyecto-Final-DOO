package visual;

import javax.swing.*;
import java.awt.*;

public class PanelHabitat extends JButton {
    private Mediator mediator;
    private int Type;

    PanelHabitat(int type){
        // Cambiar imagen segun tipo
        this.Type = type;
        switch (Type){
            case 0:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 1:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 2:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 3:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 4:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 5:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 6:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 7:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 8:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 9:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 10:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 11:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 12:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 13:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 14:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 15:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 16:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            case 17:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
            default:
                this.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\SeleccionHabitat.png"));
                break;
        }

        this.setSize(1280/3,720/3);
        this.add(new JLabel("" + type));
        this.setVisible(true);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }
}
