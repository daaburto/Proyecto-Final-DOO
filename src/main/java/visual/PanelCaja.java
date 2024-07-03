package visual;

import org.pokemon.Species;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PanelCaja extends JFrame implements ActionListener{
    private Mediator mediator;
    private JPanel panelOpciones;
    private JButton backButton;
    private pokemonButton[] pokemonButton = new pokemonButton[6];
    private JLabel hambreLabel;
    private JLabel stateLabel;
    private JButton[] alimentarButton = new JButton[6];
    private JButton[] deleteButton = new JButton[6];
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

            // alimentarButton
            alimentarButton[i] = new JButton();
            alimentarButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\AlimentarButton.png"));
            alimentarButton[i].addActionListener(this);
            alimentarButton[i].setContentAreaFilled(false);
            alimentarButton[i].setBorderPainted(false);
            alimentarButton[i].setFocusPainted(false);
            alimentarButton[i].setOpaque(false);
            alimentarButton[i].setPreferredSize(new Dimension(64,64));
            alimentarButton[i].setVisible(true);

            // deleteButton
            deleteButton[i] = new JButton();
            deleteButton[i].setIcon(new ImageIcon("src\\main\\resources\\Interfaz\\RemovePokemonButton.png"));
            deleteButton[i].addActionListener(this);
            deleteButton[i].setContentAreaFilled(false);
            deleteButton[i].setBorderPainted(false);
            deleteButton[i].setFocusPainted(false);
            deleteButton[i].setOpaque(false);
            deleteButton[i].setPreferredSize(new Dimension(64,64));
            deleteButton[i].setVisible(true);

            int index = i;
            panelOpciones.add(new JPanel(new BorderLayout()){
                {
                    info.setBorder(new EmptyBorder(0,0,30,0));
                    info.setHorizontalAlignment(SwingConstants.CENTER);
                    setOpaque(false);

                    add(pokemonButton[index], BorderLayout.CENTER);
                    // Panel botones derecha
                    JPanel eastPanel = new JPanel(new GridLayout(2,1));
                    eastPanel.setOpaque(false);
                    add(eastPanel, BorderLayout.EAST);

                    eastPanel.add(alimentarButton[index]);
                    eastPanel.add(deleteButton[index]);

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

        this.setSize(1280, 720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(200, 200, 200));
        layeredPane.add(panelOpciones, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(backButton, JLayeredPane.PALETTE_LAYER);
        this.setVisible(false);
    }

    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
    }
}