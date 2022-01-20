

import javax.swing.plaf.nimbus.State;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class JavaDB {

	private static String sqlJava = "C:\\Users\\s.trinidad\\Documents\\SQLite"; //location of database
	private static String sqlName = "TriviaGame.db"; //name of database

ArrayList<GameScores> arrayList = null;

public void insertScore(GameScores currentScore){

	String sqlLink = sqlJava + sqlName;
	Connection sqlConnect = null;
	Statement sqlStatement = null;

try {
	
	sqlConnect = DriverManager.getConnection(sqlLink);
	sqlConnect.setAutoCommit(false);
	sqlStatement = sqlConnect.createStatement();

	//inserting the score values into the score table
	String sql ="INSERT INTO SCORES (Name of Player, Player Score, Time of Player)" +
				"VALUES ('" + currentScore.getName() +"'," + currentScore.getScore() +",'" + currentScore.getTime() +"')";

	sqlStatement.executeUpdate(sql);
	sqlStatement.close();
	sqlConnect.commit();
	sqlConnect.close();

} catch(Exception sqlStorage) {

	System.out.println(sqlStorage.getMessage());
	
	}
}

public ArrayList<GameScores> GenerateWinners(){

	String url = sqlJava + sqlName;

	arrayList = new ArrayList<GameScores>();

	Connection sqlConnect = null;
	Statement sqlStatement = null;

try {
	
	sqlConnect = DriverManager.getConnection(url);

	sqlStatement = sqlConnect.createStatement();
	ResultSet set = sqlStatement.executeQuery("SELECT * FROM SCORES ORDER BY Score DESC;"); //this selects the score table and orders them

	while(set.next()) {

		String winningPlayer = set.getString("Name of Players");
		int playerScore = set.getInt("Player Scores");
		String playerTime = set.getString("Time of Players");

		arrayList.add(new GameScores(winningPlayer, playerScore, playerTime));
}

	sqlStatement.close();
	sqlConnect.close();

	return arrayList;

} catch(Exception sqlStorage) {

	System.out.println(sqlStorage.getMessage());

		} return null;
	}
}