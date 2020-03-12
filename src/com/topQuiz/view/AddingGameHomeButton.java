package com.topQuiz.view;

import com.topQuiz.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingGameHomeButton extends JButton implements ActionListener {
    AddingGameController game;
    AddingGamePanel panel;
    AddingGameFrame frame;
    NavigationPanel navPanel;
    User user;

    public AddingGameHomeButton(AddingGameController game, AddingGamePanel panel, AddingGameFrame frame, NavigationPanel navPanel, User user) {
        this.game = game;
        this.panel = panel;
        this.frame = frame;
        this.navPanel = navPanel;
        this.user = user;
        this.setFont(new Font("Arial",1,16));
        this.setForeground(Color.DARK_GRAY);
        this.setText("Back to Home");
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
        frame.dispose();
        navPanel.updateScore(user.getCurScore());
    }
}
