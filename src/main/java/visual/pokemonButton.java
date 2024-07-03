package visual;

import org.pokemon.Species;

import javax.swing.*;

public class pokemonButton extends JButton {
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

