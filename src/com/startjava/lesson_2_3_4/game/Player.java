package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int countAttemp;
    private int[] numbers;

    public Player(String name, int numbers) {
        this.name = name;
        this.numbers = new int[numbers];
    }

    public int getCountAttemp() {
        return countAttemp;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[countAttemp] = number;
        countAttemp++;
    }

    public int getLastNumber() {
        return numbers[countAttemp - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttemp);
    }
}