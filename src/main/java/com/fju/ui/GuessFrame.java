package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {
    //Fields 屬性
    JButton button = new JButton("Guess");
    JLabel label = new JLabel("Enter a number 1-20 :");
    JLabel label1 = new JLabel();
    JTextField number = new JTextField(5);
    Random random = new Random();
    int secret = random.nextInt(20)+1;
    //Constructors 建構子
    public GuessFrame() {
        super();
        System.out.println("Secret number: " + secret);
        setSize(600, 400);
        setLocation(450, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num < secret) {
                    label1.setText("Bigger");
                } else if (num > secret) {
                    label1.setText("Smaller");
                } else {
                    label1.setText("Bingo! The secret number is " + secret + " !");
                }
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(number);
        add(button);
        add(label1);
        setVisible(true);
    }
    //Methods 方法
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600, 400);
//        guessFrame.setVisible(true);
    }
}
