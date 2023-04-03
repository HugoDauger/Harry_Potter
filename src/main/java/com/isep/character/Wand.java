package com.isep.character;
import java.util.*;
import lombok.Data;

@Data

public class Wand {
    public Core core;
    public int size;
    public Wand(){
        int size;
        Random rand = new Random();
        size = rand.nextInt(15,33);
        Core CoreChoice = Core.selectRandomCore();
        core = getCore();
    }

    public static void wand() {
    }
}
