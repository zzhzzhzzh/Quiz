package com.topQuiz.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TopQuizMain extends JFrame implements ActionListener {
    private JButton user, admin;

    public TopQuizMain() {
        super("Welcome to TopQuiz");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        admin = new JButton("ADMIN");
        admin.setPreferredSize(new Dimension(200,200));
        admin.setBackground(new Color(169,169,169));
        admin.setForeground(Color.BLACK);
        admin.setFont(new Font("ARIAL", Font.BOLD, 16));
        admin.setOpaque(true);
        admin.setBorderPainted(false);
        admin.setActionCommand("click admin");
        admin.addActionListener(this);
        container.add(admin);

        user = new JButton("USER");
        user.setPreferredSize(new Dimension(200, 200));
        user.setBackground(new Color(192,192,192));
        user.setForeground(Color.BLACK);
        user.setFont(new Font("ARIAL", Font.BOLD, 16));
        user.setOpaque(true);
        user.setBorderPainted(false);
        user.setActionCommand("click user");
        user.addActionListener(this);
        container.add(user);

        pack();
        setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("click admin")) {
            new AdminLogin().setVisible(true);
        } else {
            new UserLogin().setVisible(true);
        }

    }


    public static void main(String[] args) {

        TopQuizMain topQuizMain = new TopQuizMain();
        topQuizMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
