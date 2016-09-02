
public class TennisGame 
{
	private static int player1Points = 0;
	private static int player2Points = 0;
	private static String[] resultString = {"love", "15", "30", "40", "deuce", "advantage"} 
	
	public static void main(String[] args)
	{
		setScore(0,0);
		player1Scored();
		player1Scored();
		player2Scored();
		player2Scored();
		player2Scored();
		player2Scored();
		player2Scored();
		player2Scored();
		player2Scored();
	}
	
	public static void player1Scored()
	{
		player1Points++;
		showScore();
	}
	
	public static void player2Scored()
	{
		player2Points++;
		showScore();
	}
	
	private static void showScore() 
	{
		System.out.println("points are: " + player1Points + " - " + player2Points);		
		
	}

	public static void setScore(int set1, int set2)
	{
		player1Points = set1;
		player2Points = set2;
		showScore();
	}
}
