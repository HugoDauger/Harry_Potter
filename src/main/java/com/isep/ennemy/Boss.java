package com.isep.ennemy;

import com.isep.character.Wand;
import com.isep.spell.AbstractSpell;

public class Boss extends AbstractEnnemy {
    private Wand wand;
    public Boss(String name, int hitPower, AbstractSpell weakness, Wand wand) {
        super();
        this.name = name;
        this.hitPower = hitPower;
        this.weakness = weakness;
        this.hp = 200;
        this.wand = wand;
    }
}
