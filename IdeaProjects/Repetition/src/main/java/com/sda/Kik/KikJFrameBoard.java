package com.sda.Kik;

import kik.Board;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by lenovo on 01.07.2017.
 */
public class KikJFrameBoard extends JFrame {
    private Board board;
    private String currentSign;
    private JPanel panel;

    private java.util.List<JButton> buttons;


    public KikJFrameBoard() throws HeadlessException {
        super("Kolko i Krzyzyk");
        this.buttons = new ArrayList<>();
        this.board = new Board();
        this.panel = new JPanel(new GridLayout(3, 3));
        this.currentSign = "X";
        initPanel();
        this.getContentPane().add(panel);
    }

    public String getCurrentSign() {
        return currentSign;
    }


    public void setCurrentSign(String currentSign) {
        this.currentSign = currentSign;
    }


    private void initPanel() {
        for (int i = 0; i < 9; i++) {
            int position = i;
            JButton jButton = new JButton();

            jButton.addActionListener(new KikButtonActionListener(board, position, jButton, panel, this));
//            jButton.addActionListener(e -> {
//                jButton.setText(currentSign);
//                board.addMove(position + 1, currentSign);
//                System.out.println(board.toString());
//                jButton.setEnabled(false);
//                currentSign = currentSign.equals("X") ? "O" : "X";
//                panel.repaint();
//            });
            panel.add(jButton);
            buttons.add(jButton);

        }
    }

    public void run() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(225, 225));
        this.pack();
        this.setVisible(true);
    }

    public void resetBoard() {
        buttons.forEach(e -> {
            e.setEnabled(true);
            e.setText("");

        });
        board.resetBoard();
    }
}

