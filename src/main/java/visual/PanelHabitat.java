package visual;

import org.pokemon.Habitat;
import org.pokemon.Pokemon;
import org.pokemon.Species;
import org.pokemon.Type;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelHabitat extends JButton implements ActionListener {
    private Mediator mediator;
    private int type;
    public Habitat habitat;
    private JButton addPokemonButton;
    private JButton goToBoxButton;
    private JButton destroyHabitatButton;
    private PokemonPanel[] pokemonPanels = new PokemonPanel[6];

    public PanelHabitat(int t) {
        this.setBorder(new LineBorder(new Color(123, 123, 123), 5));

        // Crear Botones
        addPokemonButton = new JButton();
        addPokemonButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\AddPokemonButton.png"));
        addPokemonButton.setContentAreaFilled(false);
        addPokemonButton.setBorderPainted(false);
        addPokemonButton.setFocusPainted(false);
        addPokemonButton.addActionListener(this);
        addPokemonButton.setVisible(false);

        goToBoxButton = new JButton();
        goToBoxButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\BoxButton.png"));
        goToBoxButton.setContentAreaFilled(false);
        goToBoxButton.setBorderPainted(false);
        goToBoxButton.setFocusPainted(false);
        goToBoxButton.addActionListener(this);
        goToBoxButton.setVisible(false);

        destroyHabitatButton = new JButton();
        destroyHabitatButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\RemoveButton.png"));
        destroyHabitatButton.setContentAreaFilled(false);
        destroyHabitatButton.setBorderPainted(false);
        destroyHabitatButton.setFocusPainted(false);
        destroyHabitatButton.addActionListener(this);
        destroyHabitatButton.setVisible(false);

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

        this.setLayout(null);
        this.setSize(426,230);
        addPokemonButton.setBounds(80,20,64,64);
        goToBoxButton.setBounds(180,20,64,64);
        destroyHabitatButton.setBounds(280,20,64,64);
        this.add(addPokemonButton);
        this.add(goToBoxButton);
        this.add(destroyHabitatButton);
        this.addActionListener(this);
        this.setVisible(true);
    }

    public void setButtonsVisible(boolean is_visible){
        addPokemonButton.setVisible(is_visible);
        goToBoxButton.setVisible(is_visible);
        destroyHabitatButton.setVisible(is_visible);
    }
    public void setHabitatFull(boolean is_full){
        if (is_full){
            addPokemonButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\AddPokemonFullButton.png"));
            this.repaint();
            this.revalidate();
        }else{
            addPokemonButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\AddPokemonButton.png"));
            this.repaint();
            this.revalidate();
        }
    }

    public void addPokemonPanel(int index ,Species specie){
        pokemonPanels[index] = new PokemonPanel(specie);
        this.add(pokemonPanels[index]);
    }
    public void removePokemonPanel(int index, Species specie){
        this.remove(pokemonPanels[index]);
        pokemonPanels[index] = null;
    }
    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this){
            if(!addPokemonButton.isVisible()){
                mediator.notify(this, "PanelHabitatShowButtons");
            }else{
                mediator.notify(this, "PanelHabitatHideButtons");
            }
        } else if (e.getSource() == addPokemonButton){
            mediator.notify(this, "Room_Goto(PanelAddPokemon)");
        }else if (e.getSource() == goToBoxButton){
          mediator.notify(this, "Room_Goto(PanelCaja)");
        }else if(e.getSource() == destroyHabitatButton){
            mediator.notify(this, "destroyHabitat");
        }
    }
}
