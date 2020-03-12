package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;

public class GameChoicePanel extends JPanel{
    private JButton game1, game2, game3;

    public GameChoicePanel(GameWindow gameWindow) {

        game1 = new JButton("Text-based Questions");
        game1.setPreferredSize(new Dimension(230, 200));
        game1.setBackground(new Color(243,184,184));
        game1.setFont(new Font("ARIAL", Font.BOLD, 16));
        game1.setOpaque(true);
        game1.setBorderPainted(false);
        game1.setForeground(Color.DARK_GRAY);
        game1.setActionCommand("click game1");
        game1.addActionListener(gameWindow);

        game2 = new JButton("Image-based Questions");
        game2.setBackground(new Color(236,150,150));
        game2.setFont(new Font("ARIAL", Font.BOLD, 16));
        game2.setOpaque(true);
        game2.setBorderPainted(false);
        game2.setForeground(Color.DARK_GRAY);
        game2.setPreferredSize(new Dimension(230, 200));
        game2.setActionCommand("click game2");
        game2.addActionListener(gameWindow);

        game3 = new JButton("Interactive Game");
        game3.setBackground(new Color(238,121,121));
        game3.setFont(new Font("ARIAL", Font.BOLD, 16));
        game3.setOpaque(true);
        game3.setBorderPainted(false);
        game3.setForeground(Color.DARK_GRAY);
        game3.setPreferredSize(new Dimension(230, 200));
        game3.setActionCommand("click game3");
        game3.addActionListener(gameWindow);

        add(game1);
        add(game2);
        add(game3);

        setVisible(true);
    }
}
