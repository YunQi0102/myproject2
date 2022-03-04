package com.fju;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"Jack", "Vicky", "Elva", "Windy", "Sunny"};
        int[] englishs = {77, 45, 84, 60, 92};
        int[] maths = {51, 64, 73, 69, 80};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i]+maths[i])/2);
        }
    }
}
