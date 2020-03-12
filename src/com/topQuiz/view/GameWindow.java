package com.topQuiz.view;

import com.topQuiz.dao.ScoreDao;
import com.topQuiz.model.Score;
import com.topQuiz.model.User;
import com.topQuiz.util.DbUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Timestamp;

public class GameWindow extends JFrame implements ActionListener {
    private JPanel gameChoicePanel;
    private  NavigationPanel navigationPanel;
    private User user;

    public GameWindow(User user) {
        super("Welcome to TopQuiz");
        setSize(800, 300);
        this.user = user;
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        navigationPanel = new NavigationPanel(user, this);
        gameChoicePanel = new GameChoicePanel(this);

        container.add(navigationPanel, BorderLayout.PAGE_START);
        container.add(gameChoicePanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("click game1")) {
            getContentPane().remove(gameChoicePanel);
            repaint();
            try {
                getContentPane().add(new FillBlankPanel(user, navigationPanel), BorderLayout.CENTER);
            } catch (Exception e) {
                e.printStackTrace();
            }
            validate();
        } else if (event.getActionCommand().equals("click game2")) {
            getContentPane().remove(gameChoicePanel);
            repaint();
            try {
                getContentPane().add(new Type2Question(user, navigationPanel), BorderLayout.CENTER);
            } catch (Exception e) {
                e.printStackTrace();
            }
            validate();
        } else if (event.getActionCommand().equals("click game3")){
//            getContentPane().removeAll();
//            repaint();
//            getContentPane().add(new MyPanel());
//            validate();
            Main.main(user);
        } else if (event.getActionCommand().equals("click Home")){
            BorderLayout layout = (BorderLayout) getContentPane().getLayout();
            getContentPane().remove(layout.getLayoutComponent(BorderLayout.CENTER));
            repaint();
            getContentPane().add(gameChoicePanel, BorderLayout.CENTER);
        } else if (event.getActionCommand().equals("click Submit")) {
            int userId = user.getId();
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            int userCurScore = user.getCurScore();
            int type1Score = user.getType1Score();
            int type2Score = user.getType2Score();
            int type3Score = user.getType3Score();

            Score score = new Score(userId, timestamp, userCurScore, type1Score, type2Score, type3Score);

            DbUtil dbUtil = new DbUtil();
            ScoreDao scoreDao = new ScoreDao();
            Connection con = null;
            try {
                con = dbUtil.getCon();
                int n = scoreDao.add(con, score);
                if (n == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully added!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot be added!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    dbUtil.closeCon(con);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            dispose();
        } else if (event.getActionCommand().equals("click history score")) {
            BorderLayout layout = (BorderLayout) getContentPane().getLayout();
            getContentPane().remove(layout.getLayoutComponent(BorderLayout.CENTER));
            repaint();
            getContentPane().add(new ScorePanel(user), BorderLayout.CENTER);
            validate();
        }
    }

    public static void createAndShowGUI(User user) {
        GameWindow gameWindow = new GameWindow(user);
        gameWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
