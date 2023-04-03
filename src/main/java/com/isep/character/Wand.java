package com.isep.character;
import java.util.*;
import lombok.Data;

@Data

public class Wand {
    public static void wand(){
        int size;
        Random rand = new Random();
        size = rand.nextInt(15,33);
        System.out.println(size);
        Core CoreChoice = Core.selectRandomCore();
        System.out.println(CoreChoice);
    }
}
