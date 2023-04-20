package com.isep.enemy;

import com.isep.item.SpecialItem;
import com.isep.spell.AbstractSpell;

public class Enemy extends AbstractEnemy{

    public Enemy(String name, int hitPower, AbstractSpell weakness, SpecialItem weakness2){
        this.name = name;
        this.hitPower = hitPower;
        this.weakness = weakness;
        this.weakness2 = weakness2;
    }
}