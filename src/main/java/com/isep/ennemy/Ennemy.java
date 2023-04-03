package com.isep.ennemy;

import com.isep.item.SpecialItem;
import com.isep.spell.AbstractSpell;

public class Ennemy extends AbstractEnnemy{

    public Ennemy(String name, int hitPower, AbstractSpell weakness, SpecialItem weakness2){
        this.name = name;
        this.hitPower = hitPower;
        this.weakness = weakness;
        this.weakness2 = weakness2;
    }
}