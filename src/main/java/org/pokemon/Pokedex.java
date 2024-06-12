package org.pokemon;

public class Pokedex {

    public static void main(String[] args) {
        Species pikachuSpecies = Species.CELEBI;
        Pokemon pikachu = new Pokemon(pikachuSpecies);

        mostrarInformacionPokemon(pikachu);
    }

    public static void mostrarInformacionPokemon(Pokemon pokemon) {
        System.out.println("Número: " + pokemon.getSpecies().getDexNumber());
        System.out.println("Nombre: " + pokemon.getName());
        System.out.println("Tipo(s): ");
        for (Type type : pokemon.getType()) {
            System.out.println("[" + type + "]");
            System.out.println("Debilidades (" + type + "): ");
            for (Type possibleWeakness : Type.values()) {
                if (possibleWeakness.isSuperEffectiveAgainst(type)) {
                    System.out.println("  - " + possibleWeakness);
                }
            }
        }
        System.out.println("HP base: " + pokemon.getSpecies().getHP());
    }
}
