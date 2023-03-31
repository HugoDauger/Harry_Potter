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
        System.out.println("What is your most important quality?\n" +
                "a) Loyalty\n" +
                "b) Ambition\n" +
                "c) Intelligence\n" +
                "d) Courage\n" +
                "\n");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("What is your biggest flaw?\n" +
                "a) Grudge-holding\n" +
                "b) Jealousy\n" +
                "c) Vanity\n" +
                "d) Recklessness");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("You are faced with a difficult choice, what is the most important factor to you?\n" +
                "a) Justice\n" +
                "b) Power\n" +
                "c) Knowledge\n" +
                "d) The well-being of others");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("What is your favorite element?\n" +
                "a) Earth\n" +
                "b) Water\n" +
                "c) Air\n" +
                "d) Fire");
        reponse = scan.nextLine().toLowerCase();
        switch (reponse) {
            case "a" -> a += 1;
            case "b" -> b += 1;
            case "c" -> c += 1;
            case "d" -> d += 1;
            default -> throw new IllegalArgumentException("invalid response");
        }
        System.out.println("You are faced with an unknown situation, how do you react?\n" +
                "a) I observe and analyze before taking action\n" +
                "b) I charge headfirst without thinking\n" +
                "c) I seek advice from those close to me\n" +
                "d) I am willing to take risks to achieve my goal");
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
        System.out.println("Mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmh interesting... interesting... I see... " + maison.getHouse() + " !");
    }
}
