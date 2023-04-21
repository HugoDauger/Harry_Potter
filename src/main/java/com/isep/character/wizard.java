package com.isep.character;

import com.isep.View.Pet;

import com.isep.View.Potion;
import com.isep.enemy.AbstractEnemy;
import com.isep.item.SpecialItem;
import com.isep.spell.AbstractSpell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class wizard extends Character {
    private int wizTimer = 3000;
    private Pet pet;
    private Wand wand;
    private House house;
    public List<AbstractSpell> knownSpells = new ArrayList<>();
    public List<Potion> potions = new ArrayList<>();
    public List<SpecialItem> weapons = new ArrayList<>();
    public Map<String, Double> stats = new HashMap<>();


    public wizard(String name) {
        this.name = name;
        stats.put("Potions Efficiency", 1.0);
        stats.put("Spells Damages", 1.0);
        stats.put("Shield", 1.0);
        stats.put("Spells Precision", 0.5);
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void applyAsset(String houseName) {
        switch (houseName) {
            case "Hufflepuff" -> {
                stats.put("Potions Efficiency", stats.get("Potions Efficiency") + 0.5);
                System.out.println("As a member of Hufflepuff, you get a 50% bonus on Potions efficiency!");
            }
            case "Slytherin" -> {
                stats.put("Spells Damages", stats.get("Spells Damages") + 0.5);
                System.out.println("As a member of Slytherin, you get a 50% bonus on Spells damages!");
            }
            case "Gryffindor" -> {
                stats.put("Shield", stats.get("Shield") + 0.5);
                System.out.println("As a member of Gryffindor, you get a 50% bonus on your damage resistance!");
            }
            case "Ravenclaw" -> {
                stats.put("Spells Precision", stats.get("Spells Precision") + 0.25);
                System.out.println("As a member of Ravenclaw, you get a 50% bonus on Spells Precision!");
            }
        }
    }

    public boolean tryDodge() {
        Random rand = new Random();
        int randInt = rand.nextInt(2);
        return randInt == 1;
    }

    public void defend(wizard wizard, AbstractEnemy enemy) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are getting attacked by " + enemy.getName() + "! You have 2 choices : either you try to dodge the attack (it may fail), other you chose to take the hit and lose less HP. What do you wanna do (type 'dodge' or 'take')?  :");
        String choice = scanner.nextLine();
        while (!choice.equals("dodge") && !choice.equals("take")) {
            System.out.println("Error : Please type 'dodge' or 'take'");
            choice = scanner.nextLine();
        }
        Thread.sleep(wizTimer);
        switch (choice) {
            case "dodge" -> {
                boolean dodgeSuccess = tryDodge();
                if (dodgeSuccess) {
                    System.out.println("You are lucky, you dodged the attack!");
                } else {
                    System.out.println("Dodge failed, you are taking the full hit!");
                    wizard.setHp(wizard.getHp() - (enemy.getDamage() / stats.get("Shield")));
                }
            }
            case "take" -> {
                System.out.println("You are taking the hit!");
                wizard.setHp(wizard.getHp() - ((enemy.getDamage() / 2) / stats.get("Shield")));
            }
        }
        isCharacterAlive(wizard);
    }

    public void drinkPotion(Potion potion, wizard wizard) throws InterruptedException {
        System.out.println("Drinking " + potion.getName() + "...");
        Thread.sleep(wizTimer);
        wizard.setHp(potion.getHeal() * stats.get("Potions Efficiency") + wizard.getHp());
        potions.remove(potion);
        System.out.println("You have now " + wizard.getHp() + "HP!");
    }

    public void attackWithSpell(AbstractSpell spell, AbstractEnemy enemy) throws InterruptedException {
        System.out.println("Using " + spell.getName() + " against " + enemy.getName() + "...");
        Thread.sleep(wizTimer);
        if (enemy.getWeakness() == spell) {
            Random rand = new Random();
            int randInt = rand.nextInt(100);
            if (randInt > 100 * stats.get("Spells Precision")) {
                System.out.println("Attack failed, you lacked precision!");
            } else {
                System.out.println("Nice hit!");
                enemy.setHp(enemy.getHp() - spell.getDamage() * stats.get("Spells Damages"));
                enemy.isCharacterAlive(enemy);
            }
        } else {
            System.out.println("This spell is ineffective on " + enemy.getName() + "! You should rather use " + enemy.getWeakness().name + "!");
        }

    }

    public void attackWithWeapon(SpecialItem weapon, AbstractEnemy enemy) throws InterruptedException {
        System.out.println("Using " + weapon.getName() + " against " + enemy.getName() + "...");
        Thread.sleep(wizTimer);
        if (enemy.getWeakness2() == weapon) {
            Random rand = new Random();
            int randInt = rand.nextInt(100);
            if (randInt > 100 * stats.get("Spells Precision")) {
                System.out.println("Attack failed, you lacked precision!");
            } else {
                System.out.println("Nice hit!");
                enemy.setHp(enemy.getHp() - weapon.getDamage() * stats.get("Spells Damages"));
                enemy.isCharacterAlive(enemy);
            }
        } else {
            System.out.println("This weapon is ineffective on " + enemy.getName() + "! You should rather use " + enemy.getWeakness2().name + "!");
        }

    }

    public void getAPet() {
        Random rand = new Random();
        int randIntPet = rand.nextInt(Pet.values().length);
        this.pet = Pet.values()[randIntPet];
    }

    @Override
    public boolean isCharacterAlive(Character character) {
        if (character.getHp() >= 0) {
            System.out.println("You are still alive with " + character.getHp() + " HP!");
            return true;
        } else {
            System.out.println("You are dead!");
            System.exit(0);
            return false;
        }
    }

    public void getReward(Potion potion, AbstractSpell abstractSpell) {
        potions.add(potion);
        knownSpells.add(abstractSpell);
        System.out.println("You received " + potion.getName() + " (" + potion.getHeal() + "HP) & " + abstractSpell.getName() + " (" + abstractSpell.getDamage() + "DMG) in your inventory");
    }

    public void lvlUp() {
        System.out.println("You successfully passed a year of Poudlard!");
        System.out.println("You have also increased your skills! You get a 10% increase on all your stats!");
        stats.put("Potions Efficiency", stats.get("Potions Efficiency") * 1.1);
        stats.put("Spells Damages", stats.get("Spells Damages") * 1.1);
        stats.put("Shield", stats.get("Shield") * 1.1);
        stats.put("Spells Precision", stats.get("Spells Precision") * 1.1);
    }

    public void getNewWeapon(SpecialItem weapon) {
        weapons.add(weapon);
        System.out.println("You received " + weapon.getName() + " (" + weapon.getDamage() + "DMG) in your inventory");
    }
}
