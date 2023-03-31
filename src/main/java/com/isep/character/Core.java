package com.isep.character;
import java.util.*;
enum Core {
    PHOENIX_FEATHER,
    DRAGON_HEARTSTRINGS,
    UNICORN_TAIL_HAIRS;
    public static Core selectRandomCore() {
        Random random = new Random();
        Core[] cores = Core.values();
        int index = random.nextInt(cores.length);
        return cores[index];
    }
}

