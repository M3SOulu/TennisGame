
public class TennisGame 
{
	private static int player1Points = 0;
	private static int player2Points = 0;
	private static int minShowPoints = 0;
	private static int maxShowPoints = 3;
	
	private static String[] resultString = {"love", "fifteen", "thirty", "forty"} 
	private static String outOfRangeString = "out of range";
	private static String deuce = "deuce";
	private static String advantage = "advantage";
	private static String player1 = "player1";
	private static String player2 = "player2";
	
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
		if (player1Points >= minShowPoints && player2Points >= minShowPoints  )
		{
			if (player1Points <= maxShowPoints && player2Points <= maxShowPoints)
		}
		else
		{
			System.out.println(player1 + " " + resultString[player1Points] + " - " + player2 +);
		}
	}

	public static void setScore(int set1, int set2)
	{
		player1Points = set1;
		player2Points = set2;
		showScore();
	}
}
