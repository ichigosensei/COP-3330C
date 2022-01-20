import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class QuizChoices extends TriviaGame {
	
	//creation of arrays for storage
	ArrayList<Object> ansObj;
	ArrayList<String> ansLabels = new ArrayList<String>();

public QuizChoices(ArrayList<Object> choiceAns){

	try {
		
		ansObj = new ArrayList<Object>(choiceAns);

		for (Object quizAns : choiceAns) {
			ansLabels.add(String.valueOf(quizAns));
	}
} catch (Exception ansQuiz){

	System.out.println(ansQuiz);
	}
}

public ArrayList<Object> getQuizObjects(){

	return ansObj;
}

public ArrayList<String> getQuizLabels(){

	return ansLabels;
}

public boolean compareItem(Object answerChoices){
	
	// creating the else-if statements for obj1 and obj2 on the trivia game
	String stringAns1 = null, stringAns2 = null;
	Integer intAns1 = 0, intAns2 = 0;
	Double doubleAns1 = 0d, doubleAns2 = 0d;

		if(ansObj.get(0) instanceof Integer) {
			intAns1 = (Integer) ansObj.get(0);
			
} else if(ansObj.get(0) instanceof Double) {
	doubleAns1 = (Double) ansObj.get(0);
	
} else if(ansObj.get(0) instanceof String) {
	stringAns1 = (String) ansObj.get(0);
	
} if(ansObj.get(1) instanceof Integer) {
	intAns2 = (Integer) ansObj.get(1);
} else if(ansObj.get(1) instanceof Double) {
	doubleAns2 = (Double) ansObj.get(1);
} else if(ansObj.get(1) instanceof String) {
	stringAns2 = (String) ansObj.get(1);
}
	//creation of the trivia questions
	Object answer1 = intAns1 + intAns2;
	Object answer2 = intAns1 + stringAns2;
	Object answer3 = intAns1 + doubleAns2;
	Object answer4 = doubleAns1 + intAns2;
	Object answer5 = doubleAns1 + stringAns2;
	Object answer6 = doubleAns1 + doubleAns2;
	Object answer7 = stringAns1 + intAns2;
	Object answer8 = stringAns1 + stringAns2;
	Object answer9 = stringAns1 + doubleAns2;

	if (answer1.equals(answerChoices) || answer2.equals(answerChoices) || answer3.equals(answerChoices) ||answer4.equals(answerChoices) 
		|| answer5.equals(answerChoices) || answer6.equals(answerChoices) ||answer7.equals(answerChoices) || answer8.equals(answerChoices) 
		|| answer9.equals(answerChoices) ) {

			return true;
			
		} return false;
	}
}