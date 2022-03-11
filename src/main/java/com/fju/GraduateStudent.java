package com.fju;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int english, int math, int thesis) {
    super(name, english, math);
    this.thesis = thesis;
    }
    public void print() {
        System.out.println(name + "\t" + math + "\t" + getAverage() + "\t" + thesis);
    }
}
