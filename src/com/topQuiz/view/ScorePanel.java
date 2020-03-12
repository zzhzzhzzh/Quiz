package com.topQuiz.view;

import com.topQuiz.dao.ScoreDao;
import com.topQuiz.model.User;
import com.topQuiz.util.DbUtil;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScorePanel extends JPanel {
    private JTable scoreTable;
    public ScorePanel(User user) {
        String[] columns = {"User Id",
                            "Time",
                            "Total Score",
                            "Text Question Score",
                            "Image Question Score",
                            "Interactive Question Score"};

        String[][] data;
        List<String[]> dataList = new ArrayList<>();
        int userId = user.getId();
        DbUtil dbUtil = new DbUtil();
        ScoreDao scoreDao = new ScoreDao();
        Connection con = null;
        try {
            con = dbUtil.getCon();
            ResultSet res = scoreDao.search(con, userId);
            while (res.next()) {
                String id = String.valueOf(res.getInt("userId"));
                String time = String.valueOf(res.getTimestamp("time"));
                String score = String.valueOf(res.getInt("score"));
                String type1score = String.valueOf(res.getInt("type1score"));
                String type2score = String.valueOf(res.getInt("type2score"));
                String type3score = String.valueOf(res.getInt("type3score"));
                dataList.add(new String[]{id, time, score, type1score, type2score, type3score});
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

        data = dataList.toArray(new String[0][]);
        scoreTable = new JTable(data, columns);
        scoreTable.setBounds(30, 40, 500, 200);
        JScrollPane sp = new JScrollPane(scoreTable);
        sp.setPreferredSize(new Dimension(700, 150));
        add(sp);
        validate();
        setVisible(true);
    }
}
