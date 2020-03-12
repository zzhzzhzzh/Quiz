package com.topQuiz.view;

import com.topQuiz.model.User;

import javax.swing.*;
import java.awt.*;

public class NavigationPanel extends JPanel  {
    private JButton homeBtn, submitBtn, lookUpHistoryScores;
    private JLabel username, score;
    private User user;

    public NavigationPanel(User user, GameWindow gameWindow) {
        this.user = user;
        setLayout(new FlowLayout());

        homeBtn = new JButton("Home");
        homeBtn.setFont(new Font("Arial", Font.BOLD, 12));
        homeBtn.setActionCommand("click Home");
        homeBtn.addActionListener(gameWindow);

        submitBtn = new JButton("Submit score");
        submitBtn.setFont(new Font("Arial", Font.BOLD, 12));
        submitBtn.setActionCommand("click Submit");
        submitBtn.addActionListener(gameWindow);

        lookUpHistoryScores = new JButton("History score");
        lookUpHistoryScores.setFont(new Font("Arial", Font.BOLD, 12));
        lookUpHistoryScores.setActionCommand("click history score");
        lookUpHistoryScores.addActionListener(gameWindow);

        username = new JLabel("Current User: " + user.getUsername());
        username.setLocation(55,380);
        username.setFont(new Font("ARIAL", Font.BOLD, 12));
        username.setForeground(Color.DARK_GRAY);

        score = new JLabel("Current score:" + user.getCurScore());
        score.setLocation(500, 380);
        score.setFont(new Font("ARIAL", Font.BOLD, 12));
        add(username, BorderLayout.WEST);
        add(homeBtn);
        add(submitBtn);
        add(lookUpHistoryScores);
        add(score, BorderLayout.EAST);
        setVisible(true);
    }

    public void updateScore(int score) {
        this.score.setText(String.valueOf(score));
    }
}
