package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttemp;
    private int[] numbers;// = new int[];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountAttemp (int numbers){
        this.numbers = new int[numbers];
    }

    public int getLastAttemp() {
        return countAttemp;
    }

    public int getLastNumber() {
        return numbers[countAttemp - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttemp);
    }

    public void setNumber(int number) {
        numbers[countAttemp] = number;
        countAttemp++;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, countAttemp, 0);
        countAttemp = 0;
    }
}