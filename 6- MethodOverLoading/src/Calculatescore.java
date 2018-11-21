
public class Calculatescore {

	public static void main(String[] args) {
		int newScore = calculateScore("Mike",500);
		System.out.println("New Score is " + newScore);
		calculateScore(100);
		calculateScore();

	}
	public static int calculateScore(String playerName, int score) {
		 System.out.println("Player " +playerName+ " scored " + score + " points" );
		 return score*50;
	}
	public static int calculateScore( int score) {
		 System.out.println("Unnemed Player scored "  + score + " points" );
		 return score * 100;
	}
	 public static void calculateScore(){
		  System.out.println("No player name, No player score");
	 }
	 
}
