package com.isep.character;

import com.isep.SortingHat;

import java.util.*;

public class House {
    public static void house() {
        SortingHat maison = new SortingHat();
        Scanner scan = new Scanner(System.in);
        String reponse = new String();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        System.out.println("Quelle est votre qualité la plus importante ?\n" +
                "a) La loyauté\n" +
                "b) L'ambition\n" +
                "c) L'intelligence\n" +
                "d) Le courage");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("Quel est votre plus grand défaut ?\n" +
                "a) La rancune\n" +
                "b) La jalousie\n" +
                "c) La vanité\n" +
                "d) La témérité");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("Vous êtes face à un choix difficile, quel critère est le plus important pour vous ?\n" +
                "a) La justice\n" +
                "b) Le pouvoir\n" +
                "c) La connaissance\n" +
                "d) Le bien-être des autres");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("Quel est votre élément préféré ?\n" +
                "a) La terre\n" +
                "b) L'eau\n" +
                "c) L'air\n" +
                "d) Le feu");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("Vous êtes confronté(e) à une situation inconnue, comment réagissez-vous ?\n" +
                "a) J'observe et j'analyse avant d'agir\n" +
                "b) Je fonce tête baissée sans réfléchir\n" +
                "c) Je demande conseil à mes proches\n" +
                "d) Je suis prêt(e) à prendre des risques pour atteindre mon objectif");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        if(a > b && a > c && a > d){
            maison.setHouse("Gryffindor");
        }
        else if(b > a && b > c && b >d){
            maison.setHouse("Slytherin");
        }
        else if(c > a && c > b && c >d){
            maison.setHouse("Ravenclaw");
        }
        else{
            maison.setHouse("Hufflepuff");
        }
        System.out.println("Mmmmmmmmh intéressant... Mmmmmmmmh très intéressant... " + maison.getHouse() + " !");
    }
}
