package visual;

import org.pokemon.Pokemon;
import org.pokemon.Species;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static visual.Musica.music;

/**
 * Panel donde se añaden los pokémon al hábitat
 * @see PanelHabitat
 * @see Pokemon
 */
public class PanelAddPokemon extends JFrame implements ActionListener {
    /**
     * El mediador al cual está conectado
     * @see ConcreteMediator
     */
    private Mediator mediator;

    /**
     * Panel donde se muestra las opciones a escoger de los pokemon
     */
    private JPanel panelOpciones;

    /**
     * Botones para añadir pokemon y crear pokemon
     * @see pokemonButton
     */
    private pokemonButton[] pokemonButton = new pokemonButton[12];

    /**
     * Botón para regresar al panel principal
     * @see PanelPrincipal
     */
    private JButton backButton;

    /**
     * Botón para cambiar la elección de pokemon en pantalla
     */
    private JButton rerollButton;

    /**
     *  Constructor del panel para añadir pokemon
     *  Se inician y dibujan todos los botones y paneles
     */
    public PanelAddPokemon() {
        super("Añadir Pokemon");

        // Crear LayeredPane para las capas
        JLayeredPane layeredPane = this.getLayeredPane();

        // Crear Panel para Pokemon
        panelOpciones = new JPanel() {
            ImageIcon panelOpciones_img = new ImageIcon("src\\main\\resources\\Interfaz\\TerrenoVacio.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(panelOpciones_img.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panelOpciones.setBounds(50, 40, 1180, 620);
        panelOpciones.setLayout(new GridLayout(3, 4));

        // Crear seleccion de pokemon

        for (int i = 0; i < 12; i++){
            // Pokemon
            Random random = new Random();
            Species[] allPokemon = Species.values();
            Species randomPokemonSpecies = allPokemon[random.nextInt(allPokemon.length)];
            pokemonButton[i] = new pokemonButton(randomPokemonSpecies);
            pokemonButton[i].setIcon(randomPokemonSpecies.getImg());
            pokemonButton[i].addActionListener(this);
            pokemonButton[i].setContentAreaFilled(false);
            pokemonButton[i].setFocusPainted(false);
            pokemonButton[i].setBorderPainted(false);
            pokemonButton[i].setPreferredSize(new Dimension(180,180));

            // Información pokemon
            JLabel info = new JLabel();
            info.setText(randomPokemonSpecies.getDexNumber() + " - " + randomPokemonSpecies.getName());

            // Tipo pokemon

            int index = i;
            panelOpciones.add(new JPanel(new BorderLayout()){
                {
                    info.setBorder(new EmptyBorder(0,0,30,0));
                    info.setHorizontalAlignment(SwingConstants.CENTER);
                    setOpaque(false);

                    add(pokemonButton[index], BorderLayout.CENTER);
                    add(info, BorderLayout.SOUTH);
                }
            });
        }

        // backButton
        backButton = new JButton();
        backButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\GreenArrow.png"));
        backButton.addActionListener(this);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFocusPainted(false);
        backButton.setOpaque(false);
        backButton.setSize(80, 80);
        backButton.setVisible(true);

        // rerollButton
        rerollButton = new JButton();
        rerollButton.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\rerollButton.png"));
        rerollButton.addActionListener(this);
        rerollButton.setContentAreaFilled(false);
        rerollButton.setBorderPainted(false);
        rerollButton.setFocusPainted(false);
        rerollButton.setOpaque(false);
        rerollButton.setBounds(1145,550,128,128);
        rerollButton.setVisible(true);

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(200, 200, 200));
        layeredPane.add(panelOpciones, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(backButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(rerollButton, JLayeredPane.PALETTE_LAYER);
        this.setIconImage(new ImageIcon("src\\main\\resources\\Interfaz\\AddPokemonButton.png").getImage());
        this.setVisible(false);
    }

    /**
     * Método que permite volver a dibujar los pokemon en pantalla al presionar el botón de rerrol
     */
    public void rerrolPokemon(){
        panelOpciones.setVisible(false);
        panelOpciones.removeAll();
        for (int i = 0; i < 12; i++){

            // Pokemon
            Random random = new Random();
            Species[] allPokemon = Species.values();
            Species randomPokemonSpecies = allPokemon[random.nextInt(allPokemon.length)];
            pokemonButton[i].setSpecie(randomPokemonSpecies);
            pokemonButton[i].setIcon(randomPokemonSpecies.getImg());
            pokemonButton[i].setPreferredSize(new Dimension(180,180));

            // Información pokemon
            JLabel info = new JLabel();
            info.setText(randomPokemonSpecies.getDexNumber() + " - " + randomPokemonSpecies.getName());

            int index = i;
            panelOpciones.add(new JPanel(new BorderLayout()){
                {
                    info.setBorder(new EmptyBorder(0,0,30,0));
                    info.setHorizontalAlignment(SwingConstants.CENTER);
                    setOpaque(false);

                    add(pokemonButton[index], BorderLayout.CENTER);
                    add(info, BorderLayout.SOUTH);
                }
            });
            panelOpciones.setVisible(true);
        }
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
        if (e.getSource() == backButton){
            music.ButtonGeneric();
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
        for (int i = 0; i < 12; i++){
            if (e.getSource() == pokemonButton[i]){
                music.ButtonAddPokemon();
                mediator.notify(this, "pokemonSelect", pokemonButton[i].getSpecie());
            }
        }
        if (e.getSource() == rerollButton){
            music.ButtonReroll();
            mediator.notify(this, "reroll");
        }
    }
}

