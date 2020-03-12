package com.topQuiz.model;

import java.sql.Timestamp;

public class Score {
    private int id;
    private int userId;
    private Timestamp timestamp;
    private int score;
    private int type1Score;
    private int type2Score;
    private int type3Score;

    public Score(int userId, Timestamp timestamp, int score, int type1Score, int type2Score, int type3Score) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.score = score;
        this.type1Score = type1Score;
        this.type2Score = type2Score;
        this.type3Score = type3Score;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public int getScore() {
        return score;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getType1Score() {
        return type1Score;
    }

    public void setType1Score(int type1Score) {
        this.type1Score = type1Score;
    }

    public int getType2Score() {
        return type2Score;
    }

    public void setType2Score(int type2Score) {
        this.type2Score = type2Score;
    }

    public int getType3Score() {
        return type3Score;
    }

    public void setType3Score(int type3Score) {
        this.type3Score = type3Score;
    }
}
