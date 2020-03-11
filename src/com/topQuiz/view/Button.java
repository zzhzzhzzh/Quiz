package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener {
    Game2048 game;
    JPanel2048 panel;

    public Button (Game2048 game, JPanel2048 panel) {
        this.game = game;
        this.panel = panel;
        this.setFont(new Font("Arial",1,16));
        this.setText("New Game");
        this.addActionListener(this);
        this.setFocusable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Restart the game");
        game.newGame();
        game.gameOver = false;
        game.randomGenerator();
        panel.repaint();
    }
}
