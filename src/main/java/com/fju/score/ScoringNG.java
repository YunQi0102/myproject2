package com.fju.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"Jack", "Vicky", "Elva", "Windy", "Sunny"};
        int[] englishes = {77, 45, 84, 60, 92};
        int[] maths = {51, 64, 73, 69, 80};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + englishes[i] + "\t" + maths[i] + "\t" + (englishes[i]+maths[i])/2);
        }
    }
}
