package com.fju;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack");
        jack.name = "Jack";
        jack.english = 77;
        jack.math = 51;
        Student vicky = new Student("Vicky", 45, 64);
        Student s = new Student();
        jack.print();
        vicky.print();
        s.print();
    }
}