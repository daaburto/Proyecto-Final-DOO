package org.pokemon;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class PokedexGUI extends JFrame {

    private JLabel numberLabel, nameLabel, typeLabel, weaknessLabel,baseHpLabel, hpLabel, imageLabel, levelLabel;

    public PokedexGUI(Pokemon pokemon) {
        setTitle("Pokédex");
        setSize(550, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

        numberLabel = new JLabel("Número: " + pokemon.getSpecies().getDexNumber());
        nameLabel = new JLabel("Nombre: " + pokemon.getName());
        levelLabel = new JLabel("Nivel: " + pokemon.getLevel());
        StringBuilder typeText = new StringBuilder("Tipo(s): ");
        for (org.pokemon.Type type : pokemon.getType()) {
            typeText.append("[").append(type).append("] ");
        }
        typeLabel = new JLabel(typeText.toString());

        Set<org.pokemon.Type> weaknessesSet = new HashSet<>();
        for (org.pokemon.Type type : pokemon.getType()) {
            for (org.pokemon.Type possibleWeakness : org.pokemon.Type.values()) {
                if (possibleWeakness.isSuperEffectiveAgainst(type)) {
                    weaknessesSet.add(possibleWeakness);
                }
            }
        }

        // Construir el string de debilidades
        StringBuilder weaknessText = new StringBuilder("Debilidades: ");
        for (org.pokemon.Type weakness : weaknessesSet) {
            weaknessText.append("[").append(weakness).append("] ");
        }



        weaknessLabel = new JLabel(weaknessText.toString());

        baseHpLabel = new JLabel("HP base: " + pokemon.getSpecies().getHP());
        hpLabel = new JLabel("HP base: " + pokemon.getSpecies().getHP());
        baseHpLabel.setText("HP: " + pokemon.getHp());
        infoPanel.add(numberLabel);
        infoPanel.add(nameLabel);
        infoPanel.add(levelLabel);
        infoPanel.add(typeLabel);
        infoPanel.add(weaknessLabel);
        infoPanel.add(baseHpLabel);
        infoPanel.add(hpLabel);



        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        ImageIcon imageIcon = pokemon.getSpecies().getImg();
        imageLabel.setIcon(imageIcon);

        add(infoPanel, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        // Agregar botón de reset
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> resetPanel());
        add(resetButton, BorderLayout.SOUTH);
    }

    // Pokémon aleatorio y actualizar GUI
    private void resetPanel() {

        Species[] allPokemon = Species.values();
        Random random = new Random();
        Species randomPokemonSpecies = allPokemon[random.nextInt(allPokemon.length)];
        Pokemon randomPokemon = new Pokemon(randomPokemonSpecies);


        numberLabel.setText("Número: " + randomPokemon.getSpecies().getDexNumber());
        nameLabel.setText("Nombre: " + randomPokemon.getName());
        levelLabel = new JLabel("Nivel: " + randomPokemon.getLevel());
        StringBuilder typeText = new StringBuilder("Tipo(s): ");
        for (org.pokemon.Type type : randomPokemon.getType()) {
            typeText.append("[").append(type).append("] ");
        }
        typeLabel.setText(typeText.toString());

        StringBuilder weaknessText = new StringBuilder("Debilidades: ");
        for (org.pokemon.Type type : randomPokemon.getType()) {
            for (org.pokemon.Type possibleWeakness : org.pokemon.Type.values()) {
                if (possibleWeakness.isSuperEffectiveAgainst(type)) {
                    weaknessText.append("[").append(possibleWeakness).append("] ");
                }
            }
            weaknessText.append("      ");
        }
        weaknessLabel.setText(weaknessText.toString());

        baseHpLabel.setText("HP base: " + randomPokemon.getSpecies().getHP());
        hpLabel.setText("HP: " + randomPokemon.getHp());

        ImageIcon imageIcon = randomPokemon.getSpecies().getImg();
        imageLabel.setIcon(imageIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Obtener todos los valores de la enumeración Species
            Species[] allPokemon = Species.values();
            Random random = new Random();
            // Seleccionar un Pokémon aleatorio de Species
            Species randomPokemonSpecies = allPokemon[random.nextInt(allPokemon.length)];
            Pokemon randomPokemon = new Pokemon(randomPokemonSpecies);
            PokedexGUI gui = new PokedexGUI(randomPokemon);
            gui.setVisible(true);
        });
    }
}
