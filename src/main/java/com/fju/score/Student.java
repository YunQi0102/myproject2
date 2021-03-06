package com.fju.score;

//Public:修飾字(子) Modifier--public/default(package)/private/protected(父子類別關係)
public class Student implements Printable {
    public String name;
    int english;
    int math;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int english, int math) {
        this(name);
        this.english = english;
        this.math = math;
    }
    public Student() {
        this("John Doe", -1, -1);
    }
    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }
    public int getAverage() {
        return (english+math)/2;
    }
}
