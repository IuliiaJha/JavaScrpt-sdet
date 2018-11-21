
public class HighScoreTask {

	public static void main(String[] args) {
		displayHighScorePosition ("Mike", calculateHighScorePosition(300));

	}
	public static void displayHighScorePosition (String a, int b) {

		System.out.println(a + " managed to get into position " + b + " on the hight score table");
	}
	public static int calculateHighScorePosition(int score) {
		
		if (score >= 1000){
			return  1;
		}else if  (score >= 500){
			return  2;
		}else if (score>=100) {
			return 3;
		}else {
			return 4;
	}
	
	}	
	
}
