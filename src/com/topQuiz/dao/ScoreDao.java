package com.topQuiz.dao;

import com.topQuiz.model.Score;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ScoreDao {

    public int add(Connection con, Score score) throws Exception {
        String sql = "insert into t_Score values(null, ?, ?, ?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, score.getUserId());
        pstmt.setTimestamp(2, score.getTimestamp());
        pstmt.setInt(3, score.getScore());
        pstmt.setInt(4, score.getType1Score());
        pstmt.setInt(5, score.getType2Score());
        pstmt.setInt(6, score.getType3Score());
        return pstmt.executeUpdate();
    }
}
