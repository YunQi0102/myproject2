package com.fju.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//swing, SWT, JavaFX
//eXtension
public class MyWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setLocation(450,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //add Component
        JButton button = new JButton("Click 1");
        JButton button1 = new JButton("Click 2");
        //匿名類別, Anonymous class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hi!");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Bye!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(button1);

        frame.setVisible(true);
        System.out.println("END?");
    }
}
