package org.pokemon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HabitatTest {
    @Test
    public void testGetType(){
        Habitat water_habitat = new Habitat(Type.WATER);

        Assertions.assertEquals(Type.WATER,water_habitat.getType());
    }

    @Test
    public void testAddPokemon(){
        Pokemon pokemon = new Pokemon(Species.ARIADOS);
        Habitat habitat = new Habitat(Type.GROUND);

        habitat.addPokemon(pokemon);
        habitat.addPokemon(pokemon);

        Assertions.assertEquals(pokemon,habitat.caja[1]);
    }

    @Test
    public void testRemovePokemon(){
        Pokemon pokemon1 = new Pokemon(Species.KANGASKHAN);
        Pokemon pokemon2 = new Pokemon(Species.LAPRAS);
        Pokemon pokemon3 = new Pokemon(Species.MAGBY);
        Habitat habitat = new Habitat(Type.GROUND);

        habitat.addPokemon(pokemon1);
        habitat.addPokemon(pokemon2);
        habitat.addPokemon(pokemon3);

        habitat.removePokemon(pokemon2);

        Assertions.assertEquals(pokemon3,habitat.caja[1]);
    }

    @Test
    public void testBoxRearrangement(){
        Pokemon pokemon1 = new Pokemon(Species.KANGASKHAN);
        Pokemon pokemon2 = new Pokemon(Species.LAPRAS);
        Pokemon pokemon3 = new Pokemon(Species.MAGBY);
        Habitat habitat = new Habitat(Type.GROUND);

        habitat.addPokemon(pokemon1);
        habitat.addPokemon(pokemon2);
        habitat.addPokemon(pokemon3);

        // Al remover el pokemon 2, el pokemon 3 se moverá a la posición 2
        habitat.removePokemon(pokemon2);

        Assertions.assertNull(habitat.caja[2]);
    }

    @Test
    public void testGetFreeBox(){
        Pokemon pokemon1 = new Pokemon(Species.KANGASKHAN);
        Pokemon pokemon2 = new Pokemon(Species.LAPRAS);
        Pokemon pokemon3 = new Pokemon(Species.MAGBY);
        Habitat habitat = new Habitat(Type.GROUND);

        habitat.addPokemon(pokemon1);
        habitat.addPokemon(pokemon2);
        habitat.addPokemon(pokemon3);

        habitat.removePokemon(pokemon2);
        /*
            0 y 1 están ocupados, 2 estará vacío
         Pero dado que se crea y se añade el pokémon a la caja antes de llamar a la función,
         se retorna i - 1 para así crear los paneles acorde a la caja.
         */

        Assertions.assertEquals(2, habitat.getFreeBox() + 1);
    }
}