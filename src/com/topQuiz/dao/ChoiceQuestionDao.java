package com.topQuiz.dao;

import com.topQuiz.model.ChoiceQuestion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * choice question DAO
 * @author jady
 *
 */
public class ChoiceQuestionDao {

	/**
	* add choice question
	* @param con
	* @param choiceQuestion
	* @return
	* @throws Exception
	*/
	public int add(Connection con, ChoiceQuestion choiceQuestion) throws Exception{
	    String sql = "insert into t_choiceQuestion values(null,?,?,?,?,?,?)";
	    PreparedStatement pstmt = con.prepareStatement(sql);
	    pstmt.setString(1, choiceQuestion.getQuestion());
	    pstmt.setString(2, choiceQuestion.getChoice1());
	    pstmt.setString(3, choiceQuestion.getChoice2());
	    pstmt.setString(4, choiceQuestion.getChoice3());
	    pstmt.setString(5, choiceQuestion.getChoice4());
	    pstmt.setString(6, choiceQuestion.getAnswer());
	    return pstmt.executeUpdate(); // return affected rows
	}

	public ResultSet search(Connection con) throws Exception {
		String sql = "select * from t_ChoiceQuestion order by rand() limit 10";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeQuery();
	}

	
}




