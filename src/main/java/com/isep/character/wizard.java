package com.isep.character;

import com.isep.SortingHat;

public class wizard extends Character{
    private House maison;
    private Wand wand;
    public wizard(House maison, int hp, int damage, double potionEfficiency, int dexterity) {
        super(hp, damage, potionEfficiency, dexterity);
        this.maison = maison;
        this.wand = wand;
    }
}
