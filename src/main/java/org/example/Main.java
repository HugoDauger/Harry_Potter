package org.example;
import com.isep.Pet;
import com.isep.character.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        House.house();
        Wand.wand();
        Pet ChoicePet = Pet.selectPet();
        System.out.println("your pet is a " + ChoicePet + " ");
    }
}