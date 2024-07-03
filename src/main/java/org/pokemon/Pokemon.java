package org.pokemon;

import java.util.Timer;
import java.util.TimerTask;
public class Pokemon {
    private Species species;
    private int level, hp;
    private Timer timer;

    public Pokemon(Species s) {
        this(s, 30);
    }

    public Pokemon(Species species, int lvl) {
        this.species = species;
        this.level = lvl;
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
        return hp;
    }
    public void reduceHp(int amount) {
        hp = Math.max(hp - amount, 0); //  HP > 0
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