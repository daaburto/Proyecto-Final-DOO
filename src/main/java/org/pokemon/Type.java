package org.pokemon;

/**
 * Enumeración que define los tipos de Pokémon y sus relaciones de efectividad.
 */
public enum Type {
    NORMAL(new String[]{},
            new String[]{"Rock", "Steel"},
            new String[]{"Ghost"}),
    FIGHTING(new String[]{"Normal", "Rock", "Steel", "Ice", "Dark"},
            new String[]{"Flying", "Poison", "Bug", "Psychic", "Fairy"},
            new String[]{"Ghost"}),
    FLYING(new String[]{"Fighting", "Grass"},
            new String[]{"Rock", "Steel", "Electric"},
            new String[]{}),
    POISON(new String[]{"Grass", "Fairy"},
            new String[]{"Poison", "Ground", "Rock", "Bug"},
            new String[]{"Steel"}),
    GROUND(new String[]{"Poison", "Rock", "Steel", "Fire", "Electric"},
            new String[]{"Bug", "Grass"},
            new String[]{"Flying"}),
    ROCK(new String[]{"Flying", "Bug", "Fire"},
            new String[]{"Fighting", "Ground", "Steel"},
            new String[]{}),
    BUG(new String[]{"Grass", "Psychic", "Dark"},
            new String[]{"Fighting", "Flying", "Poison", "Ghost", "Steel", "Fire", "Fairy"},
            new String[]{}),
    GHOST(new String[]{"Ghost", "Psychic"},
            new String[]{"Steel", "Dark"},
            new String[]{"Normal"}),
    STEEL(new String[]{"Rock", "Ice", "Fairy"},
            new String[]{"Steel", "Fire", "Water", "Electric"},
            new String[]{}),
    FIRE(new String[]{"Grass", "Ice", "Bug", "Steel"},
            new String[]{"Fire", "Water", "Rock", "Dragon"},
            new String[]{}),
    WATER(new String[]{"Fire", "Rock", "Ground"},
            new String[]{"Water", "Grass", "Dragon"},
            new String[]{}),
    GRASS(new String[]{"Water", "Ground", "Rock"},
            new String[]{"Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"},
            new String[]{}),
    ELECTRIC(new String[]{"Water", "Flying"},
            new String[]{"Grass", "Electric", "Dragon"},
            new String[]{"Ground"}),
    PSYCHIC(new String[]{"Fighting", "Poison"},
            new String[]{"Psychic", "Steel"},
            new String[]{"Dark"}),
    ICE(new String[]{"Grass", "Ground", "Flying", "Dragon"},
            new String[]{"Fire", "Water", "Ice", "Steel"},
            new String[]{}),
    DRAGON(new String[]{"Dragon"},
            new String[]{"Steel"},
            new String[]{"Fairy"}),
    DARK(new String[]{"Psychic", "Ghost"},
            new String[]{"Fighting", "Dark", "Steel"},
            new String[]{}),
    FAIRY(new String[]{"Fighting", "Dragon", "Dark"},
            new String[]{"Poison", "Steel", "Fire", "Fairy"},
            new String[]{});

    private final String[] SUPER_EFFECTIVE, NOT_VERY_EFFECTIVE, NO_EFFECT;

    /**
     * Constructor para inicializar los arrays de tipos de efectividad.
     * @param superEffective Tipos que reciben daño super efectivo.
     * @param notVeryEffective Tipos que reciben daño poco efectivo.
     * @param noEffect Tipos que no reciben daño.
     */
    Type(String[] superEffective, String[] notVeryEffective, String[] noEffect) {
        SUPER_EFFECTIVE = superEffective;
        NOT_VERY_EFFECTIVE = notVeryEffective;
        NO_EFFECT = noEffect;
    }

    private boolean contains(String[] t, Type p) {
        for (String type : t) {
            if (type.equalsIgnoreCase(p.name())) {
                return true;
            }
        }
        return false;
    }

    private Type[] convert(String[] types) {
        Type[] t = new Type[types.length];
        for (int i = 0; i < t.length; i++) {
            t[i] = valueOf(types[i]);
        }
        return t;
    }

    /**
     * Verifica si este tipo es super efectivo (x2) contra el tipo especificado.
     * @param t El tipo contra el que se verifica la efectividad.
     * @return true si es super efectivo, false de lo contrario.
     */
    public boolean isSuperEffectiveAgainst(Type t)
    {
        return contains(SUPER_EFFECTIVE, t);
    }

    /**
     * Verifica si este tipo es poco efectivo (x0.5) contra el tipo especificado.
     * @param t El tipo contra el que se verifica la efectividad.
     * @return true si es poco efectivo, false de lo contrario.
     */
    public boolean isNotVeryEffectiveAgainst(Type t) {
        return contains(NOT_VERY_EFFECTIVE, t);
    }

    /**
     * Verifica si este tipo no tiene efecto (x0) contra el tipo especificado.
     * @param t El tipo contra el que se verifica la efectividad.
     * @return true si no tiene efecto, false de lo contrario.
     */
    public boolean hasNoEffectOn(Type t)
    {
        return contains(NO_EFFECT, t);
    }

    /**
     * Verifica si este tipo causa daño normal (x1) contra el tipo especificado.
     * @param t El tipo contra el que se verifica la efectividad.
     * @return true si causa daño normal, false de lo contrario.
     */
    public boolean isNormalAgainst(Type t)
    {
        return !isSuperEffectiveAgainst(t) &&
                !isNotVeryEffectiveAgainst(t) &&
                !hasNoEffectOn(t);
    }

    /**
     * Obtiene todos los tipos contra los que este tipo es super efectivo (x2).
     * @return Los tipos contra los que es super efectivo este tipo.
     */
    public Type[] getTypesSuperEffectiveAgainst()
    {
        return convert(SUPER_EFFECTIVE);
    }

    /**
     * Obtiene todos los tipos contra los que este tipo es poco efectivo (x0.5).
     * @return Los tipos contra los que es poco efectivo este tipo.
     */
    public Type[] getTypesNotVeryEffectiveAgainst()
    {
        return convert(NOT_VERY_EFFECTIVE);
    }

    /**
     * Obtiene todos los tipos contra los que este tipo no tiene efecto (x0).
     * @return Los tipos contra los que no tiene efecto este tipo.
     */
    public Type[] getTypesNoEffectAgainst()
    {
        return convert(NO_EFFECT);
    }
}
