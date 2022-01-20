import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.sql.Timestamp;  
import java.time.Instant;  

public class TriviaGame implements ActionListener { // Start
	
	int seconds = 5;
	
	//Create a frame, panels, labels, buttons, and text fields
	JFrame triviaFrame;
	JPanel panel1, panel2, panel3, panel4, panel5, panel6, mainPanel;
	JLabel playersName, nameInput, totalPoints, gameTimer, obj1, obj2, answersArea, timeSettings, seconds_left, signSymbol, pointCounter;
	JButton randomButton, exitGame, c1, c2, c3,c4, playerInput;
	
	Timer timer = new Timer() {
		
		public void actionPerformed(ActionEvent countClock) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
				
			}
			}
};

TriviaGame() {
	
	//Title of the window
	triviaFrame = new JFrame("Trivia Game"); 
	
	//Adding panels to the window
	panel1 = new JPanel ();
	panel2 = new JPanel ();
	panel3 = new JPanel ();
	panel4 = new JPanel ();
	panel5 = new JPanel ();
	panel6 = new JPanel ();
	mainPanel = new JPanel ();
	
	playersName = new JLabel("Player's Name: ");
	totalPoints = new JLabel("Total Points: ");
	pointCounter = new JLabel("0");
	
    Scanner playerInput = new Scanner(System.in); 
    System.out.print("Enter your name: ");  
    String pName = playerInput.nextLine(); 
    nameInput = new JLabel (pName);
    
	gameTimer = new JLabel();
	obj1 = new JLabel("Object 1 ");
	signSymbol = new JLabel ("+");
	obj2 = new JLabel(" Object 2");
	answersArea = new JLabel ("*** Answers Area ***");
	seconds_left = new JLabel();
	
	c1 = new JButton();
	c2 = new JButton();
	c3 = new JButton();
	c4 = new JButton();
	randomButton = new JButton("Generate Report");
	exitGame = new JButton("Exit Game");
	
	timeSettings = new JLabel();
	
		panel1.add(playersName);
		panel1.add(nameInput);
		panel2.add(totalPoints);
		panel2.add(pointCounter);
		panel3.add(timeSettings);
		panel3.add(gameTimer);
		panel4.add(answersArea);
		panel4.add(c1);
		panel4.add(c2);
		panel4.add(c3);
		panel4.add(c4);
		panel5.add(obj1);
		panel5.add(signSymbol);
		panel5.add(obj2);
		panel6.add(randomButton);
		panel6.add(exitGame);

		//Adding them all to the main panel for code reference
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel5);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel6);
		
		//Setting the grid layout and size
		mainPanel.setLayout(new GridLayout(4, 1));
		
		triviaFrame.add(mainPanel);
		triviaFrame.setVisible(true);
		triviaFrame.setSize(430, 650);

		c1.setFont(new Font("Calibri",Font.BOLD,14));
		c1.setFocusable(false);
		c1.addActionListener(this);
		c1.setText("Choice 1");
		
		c2.setFont(new Font("Calibri",Font.BOLD,14));
		c2.setFocusable(false);
		c2.addActionListener(this);
		c2.setText("Choice 2");
		
		c3.setFont(new Font("Calibri",Font.BOLD,14));
		c3.setFocusable(false);
		c3.addActionListener(this);
		c3.setText("Choice 3");
		
		c4.setFont(new Font("Calibri",Font.BOLD,14));
		c4.setFocusable(false);
		c4.addActionListener(this);
		c4.setText("Choice 4");
		
		obj1.setFont(new Font("Calibri",Font.PLAIN,20));
		obj1.setHorizontalAlignment(JTextField.CENTER);
		
		obj2.setFont(new Font("Calibri",Font.PLAIN,20));
		obj2.setHorizontalAlignment(JTextField.CENTER);
		
		signSymbol.setFont(new Font("Calibri",Font.BOLD,30));
		
		answersArea.setFont(new Font("Calibri",Font.PLAIN,16));
		playersName.setFont(new Font("Calibri",Font.PLAIN,16));
		totalPoints.setFont(new Font("Calibri",Font.PLAIN,16));
		
		nameInput.setBounds(100,210,50,50);
		nameInput.setForeground(new Color(0,100,0));
		nameInput.setFont(new Font("Calibri",Font.BOLD,25));
		nameInput.setBorder(BorderFactory.createBevelBorder(1));
		nameInput.setOpaque(true);
		nameInput.setHorizontalAlignment(JTextField.CENTER);
		
		pointCounter.setBounds(100,210,50,50);
		pointCounter.setForeground(new Color(0,0,0));
		pointCounter.setFont(new Font("Calibri",Font.BOLD,20));
		pointCounter.setBorder(BorderFactory.createBevelBorder(1));
		pointCounter.setOpaque(true);
		pointCounter.setHorizontalAlignment(JTextField.CENTER);
		
		gameTimer.setBounds(100,210,50,50);
		gameTimer.setForeground(new Color(0,0,0));
		gameTimer.setFont(new Font("Calibri",Font.BOLD,20));
		gameTimer.setBorder(BorderFactory.createBevelBorder(1));
		gameTimer.setOpaque(true);
		gameTimer.setHorizontalAlignment(JTextField.CENTER);
		gameTimer.setText(String.valueOf(seconds));
		
		// Timer counts down
		Thread countdownTimer = new Thread() {
			@Override 
			public void run() {
				try {
					while(seconds>=0) {
						Thread.sleep(1000);
						gameTimer.setText(String.valueOf(seconds));
						seconds--;
					}
				} catch (Exception e) {
				
				}
				
				super.run();
			}
		};
		
		countdownTimer.start();
		
		timeSettings.setBounds(535,475,100,25);
		timeSettings.setForeground(new Color(0,0,0));
		timeSettings.setFont(new Font("Calibri",Font.PLAIN,16));
		timeSettings.setHorizontalAlignment(JTextField.CENTER);
		timeSettings.setText("Time Remaining:");
		
		//This will exit the program
		exitGame.addActionListener(new ActionListener()
		
	{
			
	public void actionPerformed(ActionEvent ae) {
		System.exit(0);

	}

		});
	    
}

protected void displayAnswer() {
	// TODO Auto-generated method stub
	
}

public void actionPerformed(ActionEvent e) {
	
}
}