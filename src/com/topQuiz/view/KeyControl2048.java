package com.topQuiz.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControl2048 implements KeyListener {
    Game2048 newGame;
    public KeyControl2048(Game2048 newGame) {
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
