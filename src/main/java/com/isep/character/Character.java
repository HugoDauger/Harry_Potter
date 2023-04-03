package com.isep.character;
import lombok.Data;

@Data

public abstract class Character {
    protected String name;
    protected double hp;
    protected double damage;
    protected double potionEfficiency;
    protected double dexterity;

    public Character(double hp, double damage, double potionEfficiency, double dexterity) {
        this.hp = hp;
        this.damage = damage;
        this.potionEfficiency = potionEfficiency;
        this.dexterity = dexterity;
    }

    protected Character() {
    }

    public void attack(Character character) {
        System.out.println("I'm attacking ");
    }

    public boolean isAlive(Character character) {
        if (character.getHp() > 0) {
            System.out.println(character.getName() + " is alive with " + character.getHp() + " HP ! ");
            return true;
        } else {
            System.out.println(character.getName() + " is dead ! ");
            return false;
        }
    }

    public boolean isCharacterAliveWithoutPrint(Character character) {
        if (character.getHp() > 0) {
            return true;
        } else {
            return false;
        }
    }
}

