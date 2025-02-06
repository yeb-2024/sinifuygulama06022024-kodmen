package org.example;

import javax.swing.*;

public class Anasayfa {

    JFrame frame = new JFrame();
    JButton button = new JButton("Profile göster");
    Anasayfa(){

        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
