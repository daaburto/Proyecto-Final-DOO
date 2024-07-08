package visual;

import org.pokemon.Species;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static visual.Musica.music;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PanelCaja extends JFrame implements ActionListener{
    /**
     * El mediador al cual está conectado
     * @see ConcreteMediator
     */
    private Mediator mediator;

    /**
     * Panel donde se mostrarán tus pokemon en la caja
     */
    private JPanel panelOpciones;

    /**
     * Paneles de los pokemon y toda su información en la caja
     */
    private JPanel[] panelPokemon = new JPanel[6];

    /**
     * Botón para regresar al panel principal
     * @see PanelPrincipal
     */
    private JButton backButton;

    /**
     * Pokemon que se mostrarán en pantalla
     * @see pokemonButton
     */
    private pokemonButton[] pokemonButton = new pokemonButton[6];

    /**
     * Barra de hambre de cada pokemon en la caja
     */
    public JButton[] hambreLabel = new JButton[6];

    /**
     * Imagen que mostrará el estado de los pokemon según su habitat
     * @see org.pokemon.Pokemon
     */
    private JLabel stateLabel;

    /**
     * Botón que permite alimentar y llenar la barra de hambre del pokemon
     */
    private JButton[] alimentarButton = new JButton[6];

    /**
     * Botón que permite eliminar a un pokemon de la caja y hábitat
     * @see PanelHabitat
     */
    private JButton[] deleteButton = new JButton[6];

    /**
     * Constructor del panel caja
     * Se inician todos los botones y paneles según el habitat seleccionado
     */
    public PanelCaja() {
        super("Caja");

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
        panelOpciones.setLayout(new GridLayout(2, 3));

        // Crear pokemon en pantalla

        for (int i = 0; i < 6; i++){
            // Panel Pokemon
            panelPokemon[i] = new JPanel(new BorderLayout());
            panelPokemon[i].setOpaque(false);
            panelOpciones.add(panelPokemon[i]);

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

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(200, 200, 200));
        layeredPane.add(panelOpciones, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(backButton, JLayeredPane.PALETTE_LAYER);
        this.setVisible(false);
    }

    /**
     * Método para conectar al objeto con el mediador
     * @param m Mediador al que se conectará
     */
    public void setMediator(Mediator m){
        mediator = m;
    }

    /**
     * Este método permite al mediador dibujar los pokemon en la caja según el hábitat seleccionado
     * @see ConcreteMediator
     * @param specie Especie del pokemon, para así conocer su imagen
     * @param i Índice del panel del pokemon que se dibujará en la pantalla
     * @param state Estado de ánimo del pokemon
     */
    public void paintPokemon(Species specie, int i, String state){
        // Pokemon
        pokemonButton[i] = new pokemonButton(specie);
        pokemonButton[i].setIcon(specie.getImg());
        pokemonButton[i].setContentAreaFilled(false);
        pokemonButton[i].setFocusPainted(false);
        pokemonButton[i].setBorderPainted(false);
        pokemonButton[i].setPreferredSize(new Dimension(180,180));

        // Información pokemon
        stateLabel = new JLabel();
        switch (state){
            case "feliz":
                stateLabel.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Estados\\feliz.png"));
                break;
            case "deprimido":
                stateLabel.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Estados\\deprimido.png"));
                break;
            case "hardcore":
                stateLabel.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Estados\\hardcore.png"));
                break;
            case "normal":
                stateLabel.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Estados\\normal.png"));
                break;
            default:
                stateLabel.setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Estados\\normal.png"));
                break;
        }

        // hambre Label
        hambreLabel[i] = new JButton();
        hambreLabel[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_100.png"));
        hambreLabel[i].setBorderPainted(false);
        hambreLabel[i].setFocusPainted(false);
        hambreLabel[i].setContentAreaFilled(false);


        // alimentarButton
        alimentarButton[i] = new JButton();
        alimentarButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\AlimentarButton.png"));
        alimentarButton[i].addActionListener(this);
        alimentarButton[i].setContentAreaFilled(false);
        alimentarButton[i].setBorderPainted(false);
        alimentarButton[i].setFocusPainted(false);
        alimentarButton[i].setOpaque(false);
        alimentarButton[i].setPreferredSize(new Dimension(64,64));

        // deleteButton
        deleteButton[i] = new JButton();
        deleteButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\RemovePokemonButton.png"));
        deleteButton[i].addActionListener(this);
        deleteButton[i].setContentAreaFilled(false);
        deleteButton[i].setBorderPainted(false);
        deleteButton[i].setFocusPainted(false);
        deleteButton[i].setOpaque(false);
        deleteButton[i].setPreferredSize(new Dimension(64,64));

        // Panel Pokemon
        panelPokemon[i].add(pokemonButton[i], BorderLayout.CENTER);
        panelPokemon[i].add(stateLabel, BorderLayout.SOUTH);

        // Panel botones derecha
        JPanel eastPanel = new JPanel(new GridLayout(2,1));
        eastPanel.setOpaque(false);
        panelPokemon[i].add(eastPanel, BorderLayout.EAST);
        eastPanel.add(alimentarButton[i]);
        eastPanel.add(deleteButton[i]);

        // Panel botones abajo
        JPanel southPhanel = new JPanel(new GridLayout(1,2));
        southPhanel.setOpaque(false);
        panelPokemon[i].add(southPhanel, BorderLayout.SOUTH);
        hambreLabel[i].setHorizontalAlignment(SwingConstants.CENTER);
        stateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        southPhanel.add(hambreLabel[i]);

        // Panel botones arriba
        JPanel northpanel = new JPanel();
        northpanel.setOpaque(false);
        panelPokemon[i].add(northpanel, BorderLayout.NORTH);
        northpanel.add(stateLabel);
        stateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        stateLabel.setBorder(new EmptyBorder(30,0,0,0));


        panelOpciones.add(panelPokemon[i]);

        this.repaint();
        this.revalidate();

    }

    /**
     * Este método permite al mediador dibujar un panel vacío si no hay ningún pokemon
     * @see ConcreteMediator
     * @param i Índice del panel donde se dibujará
     */
    public void paintEmpty(int i){
        // Panel Pokemon
        panelPokemon[i] = new JPanel(new BorderLayout());
        panelPokemon[i].setOpaque(false);
        panelOpciones.add(panelPokemon[i]);
        this.repaint();
        this.revalidate();
    }

    /**
     * Este método permite al mediador limpiar los paneles creados, para así poder dibujar desde cero al cambiar de hábitat
     * @see ConcreteMediator
     */
    public void clearPanels(){
        for (int i = 0; i < 6 ; i++){
            pokemonButton[i] = null;
            alimentarButton[i] = null;
            deleteButton[i] = null;
            panelPokemon[i].removeAll();
        }
        panelOpciones.removeAll();
        this.repaint();
        this.revalidate();
    }

    /**
     * Este método permite al mediador dibujar y actualizar la barra de hambre según el HP de cada pokemon
     * @see ConcreteMediator
     * @see org.pokemon.Pokemon
     * @param HP HP o hambre del pokemon
     * @param index Índice de la barra que se está dibujando
     */
    public void actualizarHambre(int HP, int index){
        if (HP > 90){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_100.png"));
        }else if (HP > 80){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_90.png"));
        }else if (HP > 70){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_80.png"));
        }else if (HP > 60){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_70.png"));
        }else if (HP > 50){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_60.png"));
        }else if (HP > 40){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_50.png"));
        }else if (HP > 30){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_40.png"));
        }else if (HP > 20){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_30.png"));
        }else if (HP > 10){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_20.png"));
        }else if (HP > 0){
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_10.png"));
        }else{
            hambreLabel[index].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\Hambre\\hambre_0.png"));
        }
        hambreLabel[index].repaint();
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
        for (int i = 0; i < 6; i++){
            if (e.getSource() == alimentarButton[i]){
                music.ButtonAlimentar();
                mediator.notify(this, "alimentarPokemon"+i);
                break;
            }else if (e.getSource() == deleteButton[i]){
                music.ButtonDeletePokemon();
                mediator.notify(this, "deletePokemon"+i);
                break;
            }
        }

    }
}