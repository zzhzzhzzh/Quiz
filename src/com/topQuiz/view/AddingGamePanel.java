package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;

public class AddingGamePanel extends JPanel {
    AddingGameController newAddingGameController;
    private int currentScore;
    private static final int WINSCORE = 10;
    public AddingGamePanel(AddingGameController newAddingGameController) {
        this.newAddingGameController = newAddingGameController;
        newAddingGameController.panel = this;
        currentScore = this.newAddingGameController.user.getCurScore();
    }
    public void paint(Graphics g) {
        drawBoard(g);
        drawBlocks(g);

        if(newAddingGameController.winOrLose()) {
            gameOver(g);
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (newAddingGameController.gameBoard[row][col] != null && newAddingGameController.gameBoard[row][col].number == 64) {
                    currentScore += WINSCORE;
                    newAddingGameController.user.setCurScore(currentScore);
                    newAddingGameController.user.setType3Score(WINSCORE);
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
                if (newAddingGameController.gameBoard[i][j] != null) {
                    newAddingGameController.gameBoard[i][j].draw(g);
                }
            }
        }
    }

    public void drawScore(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Current Score: " + newAddingGameController.user.getCurScore(), 375, 620);
        g.drawString("Current User: " + newAddingGameController.user.getUsername(), 72, 620);
    }

    public int sideValue() {
        return this.getWidth();
    }
}
