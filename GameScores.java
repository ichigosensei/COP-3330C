
public class GameScores {
	
	//creating variables to store scores
	private String gamePlayer;
	private int quizScore = 0;
	private String overallTime = "0";
	private int markTime = 0;

public GameScores(String p1) {
		
		gamePlayer = p1; //this is for the current player of the game
}

public GameScores(String p1, int totalScore, String totalTime) {
	
		gamePlayer = p1;
		quizScore = totalScore;
		overallTime = totalTime;
}

public void increaseScore() {
		quizScore++;
}

public void setTime(int gameTime) {
		markTime += gameTime;
		overallTime = "0:" +markTime;
}

public String getName() {

	return gamePlayer;
}

public String getTime() {

	return overallTime;
}

public int getScore() {

	return quizScore;
}

public String toString() {

	return "\nName of Player: " + gamePlayer +
			"\nPlayer Score: " + quizScore +
			"\nTime of Player: " +overallTime;
	
	}
}

