package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;

public class JPanel2048 extends JPanel {
    Game2048 newGame2048;
    private int currentScore;
    private static final int WINSCORE = 10;
    public JPanel2048(Game2048 newGame2048) {
        this.newGame2048 = newGame2048;
        newGame2048.panel = this;
        currentScore = this.newGame2048.user.getCurScore();
    }
    public void paint(Graphics g) {
        drawBoard(g);
        drawBlocks(g);

        if(newGame2048.winOrLose()) {
            gameOver(g);
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (newGame2048.gameBoard[row][col] != null && newGame2048.gameBoard[row][col].number == 64) {
                    currentScore += WINSCORE;
                    newGame2048.user.setCurScore(currentScore);
                    newGame2048.user.setType3Score(WINSCORE);
                    win(g);
                }
            }
        }
        drawScore(g);
    }

    public void drawBoard(Graphics g) {
        int panelWidth = this.getWidth();
        int blockWidth = panelWidth / 4 - 20;
        g.setColor(new Color(200,200,200));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                g.fillRoundRect(10 + j * panelWidth / 4, 10 + i * panelWidth / 4, blockWidth, blockWidth, 30, 30);
            }
        }
    }

    public void gameOver(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(),this.getWidth());
        g.setColor(Color.WHITE);
        g.setFont(new Font("Arial", Font.BOLD, 80));
        g.drawString("GAME OVER", 60, 300);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Final score: " + currentScore, 150, 380);
    }

    public void win(Graphics g) {
        g.setColor(new Color(204, 255, 229));
        g.fillRect(0,0,this.getWidth(),this.getWidth());
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 80));
        g.drawString("You Win", 130, 300);
        g.setFont(new Font("Arial", Font.BOLD, 40));
        g.drawString("Final score: " + currentScore, 150, 380);
    }

    public void drawBlocks(Graphics g)
    {
        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                if (newGame2048.gameBoard[i][j] != null) {
                    newGame2048.gameBoard[i][j].draw(g);
                }
            }
        }
    }

    public void drawScore(Graphics g){
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Current Score: " + newGame2048.user.getCurScore(), 227, 615);
//        g.setColor(new Color(233,86,86));
//        g.drawString("Highest Score: " + newGame2048.highestScore, 10, 620);
    }

    public int sideValue() {
        return this.getWidth();
    }
}
