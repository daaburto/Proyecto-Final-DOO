package org.pokemon;

public class Habitat {
    private Type habitatType;

    public Habitat(Type habitatType) {
        this.habitatType = habitatType;
    }

    public Type getType() {
        return habitatType;
    }

    public void mostrarDebilidades() {
        Type type = this.getType();
        System.out.println("Debilidades: ");
        for (Type possibleWeakness : Type.values()) {
            if (possibleWeakness.isSuperEffectiveAgainst(type)) {
                System.out.println("  - " + possibleWeakness);
            }
        }
    }

    public void mostrarSupereficaz() {
        Type type = this.getType();
        System.out.println("Supereficaz contra: ");
        for (Type possibleEffective : Type.values()) {
            if (type.isSuperEffectiveAgainst(possibleEffective)) {
                System.out.println("  - " + possibleEffective);
            }
        }
    }

    public static void main(String[] args) {
        Habitat habitat = new Habitat(Type.FIRE);
        System.out.println("El habitat es de tipo: " + habitat.getType());
        habitat.mostrarDebilidades();
        habitat.mostrarSupereficaz();
    }
}
