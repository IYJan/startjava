package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    private static final int ATTEMPS = 10;
    private String name;
    private int countAttemp;
    private int[] numbers = new int[ATTEMPS];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

     public int getAttempts() {
        return ATTEMPS - countAttemp;
    }

    public void setAttemp() {
        countAttemp++;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttemp);
    }

    public void setNumbers(int number, int index) {
        this.numbers[index] = number;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, countAttemp, 0);
        countAttemp = 0;
    }
}