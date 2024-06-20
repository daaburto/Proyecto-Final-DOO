package org.pokemon;

public class Safari {
    private Habitat habitat;
    private Pokemon[] pokemons;
    private int pokemonCount;

    public Safari() {
        this.pokemons = new Pokemon[3];
        this.pokemonCount = 0;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    public void addPokemon(Pokemon pokemon) {
        if (pokemonCount < 3) {
            pokemons[pokemonCount] = pokemon;
            pokemonCount++;
        } else {
            System.out.println("No se pueden agregar más Pokémon, el hábitat está lleno.");
        }
    }

    public void evaluarEfectividad() {
        if (habitat == null) {
            System.out.println("No hay hábitat en el safari.");
            return;
        }

        System.out.println("El hábitat es de tipo: " + habitat.getType());

        for (int i = 0; i < pokemonCount; i++) {
            Pokemon pokemon = pokemons[i];
            Type[] pokemonTypes = pokemon.getType();
            Type habitatType = habitat.getType();

            for (Type pokemonType : pokemonTypes) {
                if (habitatType.isSuperEffectiveAgainst(pokemonType)) {
                    System.out.println("El hábitat es supereficaz contra " + pokemon.getName() + " (" + pokemonType + ")");
                } else if (habitatType == pokemonType) {
                    System.out.println("El hábitat es del mismo tipo que " + pokemon.getName() + " (" + pokemonType + ")");
                } else if (pokemonType.isSuperEffectiveAgainst(habitatType)){
                    System.out.println(pokemon.getName() + " puede destruir este hábitat (" + pokemonType + ")");
                } else {
                    System.out.println("El hábitat es normal para " + pokemon.getName() + " (" + pokemonType + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        Habitat habitat = new Habitat(Type.GRASS);

        Pokemon charmander = new Pokemon(Species.CHARMANDER);
        Pokemon bulbasaur = new Pokemon(Species.BULBASAUR);
        Pokemon squirtle = new Pokemon(Species.SQUIRTLE);


        Safari safari = new Safari();
        safari.setHabitat(habitat);
        safari.addPokemon(charmander);
        safari.addPokemon(bulbasaur);
        safari.addPokemon(squirtle);

        safari.evaluarEfectividad();
    }
}
