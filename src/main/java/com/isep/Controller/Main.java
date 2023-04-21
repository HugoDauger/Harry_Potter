package com.isep.Controller;

import com.isep.Controller.Game;

public class Main {

    public static int timer = 3000;

    public static void main(String[] args) throws InterruptedException {
        new Game().playGame();
    }
}