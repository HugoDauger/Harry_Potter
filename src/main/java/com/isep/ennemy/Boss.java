package com.isep.ennemy;

import com.isep.character.Wand;
import com.isep.spell.AbstractSpell;

public class Boss extends AbstractEnnemy {
    public Boss(double hp, double damage, double potionEfficiency, double dexterity) {
        super(hp, damage, potionEfficiency, dexterity);
    }
}
