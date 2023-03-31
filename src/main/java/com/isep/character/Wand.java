package com.isep.character;
import java.util.*;

public class Wand {
    public static void wand(){
        float weight;
        Random rand = new Random();
        weight = rand.nextFloat(18,38);
        System.out.println(weight);
        Core CoreChoice = Core.selectRandomCore();
        System.out.println(CoreChoice);
    }
}
