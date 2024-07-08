package org.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    @Test
    public void testGetName(){
        Pokemon pokemon = new Pokemon(Species.AMOONGUSS);
        Assertions.assertEquals("Amoonguss",pokemon.getName());
    }

    @Test
    public void testGetType(){
        Pokemon pokemon = new Pokemon(Species.PARASECT);
        Assertions.assertEquals(Type.GRASS,pokemon.getType()[1]);
    }

    @Test
    public void testGetState(){
        Pokemon pokemon = new Pokemon(Species.PIKACHU);
        Habitat water_habitat = new Habitat(Type.WATER);
        water_habitat.addPokemon(pokemon);
        water_habitat.evaluarEfectividad();
        Assertions.assertEquals("hardcore",pokemon.getState());
    }

    @Test
    public void testHP(){
        Pokemon pokemon = new Pokemon(Species.ARCEUS);

        while (pokemon.getHp() != 0){
            pokemon.reduceHp(1);
        }

        Assertions.assertEquals(0,pokemon.getHp());
    }

}
