//Submitted By: Trinidad, Strawberry Ann
//Date: December 12, 2021
//Resources: https://www.w3schools.com/java/java_user_input.asp
//https://www.javatpoint.com/how-to-get-input-from-user-in-java
//https://www.delftstack.com/howto/java/countdown-timer-java/
//https://www.geeksforgeeks.org/different-ways-reading-text-file-java/
//https://www.javatpoint.com/java-timestamp
//https://www.java-made-easy.com/java-jframe.html

//Note: This program is runnable but I am aware of not meeting all requirements of the project and have given what I had with what I know.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;  
import java.time.Instant;
import java.util.Scanner;
import javax.swing.JLabel;  

public class Main {
	public static void main(String[] args) throws IOException {
		
		//reads the given text file called input.txt that was provided
		File inputText = new File("C:\\Users\\s.trinidad\\Documents\\input.txt");

	        BufferedReader readText
	            = new BufferedReader(new FileReader(inputText));
	 
	        String objText;
	
	        while ((objText = readText.readLine()) != null)
	        	
	        	//prints out the text in the file to the console to test
	            System.out.println(objText);            
	        
	        Timestamp instant= Timestamp.from(Instant.now());  
	        System.out.println("Timestamp #1: "+ instant);  
	        
		TriviaGame triviagame = new TriviaGame();
		
	}
}
