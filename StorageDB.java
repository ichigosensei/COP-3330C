import java.sql.*;

public class StorageDB {
	
	private static String sqlJava = "C:\\Users\\s.trinidad\\Documents\\SQLite"; //Location of the database software
	private static String sqlName = "TriviaGame.db"; // Name of Database
	private static String linkSQL = sqlJava + sqlName;

public static void createNewDatabase(){

	Connection connectionSQL = null;

try {
	
	connectionSQL = DriverManager.getConnection(linkSQL);

if(connectionSQL!= null) {

	}

} catch(SQLException getSQL) {

	System.out.println(getSQL.getMessage());
}

createTables();

}

public static void createTables(){

	Connection connectionSQL = null;
	Statement statementSQL = null;

try {

	connectionSQL = DriverManager.getConnection(linkSQL);
	statementSQL = connectionSQL.createStatement();
	
	//Creation of Table for Storage
	String storageSQL = "CREATE TABLE SCORES" +
						"(ID INTEGER PRIMARY KEY ,"+
						"Name of Player TEXT NOT NULL," +
						"Player Scores INT NOT NULL," +
						"Time of Players TEXT)";

	statementSQL.executeUpdate(storageSQL);
	statementSQL.close();
	connectionSQL.close();

} catch(Exception getSQL) {

	System.err.println( getSQL.getClass().getName() + getSQL.getMessage());
	System.exit(0);
	
		}
	}
}
