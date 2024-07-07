package org.pokemon;

/**
 * Clase que representa un hábitat para un Pokémon.
 * @see Pokemon
 */
public class Habitat {
    /**
     * Tipo del hábitat
     *
     * @see Type
     */
    private Type habitatType;

    /**
     * Caja donde se almacenan los pokemon del hábitat
     *
     * @see Pokemon
     */
    public Pokemon[] caja;

    /**
     * Cantidad de pokemon que hay en la caja
     */
    private int pokemonCount;

    /**
     * Constructor para un hábitat con un tipo específico.
     *
     * @param habitatType El tipo de hábitat para los Pokémon.
     * @see Type
     */
    public Habitat(Type habitatType) {
        this.habitatType = habitatType;
        this.caja = new Pokemon[6];
        this.pokemonCount = 0;
    }

    /**
     * @return El tipo de hábitat.
     */
    public Type getType() {
        return habitatType;
    }

    /**
     * Muestra las debilidades del hábitat.
     */
    public void mostrarDebilidades() {
        Type type = this.getType();
        System.out.println("Debilidades: ");
        for (Type possibleWeakness : Type.values()) {
            if (possibleWeakness.isSuperEffectiveAgainst(type)) {
                System.out.println("  - " + possibleWeakness);
            }
        }
    }

    /**
     * Muestra los tipos que son supereficaces contra el hábitat.
     */
    public void mostrarSupereficaz() {
        Type type = this.getType();
        System.out.println("Supereficaz contra: ");
        for (Type possibleEffective : Type.values()) {
            if (type.isSuperEffectiveAgainst(possibleEffective)) {
                System.out.println("  - " + possibleEffective);
            }
        }
    }

    /**
     * Método para añadir un Pokémon a la caja del hábitat.
     * @param pokemon pokémon a añadir.
     * @see Pokemon
     */
    public void addPokemon(Pokemon pokemon) {
        if (pokemonCount < caja.length) {
            caja[pokemonCount] = pokemon;
            pokemonCount++;
            System.out.println(pokemon.getName() + " ha sido añadido a la caja.");
        } else {
            System.out.println("La caja está llena. No se pueden agregar más Pokémon.");
        }
    }

    /**
     * Método para eliminar un Pokémon de la caja del hábitat.
     * @param pokemon pokémon a eliminar.
     * @see Pokemon
     */
    public void removePokemon(Pokemon pokemon) {
        for (int i = 0; i < pokemonCount; i++) {
            if (caja[i] == pokemon) {
                System.out.println(caja[i].getName() + " ha sido eliminado de la caja.");
                caja[i] = null;


                for (int j = i; j < pokemonCount - 1; j++) {
                    caja[j] = caja[j + 1];
                }


                caja[pokemonCount - 1] = null;
                pokemonCount--;
                return;
            }
        }
        System.out.println("Pokémon no encontrado en la caja.");
    }

    /**
     * Muestra los Pokémon de la caja.
     */
    public void imprimirCaja() {
        System.out.print("[");
        for (int i = 0; i < pokemonCount; i++) {
            System.out.print(caja[i].getSpecies().getName());
            if (i < pokemonCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    /**
     * Método que evalúa la efectividad del hábitat contra los Pokémon en la caja.
     */
    public void evaluarEfectividad() {
        for (Pokemon pokemon : caja) {
            if (pokemon != null) {
                Type[] pokemonTypes = pokemon.getType();
                for (Type pokemonType : pokemonTypes) {
                    if (habitatType.isSuperEffectiveAgainst(pokemonType)) {
                        pokemon.cambiarEstado(0);
                        System.out.println("El hábitat es supereficaz contra " + pokemon.getName() + " (" + pokemonType + ") (estado: " + pokemon.getState() + ")");
                    } else if (habitatType == pokemonType) {
                        pokemon.cambiarEstado(2);
                        System.out.println("El hábitat es del mismo tipo que " + pokemon.getName() + " (" + pokemonType + ") (estado: " + pokemon.getState() + ")");
                    } else if (pokemonType.isSuperEffectiveAgainst(habitatType)) {
                        pokemon.cambiarEstado(3);
                        System.out.println(pokemon.getName() + " puede destruir este hábitat (" + pokemonType + ") (estado: " + pokemon.getState() + ")");
                    } else {
                        pokemon.cambiarEstado(1);
                        System.out.println("El hábitat es normal para " + pokemon.getName() + " (" + pokemonType + ") (estado: " + pokemon.getState() + ")");
                    }
                }
            }
        }
    }

    /**
     * Método que verifica la disponibilidad de un espacio en la caja.
     */
    public int getFreeBox(){
        for (int i = 0; i < 6; i++){
            if (caja[i] != null){
                return i;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        Habitat habitat = new Habitat(Type.FIRE);
        System.out.println("El habitat es de tipo: " + habitat.getType());
        habitat.mostrarDebilidades();
        habitat.mostrarSupereficaz();

        Pokemon charmander = new Pokemon(Species.CHARMANDER);
        Pokemon bulbasaur = new Pokemon(Species.BULBASAUR);
        Pokemon squirtle = new Pokemon(Species.SQUIRTLE);
        Pokemon pikachu = new Pokemon(Species.PIKACHU);

        habitat.addPokemon(charmander);
        habitat.addPokemon(bulbasaur);
        habitat.addPokemon(squirtle);
        habitat.addPokemon(pikachu);
        habitat.imprimirCaja();
        habitat.evaluarEfectividad();

        habitat.removePokemon(bulbasaur);
        habitat.removePokemon(pikachu);
        habitat.removePokemon(pikachu);
        habitat.imprimirCaja();
        habitat.evaluarEfectividad();
    }
}