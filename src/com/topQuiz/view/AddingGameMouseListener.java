package com.topQuiz.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AddingGameMouseListener implements MouseListener {
    AddingGameController game;
    AddingGameHomeButton buttons;

    public AddingGameMouseListener(AddingGameController game, AddingGameHomeButton buttons) {
        this.game = game;
        this.buttons = buttons;
    }
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {
        game.newGame();
        System.out.println("Mouse success");

    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
