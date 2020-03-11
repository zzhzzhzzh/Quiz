package com.topQuiz.view;

public class Game2048 {

    JPanel2048 panel;
    Block[][] gameBoard;
    boolean gameOver;
    boolean canMove = true;
    private static final int LEFT = 37;
    private static final int UP = 38;
    private static final int RIGHT = 39;
    private static final int DOWN = 40;

    public Game2048() {
        gameBoard = new Block[4][4];
        gameOver = false;
    }

    public void newGame() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                gameBoard[i][j] = null;
            }
        }
    }


    // random generate a block
    public void randomGenerator() {
        int row = (int) (Math.random() * 4);
        int col = (int) (Math.random() * 4);
        while(gameBoard[row][col] != null) {
            row = (int) (Math.random() * 4);
            col = (int) (Math.random() * 4);
        }
        if ((int) (Math.random() * 2) == 0) {
            gameBoard[row][col] = new Block(2, row, col,this);
        } else
            gameBoard[row][col] = new Block(4, row, col,this);
    }


    //move blocks and add numbers when two neighbor blocks have the same number
    public void gamePlay(int keyCode) {
        if(gameOver)
            return;
        canMove = false;
        switch (keyCode) {
            //left arrow key, i-column, j-row;
            case LEFT:
                System.out.println("left");
                for (int i = 1; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (i > 0 && gameBoard[i][j] != null) {
                            if (gameBoard[i - 1][j] == null) {
                                while (i > 0 && gameBoard[i - 1][j] == null) {
                                    gameBoard[i - 1][j] = gameBoard[i][j];
                                    gameBoard[i][j] = null;
                                    gameBoard[i - 1][j].row = gameBoard[i - 1][j].row - 1;
                                    i --;
                                    while (i > 0 && gameBoard[i - 1][j] != null
                                            && blockValue(i - 1, j) == blockValue(i, j)) {
                                        gameBoard[i - 1][j].number += gameBoard[i][j].number;
                                        gameBoard[i][j] = null;
                                        i --;
                                    }
                                }
                            } else if (blockValue(i - 1, j) == blockValue(i, j)) {
                                gameBoard[i - 1][j].number += gameBoard[i][j].number;
                                gameBoard[i][j] = null;
                                i --;
                            }
                        }
                    }
                }
                break;
            //up arrow key, i-column, j-row
            case UP:
                System.out.println("up");
                for (int i = 0; i < 4; i ++) {
                    for (int j = 1; j < 4; j ++) {
                        if (j > 0 && gameBoard[i][j] != null) {
                            if (gameBoard[i][j - 1] == null) {
                                canMove = true;
                                while (j > 0 && gameBoard[i][j - 1] == null) {
                                    gameBoard[i][j - 1] = gameBoard[i][j];
                                    gameBoard[i][j] = null;
                                    gameBoard[i][j - 1].column = gameBoard[i][j - 1].column - 1;
                                    j --;
                                    while (j > 0 && gameBoard[i][j - 1] != null
                                            && blockValue(i,j - 1) == blockValue(i, j)) {
                                        gameBoard[i][j - 1].number += gameBoard[i][j].number;
                                        gameBoard[i][j] = null;
                                        j --;
                                    }
                                }
                            } else if (blockValue(i,j - 1) == blockValue(i, j)) {
                                canMove = true;
                                gameBoard[i][j - 1].number += gameBoard[i][j].number;
                                gameBoard[i][j] = null;
                                j --;
                            }
                        }
                    }
                }
                break;
            //right arrow key, i-column, j-row
            case RIGHT:
                System.out.println("right");
                for (int i = 3; i >= 0; i --) {
                    for(int j = 0; j < 4; j ++) {
                        if (i < 3 && gameBoard[i][j] != null) {
                            if (gameBoard[i + 1][j] == null) {
                                canMove = true;
                                while (i < 3 && gameBoard[i + 1][j] == null) {
                                    gameBoard[i + 1][j] = gameBoard[i][j];
                                    gameBoard[i][j] = null;
                                    gameBoard[i + 1][j].row = gameBoard[i + 1][j].row + 1;
                                    i ++;
                                    while (i < 3 && gameBoard[i + 1][j] != null
                                            && blockValue(i + 1, j) == blockValue(i, j)) {
                                        gameBoard[i + 1][j].number += gameBoard[i][j].number;
                                        //score += blockValue(i+1,j);
                                        gameBoard[i][j] = null;
                                        i ++;
                                    }
                                }
                            } else if (blockValue(i + 1, j) == blockValue(i, j)) {
                                canMove = true;
                                gameBoard[i + 1][j].number += gameBoard[i][j].number;
                                gameBoard[i][j] = null;
                                i ++;
                            }
                        }
                    }
                }
                break;

            //down arrow key, i-column, j-row
            case DOWN:
                System.out.println("down");
                for (int i = 0; i < 4; i ++) {
                    for (int j = 3; j >= 0; j --) {
                        if (j < 3 && gameBoard[i][j] != null) {
                            if (gameBoard[i][j + 1] == null) {
                                canMove = true;
                                while (j < 3 && gameBoard[i][j + 1] == null) {
                                    gameBoard[i][j + 1] = gameBoard[i][j];
                                    gameBoard[i][j] = null;
                                    gameBoard[i][j + 1].column = gameBoard[i][j + 1].column + 1;
                                    j ++;
                                    while (j < 3 && gameBoard[i][j + 1] != null &&
                                            blockValue(i,j + 1) == blockValue(i, j)) {
                                        gameBoard[i][j + 1].number += gameBoard[i][j].number;
                                        gameBoard[i][j] = null;
                                        j ++;
                                    }
                                }
                            } else if (blockValue(i,j + 1) == blockValue(i, j)) {
                                canMove = true;
                                gameBoard[i][j + 1].number += gameBoard[i][j].number;
                                gameBoard[i][j] = null;
                                j ++;
                            }
                        }
                    }
                }
                break;

            default:
                System.out.println("Please operate only " +
                        "with UP, DOWN, RIGHT, and LEFT keys.");
                break;
        }
        randomGenerator();
        panel.repaint();
        if (winOrLose()) {
            gameOver = true;
            panel.repaint();
        }
    }
    //win or lose condition
    public boolean winOrLose() {
        int count = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (gameBoard[row][col] != null && gameBoard[row][col].number == 2048) {
                    //writeToFile();
                    return true;
                } else if (gameBoard[row][col] != null) {
                    count++;
                }
            }
        }
        if (count == 16) {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    if (blockValue(i,j) == blockValue(i-1,j) ||
                            blockValue(i,j) == blockValue(i+1,j) ||
                            blockValue(i,j) == blockValue(i,j-1) ||
                            blockValue(i,j) == blockValue(i,j+1))
                    return false;
                }
            }
            if (blockValue(0,0) == blockValue(0,1)
                    || blockValue(0,1) == blockValue(0,2) ||
                    blockValue(0,2) == blockValue(0,3))
                return false;
            else if (blockValue(0,0) == blockValue(1,0)
                    || blockValue(1,0) == blockValue(2,0) ||
                    blockValue(2,0) == blockValue(3,0))
                return false;
            else if (blockValue(0,3) == blockValue(1,3)
                    || blockValue(1,3) == blockValue(2,3) ||
                   blockValue(2,3) == blockValue(3,3))
                return false;
            else if (blockValue(3,0) == blockValue(3,1)
                    || blockValue(3,1) == blockValue(3,2) ||
                    blockValue(3,2) == blockValue(3,3))
                return false;
            else
                return true;
        } else {
            return false;
        }
    }
    public int blockValue(int rol, int col) {
        return gameBoard[rol][col].number;
    }
}

