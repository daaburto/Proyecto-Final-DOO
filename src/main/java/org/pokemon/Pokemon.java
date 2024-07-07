package org.pokemon;

import java.util.Timer;
import java.util.TimerTask;

/**
 * La clase Pokemon representa un Pokémon de una especie específica, con nivel y puntos de salud (HP).
 * También hay un temporizador que reduce automáticamente el HP del Pokémon cada segundo.
 */
public class Pokemon {
    /**
     * Especie del Pokemon
     * @see Species
     */
    private Species species;

    /**
     * Nivel del Pokemon
     */
    private int level;

    /**
     * Vida del Pokemon
     */
    private int hp;

    /**
     * Vida inicial del Pokémon
     */
    private int initial_hp;

    /**
     * Timer para gestionar eventos de la clase
     */
    private Timer timer;

    /**
     * Estado del Pokemon
     */
    private String state = null;

    /**
     * Constructor que crea un Pokémon con una especie específica y el nivel predeterminado de 30.
     * @param s la especie del Pokémon.
     * @see Species
     */
    public Pokemon(Species s) {
        this(s, 30);
    }

    /**
     * Constructor que crea un Pokémon con una especie específica y un nivel determinado.
     * Posee un timer que reduce el HP del pokemon cada segundo
     * @param species la especie del Pokémon.
     * @param lvl el nivel del Pokémon.
     * @see Species
     */
    public Pokemon(Species species, int lvl) {
        this.species = species;
        this.level = lvl;
        this.initial_hp = (((28 + (2 * species.getHP()) + (48 / 4) + 100) * level) / 100) + 10;
        calculateHp();
        timer = new Timer(true); // Daemon thread
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                reduceHp(1);
            }
        }, 0, 1000);
    }

    /**
     * Calcula y establece los puntos de salud (HP) del Pokémon en función de su especie y nivel.
     * @see <a href="https://bulbapedia.bulbagarden.net/wiki/Stat">...</a>
     */
    public void calculateHp() {
        hp = (((28 + (2 * species.getHP()) + (48 / 4) + 100) * level) / 100) + 10;
    }

    /**
     * @return el nombre de la especie del Pokémon.
     * @see Species
     */
    public String getName() {
        return species.getName();
    }

    /**
     * @return arreglo de tipos de la especie del Pokémon.
     * @see Species
     * @see Type
     */
    public Type[] getType() {
        return species.getType();
    }

    /**
     * @return el nivel del Pokémon.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Aumenta el nivel del Pokémon en uno y recalcula su HP.
     */
    public void levelUp() {
        level++;
        calculateHp();
    }

    /**
     * Aumenta el nivel del Pokémon en un valor específico y recalcula su HP.
     * @param lvl número de niveles a aumentar.
     */
    public void levelUp(int lvl) {
        level += lvl;
        calculateHp();
    }

    /**
     * @return la especie del Pokémon.
     * @see Species
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * @return hp del Pokémon.
     */
    public int getHp() {
        return (hp*100)/initial_hp;
    }

    /**
     * Reduce el HP del Pokémon en una cantidad específica.
     * Si el HP resultante es menor que cero, se mantiene en cero.
     * @param amount la cantidad para reducir el HP.
     */
    public void reduceHp(int amount) {
        hp = Math.max(hp - amount, 0);
    }

    /**
     * Cambia el estado del Pokémon según una prioridad de estados.
     * (feliz ← hardcore ← deprimido ← normal)
     * @param estado el nuevo estado del Pokémon.
     */
    public void cambiarEstado(int estado) {
        if (state == null) { // Solo un tipo o el primer tipo
            switch (estado) {
                case 0:
                    state = "deprimido";        // x2 habitat -> pokemon
                    break;
                case 1:
                    state = "normal";           // x1 habitat -> pokemon
                    break;
                case 2:
                    state = "feliz";            // habitat = pokemon
                    break;
                case 3:
                    state = "hardcore";         // x2 pokemon -> habitat
                    break;
                default:
                    state = "nulo";             // x0 habitat -> pokemon
                    break;
            }
        } else if (state == "deprimido") {      // doble tipo y [x2 habitat -> pokemon] al primero
            switch (estado){
                case 0:
                    state = "deprimido";        // x4 habitat -> pokemon (muy deprimido)
                    break;
                case 1:
                    state = "deprimido";        // x2 habitat -> pokemon + normal
                    break;
                case 2:
                    state = "feliz";            // habitat = pokemon (sobreescribe)
                    break;
                case 3:
                    state = "hardcore";         // x2 pokemon -> habitat (sobreescribe)
                    break;
                default:
                    state = "nulo";             // x0 habitat -> pokemon
                    break;
            }
        } else if (state == "normal") {         // doble tipo y [x1 habitat -> pokemon] al primero
            switch (estado){
                case 0:
                    state = "deprimido";        // x2 habitat -> pokemon
                    break;
                case 1:
                    state = "normal";           // x1 habitat -> pokemon
                    break;
                case 2:
                    state = "feliz";            // habitat = pokemon (sobreescribe)
                    break;
                case 3:
                    state = "hardcore";         // x2 pokemon -> habitat (sobreescribe)
                    break;
                default:
                    state = "nulo";             // x0 habitat -> pokemon
                    break;
            }
        } else if (state == "feliz") {         // doble tipo y [habitat = pokemon] al primero
            state = "feliz";
        } else if (state == "hardcore") {       // doble tipo y [x2 pokemon -> habitat] al primero
            if (estado == 2) {
                state = "feliz";            // habitat = pokemon (sobreescribe)
            } else {
                state = "hardcore";         // x2 pokemon -> habitat (se mantiene)
            }
        }
    }

    /**
     * @return el estado del Pokémon.
     */
    public String getState() {
        return state;
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon(Species.PIKACHU);
        System.out.println("Nivel del pokemon: " + pikachu.getLevel() + "   HP actual: " + pikachu.getHp());
        pikachu.levelUp();
        System.out.println("Nivel del pokemon: " + pikachu.getLevel() + "   HP actual: " + pikachu.getHp());
        pikachu.levelUp(5);
        System.out.println("Nivel del pokemon: " + pikachu.getLevel() + "   HP actual: " + pikachu.getHp());

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Nivel del pokemon: " + pikachu.getLevel() + "   HP actual: " + pikachu.getHp());
        pikachu.calculateHp();
        System.out.println("Nivel del pokemon: " + pikachu.getLevel() + "   HP actual: " + pikachu.getHp());
    }
}