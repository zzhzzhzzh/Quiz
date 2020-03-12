package com.topQuiz.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AddingGameKeyControl implements KeyListener {
    AddingGameController newGame;
    public AddingGameKeyControl(AddingGameController newGame) {
        this.newGame = newGame;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        newGame.gamePlay(e.getKeyCode());
        System.out.println("key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
