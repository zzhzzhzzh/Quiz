package com.topQuiz.view;

import com.topQuiz.model.User;

import java.awt.*;

public class Main {
    public static void main(User user) {
        Game2048 game = new Game2048(user);
        JFrame2048 frame = new JFrame2048();
        JPanel2048 panel = new JPanel2048(game);
        KeyControl2048 key = new KeyControl2048(game);
        Button button = new Button(game, panel);
        MouseListener2048 mouse = new MouseListener2048(game, button);

        panel.addMouseListener(mouse);
        frame.addKeyListener(key);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        game.randomGenerator();
    }
}
