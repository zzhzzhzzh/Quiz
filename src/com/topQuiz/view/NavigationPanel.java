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
        homeBtn.setActionCommand("click Home");
        homeBtn.addActionListener(gameWindow);

        submitBtn = new JButton("Submit score");
        submitBtn.setActionCommand("click Submit");
        submitBtn.addActionListener(gameWindow);

        lookUpHistoryScores = new JButton("History score");
        lookUpHistoryScores.setActionCommand("click history score");
        lookUpHistoryScores.addActionListener(gameWindow);

        username = new JLabel(user.getUsername());
        username.setFont(new Font("ARIAL", Font.PLAIN, 19));
        username.setForeground(Color.BLUE);

        score = new JLabel(String.valueOf(user.getCurScore()));
        add(username);
        add(score);
        add(homeBtn);
        add(submitBtn);

        setVisible(true);
    }

    public void updateScore(int score) {
        this.score.setText(String.valueOf(score));
    }



}
