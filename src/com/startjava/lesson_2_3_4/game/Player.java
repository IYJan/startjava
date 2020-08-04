package com.startjava.lesson_2_3.game;

import java.util.Arrays;

public class Player {
    private static final int attempts = 10;
    private static int i;
    private String name;
    private int countAttemp;
    private int lastAttempt;
    private int[] numbers = new int[attempts];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return countAttemp;
    }

    public void setAttemp(int attemp) {
        countAttemp = attempts - attemp;
        lastAttempt = attemp + 1;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, (attempts - countAttemp) + 1);
    }

    public void setNumbers(int number, int index) {
        this.numbers[index] = number;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, lastAttempt, 0);
    }
}