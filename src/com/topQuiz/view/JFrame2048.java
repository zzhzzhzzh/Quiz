package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;

public class JFrame2048 extends JFrame {
    public  JFrame2048(){
        this.setVisible(true);
        this.setSize(new Dimension(600,680));
        this.setResizable(false);
        this.setTitle("Adding Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
