package com.platzi.javatests.player;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public Boolean play(){
        int diceNumber = dice.roll();
        return diceNumber > minNumberToWin;
    }
}
