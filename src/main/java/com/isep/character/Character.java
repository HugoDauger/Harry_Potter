package com.isep.character;
import lombok.Data;

@Data

public abstract class Character {
    protected int hp;
    protected int damage;
    protected double potionEfficiency;
    protected int dexterity;

    public Character(int hp, int damage, double potionEfficiency, int dexterity) {
        this.hp = hp;
        this.damage = damage;
        this.potionEfficiency = potionEfficiency;
        this.dexterity = dexterity;
    }
}
