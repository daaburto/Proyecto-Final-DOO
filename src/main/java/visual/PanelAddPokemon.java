package visual;

import org.pokemon.Pokemon;
import org.pokemon.Species;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PanelAddPokemon extends JFrame implements ActionListener {
    private Mediator mediator;
    private JPanel panelOpciones;
    public pokemonButton[] pokemonButton = new pokemonButton[12];
    private JButton backButton;
    private JButton rerollButton;

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
        panelOpciones.setBounds(50, 40, 1180, 620);//620
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
        this.setVisible(false);
    }

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

    public void setMediator(Mediator m){
        mediator = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backButton){
            mediator.notify(this, "Room_Goto(PanelPrincipal)");
        }
        for (int i = 0; i < 12; i++){
            if (e.getSource() == pokemonButton[i]){
                mediator.notify(this, "pokemonSelect", pokemonButton[i].getSpecie());
            }
        }
        if (e.getSource() == rerollButton){
            mediator.notify(this, "reroll");
        }
    }
}

class pokemonButton extends JButton{
    private Species specie;
    pokemonButton(Species s){
        this.specie = s;
    }

    public Species getSpecie(){
        return specie;
    }

    public void setSpecie(Species s){
        this.specie = s;
    }

}
