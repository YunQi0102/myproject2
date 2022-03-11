package com.fju;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("Jack", 77, 51);
        Student vicky = new Student("Vicky", 45, 64);
        GraduateStudent jane = new GraduateStudent("Jane", 65, 82, 79);

        jack.print();
        vicky.print();
        jane.print();
    }
}