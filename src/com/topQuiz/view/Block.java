package com.topQuiz.view;

import java.awt.*;

public class Block {
    int number;
    int row;
    int column;
    Game2048 game;
    public Block(int number, int row, int column, Game2048 game) {
        this.number = number;
        this.row = row;
        this.column = column;
        this.game = game;
    }

    public void draw(Graphics g) {
        int value = game.panel.sideValue();
        String letter = Integer.toString(number);
        g.setColor(changeColor());
        g.fillRoundRect(row * value / 4 + 10, column * value / 4 + 10,
                value / 4 - 20, value / 4 - 20,30, 30);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        switch (letter.length()) {
            case 2:
                g.drawString(letter, row * value / 4 + value / 12, column * value / 4 + value / 7 + 6);
                break;
            case 3:
                g.drawString(letter, row * value / 4 + value / 14, column * value / 4 + value / 7 + 6);
                break;
            case 4:
                g.drawString(letter, row * value / 4 + value / 18, column * value / 4 + value / 7 + 6);
                break;
            default:
                g.drawString(letter, row * value / 4 + value / 10, column * value / 4 + value / 7 + 6);
                break;
        }
    }

    public Color changeColor() {
        switch (number) {
            case 2:    return new Color(250,228,228);
            case 4:    return new Color(247,210,210);
            case 8:    return new Color(243,184,184);
            case 16:   return new Color(240,167,167);
            case 32:   return new Color(236,150,150);
            case 64:   return new Color(238,136,136);
            case 128:  return new Color(238,121,121);
            case 256:  return new Color(235,104,104);
            case 512:  return new Color(232,86,86);
            case 1024: return new Color(233,69,69);
            case 2048: return new Color(233,40,40);
        }
        return new Color(200,200,200);
    }
}
