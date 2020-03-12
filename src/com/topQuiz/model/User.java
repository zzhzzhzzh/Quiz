package com.topQuiz.model;

public class User {
    private int id;
    private String username;
    private int maxSocre;
    private int curScore;
    private int type1Score;
    private int type2Score;
    private int type3Score;



    public User(int id, String username, int maxSocre) {
        this.id = id;
        this.username = username;
        this.maxSocre = maxSocre;
        this.curScore = 0;
        this.type1Score = 0;
        this.type2Score = 0;
        this.type3Score = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMaxSocre() {
        return maxSocre;
    }

    public void setMaxSocre(int maxSocre) {
        this.maxSocre = maxSocre;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore = curScore;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", maxSocre=" + maxSocre +
                '}';
    }
}
