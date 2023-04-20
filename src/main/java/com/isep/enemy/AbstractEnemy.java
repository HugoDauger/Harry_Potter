package com.isep.enemy;
import com.isep.spell.AbstractSpell;
import com.isep.character.Character;
import com.isep.item.SpecialItem;



public abstract class AbstractEnemy extends Character{
    protected int hitPower;
    protected AbstractSpell weakness;
    protected SpecialItem weakness2;

    public AbstractEnemy(double hp, double damage, double potionEfficiency, double dexterity) {
        super(hp, damage, potionEfficiency, dexterity);
    }

    protected AbstractEnemy() {
    }
}


