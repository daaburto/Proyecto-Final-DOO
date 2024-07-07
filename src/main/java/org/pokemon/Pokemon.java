package org.pokemon;

import java.util.Timer;
import java.util.TimerTask;
public class Pokemon {
    private Species species;
    private int level, hp, initial_hp;
    private Timer timer;
    private String state = null;
    public Pokemon(Species s) {
        this(s, 30);
    }

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

    public void calculateHp() {
        https://www.wikidex.net/wiki/Características#Cálculo_de_características
        hp = (((28 + (2 * species.getHP()) + (48 / 4) + 100) * level) / 100) + 10;
    }

    public String getName() {
        return species.getName();
    }
    public Type[] getType() {
        return species.getType();
    }
    public int getLevel() {
        return level;
    }
    public void levelUp() {
        level++;
        calculateHp();
    }
    public void levelUp(int lvl){
        level += lvl;
        calculateHp();
    }
    public Species getSpecies(){
        return species;
    }

    public int getHp() {
        return (hp*100)/initial_hp;
    }
    public void reduceHp(int amount) {
        hp = Math.max(hp - amount, 0); //  HP > 0
    }
    public void cambiarEstado(int estado){
        //prioridad de estados:   feliz<-hardcore<-deprimido<-normal
        if (state == null){                     // solo un tipo o el primer tipo
            switch (estado){
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
            }
        } else if (state == "feliz") {         // doble tipo y [habitat = pokemon] al primero
            state = "feliz";
        } else {                               // doble tipo y [x2 pokemon -> habitat] al primero (hardcore)
            if (estado == 2) {
                state = "feliz";            // habitat = pokemon (sobreescribe)
            } else {
                state = "hardcore";         // x2 pokemon -> habitat (se mantiene)
            }
        }
    }
    public String getState(){
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