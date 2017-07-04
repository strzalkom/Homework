package com.sda.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lenovo on 01.07.2017.
 */
public class Application {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Hello World");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new GridLayout(3, 3));

        JTextField jLabel = new JTextField("Witaj");
        JButton jButton = new JButton("Napraw");
        jButton.addActionListener(e -> {
            String text = jLabel.getText();
            jButton.setText(text);
            jLabel.setText("");
            jFrame.repaint();
        });
        JTextField jLabel2 = new JTextField("Witaj");
        JButton jButton2 = new JButton("Napraw");
        jButton2.addActionListener(e -> {
            String text = jLabel2.getText();
            jButton2.setText(text);
            jLabel2.setText("");
            jFrame.repaint();
        });
        JTextField jLabel3 = new JTextField("Witaj");
        JButton jButton3 = new JButton("Click Me");
        jButton3.addActionListener(e -> {
            String text = jLabel3.getText();
            jButton3.setText(text);
            jLabel3.setText("");
            jFrame.repaint();
        });
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jPanel.add(jLabel2);
        jPanel.add(jButton2);
        jPanel.add(jLabel3);
        jPanel.add(jButton3);


        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
