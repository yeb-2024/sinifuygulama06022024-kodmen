package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Anasayfa implements ActionListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("Profile göster");
    Anasayfa(){

        button.setBounds(200,200,100,50);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            ProfileSayfası profileSayfası = new ProfileSayfası();
        }
    }
}
