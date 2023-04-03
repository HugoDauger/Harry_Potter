package com.isep.ennemy;
import com.isep.spell.AbstractSpell;
import com.isep.character.Character;
import com.isep.item.SpecialItem;
import lombok.Data;

@Data

public abstract class AbstractEnnemy extends Character{
    protected int hitPower;
    protected AbstractSpell weakness;
    protected SpecialItem weakness2;
    }


