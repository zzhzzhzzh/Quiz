package com.topQuiz.view;

import com.topQuiz.model.User;

import java.awt.*;

public class InteractiveGame {
    public static void main(User user, NavigationPanel navPanel) {
        AddingGameController game = new AddingGameController(user);
        AddingGameFrame frame = new AddingGameFrame();
        AddingGamePanel panel = new AddingGamePanel(game);
        AddingGameKeyControl key = new AddingGameKeyControl(game);
        AddingGameHomeButton addingGameHomeButton = new AddingGameHomeButton(game, panel, frame, navPanel, user);
        AddingGameMouseListener mouse = new AddingGameMouseListener(game, addingGameHomeButton);

        panel.addMouseListener(mouse);
        frame.addKeyListener(key);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(addingGameHomeButton, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        game.randomGenerator();
    }
}
