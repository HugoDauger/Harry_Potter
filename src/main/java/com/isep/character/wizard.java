package com.isep.character;

import com.isep.Pet;
import com.isep.SortingHat;

public class wizard extends Character{
    private Pet pet;
    private House house;
    private Wand wand;
    public wizard(House maison, int hp, int damage, double potionEfficiency, int dexterity) {
        super(hp, damage, potionEfficiency, dexterity);
        this.house = house;
        this.wand = wand;
        this.pet = pet;
    }
}
