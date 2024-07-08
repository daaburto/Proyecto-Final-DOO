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
import static visual.Musica.music;

/**
 * Panel de los hábitats que estarán construidos en el panel principal
 * Extiende a JButton para mostrar los botones al presionarlo
 * @see PanelPrincipal
 */
public class PanelHabitat extends JButton implements ActionListener {
    /**
     * El mediador al cual está conectado
     * @see ConcreteMediator
     */
    private Mediator mediator;

    /**
     * Indica el tipo del hábitat, según cual hayas escogido
     */
    private int type;

    /**
     * Objeto habitat que se creará para llevar la parte lógica del hábitat
     * @see Habitat
     */
    public Habitat habitat;

    /**
     * Botón que se muestra al presionar el hábitat, lleva al panel para añadir pokemon
     * @see PanelAddPokemon
     */
    private JButton addPokemonButton;

    /**
     * Botón que se muestra al presionar el hábitat, lleva al panel de la caja
     * @see PanelCaja
     */
    private JButton goToBoxButton;

    /**
     * Botón que se muestra al presionar el hábitat, destruye el hábitat seleccionado
     */
    private JButton destroyHabitatButton;

    /**
     * Pokémon que se dibujarán en el hábitat
     */
    public PokemonPanel[] pokemonPanels = new PokemonPanel[6];

    /**
     * Contador de la cantidad de pokémon que hay en el hábitat
     */
    private int pokemonCount;

    /**
     * Constructor del panel del hábitat
     * Se inician todas las imágenes y botones, además se construye el objeto hábitat
     * @param t Entero para el tipo del hábitat
     */
    public PanelHabitat(int t) {
        pokemonCount = 0;

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

    /**
     * Permite al mediador mostrar o esconder los botones del hábitat
     * @see ConcreteMediator
     * @param is_visible Especifica si se quiere mostrar o esconder
     */
    public void setButtonsVisible(boolean is_visible){
        addPokemonButton.setVisible(is_visible);
        goToBoxButton.setVisible(is_visible);
        destroyHabitatButton.setVisible(is_visible);
    }

    /**
     * Permite al mediador cambiar el botón de añadir pokemon cuando el hábitat está lleno
     * @see ConcreteMediator
     * @param is_full Especifica si el hábitat está lleno o no
     */
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

    /**
     * Permite al mediador crear un panel de pokémon en el hábitat
     * @see ConcreteMediator
     * @param index Índice del panel pokémon que se creará
     * @param specie Especie del pokémon que se creará
     */
    public void addPokemonPanel(int index ,Species specie){
        pokemonPanels[index] = new PokemonPanel(specie);
        pokemonCount += 1;
        this.add(pokemonPanels[index]);
    }

    /**
     * Permite al mediador remover un panel de pokémon en el hábitat
     * @see ConcreteMediator
     * @param index Índice del panel pokémon que se removerá
     */
    public void removePokemonPanel(int index){
        this.remove(pokemonPanels[index]);
        pokemonPanels[index] = null;
        for (int j = index; j < pokemonCount - 1; j++) {
            pokemonPanels[j] = pokemonPanels[j + 1];
        }

        pokemonPanels[pokemonCount - 1] = null;

        pokemonCount -= 1;
        this.repaint();
    }

    /**
     * Método para conectar al objeto con el mediador
     * @param m Mediador al que se conectará
     */
    public void setMediator(Mediator m){
        mediator = m;
    }

    /**
     * Método implementado desde ActionListener, permite recibir el input del mouse
     * @param e El evento a ser procesado
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this){
            if(!addPokemonButton.isVisible()){
                mediator.notify(this, "PanelHabitatShowButtons");
            }else{
                mediator.notify(this, "PanelHabitatHideButtons");
            }
        } else if (e.getSource() == addPokemonButton){
            if (pokemonPanels[5] == null){
            music.ButtonGeneric();
            mediator.notify(this, "Room_Goto(PanelAddPokemon)");
            }else {
                music.ButtonFullBox();
            }

        }else if (e.getSource() == goToBoxButton){
            music.ButtonGeneric();
          mediator.notify(this, "Room_Goto(PanelCaja)");
        }else if(e.getSource() == destroyHabitatButton){
            music.ButtonDeleteHabitat();
            mediator.notify(this, "destroyHabitat");
        }
    }
}
