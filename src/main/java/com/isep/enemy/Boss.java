package com.isep.enemy;

import com.isep.character.Wand;
import com.isep.spell.AbstractSpell;

public class Boss extends AbstractEnemy {
    private Wand wand;
    public Boss(String name, int hitPower, AbstractSpell weakness, Wand wand){
        this.name = name;
        this.hitPower = hitPower;
        this.weakness = weakness;
        this.hp = 200;
        this.wand = wand;
    }

    public Wand getWand() {
        return wand;
    }
}
