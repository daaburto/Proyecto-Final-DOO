package org.pokemon;

public class Pokemon {
    private Species species;
    private boolean[] status;
    private byte level;
    private int totalExpForNextLevel, totalExp;

    public Pokemon(Species s) {
        this(s, 5);
    }


    public Pokemon(Species species, int level) {
        //Set the Species of the Pokemon (ie. Charizard, Squirtle, etc...)
        this.species = species;
        status = new boolean[]{false, false, false, false, false, false};
        //calculateStat(Stat.HP);
        this.level = 5;
    }

    public Pokemon(Species evolveTo, Pokemon p) {
        species = evolveTo;
        level = p.level;
        status = new boolean[]{p.status[0], p.status[1], p.status[2], p.status[3], p.status[4], p.status[5]};
        //calculateStat(Stat.HP);
        totalExp = p.totalExp;
    }

    public boolean[] getStatus() {
        return status;
    }

    int calculateHp() {
        https://www.wikidex.net/wiki/Características#Cálculo_de_características
        return (((28 + (2 * species.getHP()) + (48 / 4) + 100) * level) / 100) + 10;
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
    public void addExp(int newExp) {
        totalExp += newExp;
    }
    public String levelUp() {
        String str = "";
        //If we have enough exp
        if (totalExp >= totalExpForNextLevel) {
            //level up and set remaining exp
            level++;
            //currentStats(Stat.HP);
            //revive();
        }
        return "Too bad, " + species.getName() + " didn't level up. They need " + (totalExpForNextLevel - totalExp) + " more exp to reach level " + (level + 1) + ".";
    }

    public Species getSpecies(){
        return species;
    }
}