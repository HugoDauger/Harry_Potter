package com.isep.View;

import java.util.Random;

public enum Pet {
    OWL,
    RAT,
    CAT,
    TOAD;
    public static Pet selectPet(){
        Random random = new Random();
        Pet[] pets = Pet.values();
        int index = random.nextInt(pets.length);
        return  pets[index];
    }
}
