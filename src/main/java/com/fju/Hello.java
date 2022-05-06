package com.fju;

import com.fju.score.Student;

import java.awt.*;
import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //絕對值
        int a = Math.abs(100-300);
        System.out.println(a);
        System.out.println("Hello world");
        Student s = new Student();
        System.out.println(s.name);
    }
}
