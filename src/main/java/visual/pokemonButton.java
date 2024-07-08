package visual;

import org.pokemon.Species;

import javax.swing.*;

/**
 * Botón utilizado para la selección de pokemones
 */
public class pokemonButton extends JButton {
    /**
     * Especie del pokémon, permite saber a qué pokémon se está refiriendo
     * @see Species
     */
    private Species specie;

    /**
     * Constructor del botón
     * @param s Especie del pokémon
     */
    pokemonButton(Species s){
        this.specie = s;
    }

    /**
     * Permite obtener la especie del pokémon que se está usando en el botón
     * @return Especie del pokémon
     */
    public Species getSpecie(){
        return specie;
    }

    /**
     * Permite establecer la especie del pokémon
     * @param s Especie del pokémon
     */
    public void setSpecie(Species s){
        this.specie = s;
    }

}

