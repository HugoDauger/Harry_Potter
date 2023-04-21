package com.isep.enemy;
import com.isep.spell.AbstractSpell;
import com.isep.character.Character;
import com.isep.item.SpecialItem;

public abstract class AbstractEnemy extends Character {
    protected int hitPower;
    protected AbstractSpell weakness;
    protected SpecialItem specialitem1;
    private SpecialItem weakness2;

    public void setWeakness(AbstractSpell weakness) {
        this.weakness = weakness;
    }

    public void setWeakness2(SpecialItem weakness2) {
        this.weakness2 = weakness2;
    }

    public int getHitPower() {
        return hitPower;
    }
    public AbstractSpell getWeakness() {
        return weakness;
    }

    public SpecialItem getWeakness2() {
        return weakness2;
    }

}