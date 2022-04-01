package com.fju.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jack", 77, 51));
        students.add(new Student("Vicky", 45, 64));
        students.add(new GraduateStudent("Jane", 65, 82, 79));
        for (Student s : students) {
            s.print();
        }
    }
}