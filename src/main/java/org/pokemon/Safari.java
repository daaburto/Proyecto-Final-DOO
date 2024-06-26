package org.pokemon;

public class Safari {
    private Habitat[] habitats;
    private int habitatCount;
    private Pokemon[][] pokemons;

    public Safari() {
        this.habitats = new Habitat[9];
        this.habitatCount = 0;
        this.pokemons = new Pokemon[9][3];
    }

    public void addHabitat(Habitat habitat) {
        if (habitatCount < 9) {
            habitats[habitatCount] = habitat;
            habitatCount++;
        } else {
            System.out.println("No se pueden agregar más hábitats, el safari está lleno.");
        }
    }

    public void removeHabitat(int index) {
            habitats[index] = null;
            // Mueve al habitat y pokemon si hay espacio vacio
            for (int i = index; i < habitatCount - 1; i++) {
                habitats[i] = habitats[i + 1];
                pokemons[i] = pokemons[i + 1];
            }
            habitats[habitatCount - 1] = null;
            pokemons[habitatCount - 1] = new Pokemon[3];
            habitatCount--;
    }

    public void addPokemon(int habitatIndex, Pokemon pokemon) {
        if (habitatIndex >= 0 && habitatIndex < habitatCount) {
            Pokemon[] habitatPokemons = pokemons[habitatIndex];
            for (int i = 0; i < habitatPokemons.length; i++) {
                if (habitatPokemons[i] == null) {
                    habitatPokemons[i] = pokemon;
                    return;
                }
            }
            System.out.println("No se pueden agregar más Pokémon, el hábitat está lleno.");
        } else {
            System.out.println("Índice de hábitat no válido.");
        }
    }

    public void evaluarEfectividad() {
        if (habitatCount == 0) {
            System.out.println("No hay hábitats en el safari.");
            return;
        }

        for (int i = 0; i < habitatCount; i++) {
            Habitat habitat = habitats[i];
            Type habitatType = habitat.getType();

            System.out.println("El hábitat " + (i + 1) + " es de tipo: " + habitatType);

            for (Pokemon pokemon : pokemons[i]) {
                if (pokemon != null) {
                    Type[] pokemonTypes = pokemon.getType();

                    for (Type pokemonType : pokemonTypes) {
                        if (habitatType.isSuperEffectiveAgainst(pokemonType)) {
                            System.out.println("El hábitat es supereficaz contra " + pokemon.getName() + " (" + pokemonType + ")");
                        } else if (habitatType == pokemonType) {
                            System.out.println("El hábitat es del mismo tipo que " + pokemon.getName() + " (" + pokemonType + ")");
                        } else if (pokemonType.isSuperEffectiveAgainst(habitatType)) {
                            System.out.println(pokemon.getName() + " puede destruir este hábitat (" + pokemonType + ")");
                        } else {
                            System.out.println("El hábitat es normal para " + pokemon.getName() + " (" + pokemonType + ")");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Safari safari = new Safari();

        Habitat grassHabitat = new Habitat(Type.GRASS);
        Habitat fireHabitat = new Habitat(Type.FIRE);
        Habitat waterHabitat = new Habitat(Type.WATER);

        safari.addHabitat(grassHabitat);
        safari.addHabitat(fireHabitat);
        safari.addHabitat(waterHabitat);

        Pokemon charmander = new Pokemon(Species.CHARMANDER);
        Pokemon bulbasaur = new Pokemon(Species.BULBASAUR);
        Pokemon squirtle = new Pokemon(Species.SQUIRTLE);


        safari.addPokemon(0, bulbasaur);
        safari.addPokemon(0, charmander);
        safari.addPokemon(0, squirtle);
        safari.addPokemon(1, charmander);
        safari.addPokemon(1, squirtle);
        safari.addPokemon(1, bulbasaur);
        safari.addPokemon(2, squirtle);
        safari.addPokemon(2, bulbasaur);
        safari.addPokemon(2, charmander);
        safari.evaluarEfectividad();
    }
}
