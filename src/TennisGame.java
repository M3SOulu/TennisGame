
public class TennisGame {

	private int player1Score = 0;
	private int player2Score = 0;		
	private String player1Stat = "Love";
	private String player2Stat = "Love";
	

	// Get status of the game as simple string
	public String getGameStatus() 	
	{		
		return "Player 1: " + player1Stat + " :: Player 2: " + player2Stat;
	}
	
	public String getPlayer1()
	{
		return player1Stat;
	}
	
	public String getPlayer2()
	{
		return player2Stat;
	}
	
	
	// Player1 scored
	public void ScorePlayer1() 
	{
		player1Score++;
		UpdateScores(player1Score, player2Score);
		
	}
	
	// Player2 scored
	public void ScorePlayer2() 
	{
		player2Score++;
		UpdateScores(player1Score, player2Score);
	}

	// NOTE! Currently does not parse back real tennis scores
	public void setScorePlayer1(int newScore)
	{
		player1Score = newScore;		
		UpdateScores(player1Score, player2Score);
	}
	
	// NOTE! Currently does not parse back real tennis scores
	public void setScorePlayer2(int newScore)
	{
		player2Score = newScore;				
		UpdateScores(player1Score, player2Score);
	}
	
	private void UpdateScores(int player1Score, int player2Score) 
	{
		player1Stat = CheckScores(player1Score, player2Score, player1Stat);						
		player2Stat = CheckScores(player2Score, player1Score, player2Stat);				
	}
	
	// Logic handling the various scoring situations
	/**
	 * @param p1Score 
	 * @param p2Score 
	 * @param playerSit
	 * @return updated status string in tennis style
	 */
	private String CheckScores(int p1Score, int p2Score, String playerSit) 
	{

		// Win condition		
		// More than 3 points scored over game
		if(p1Score > 3)			
		{
			// Two points more than opponent?
			if(p2Score + 2 <= p1Score)
			{
				playerSit = "Win";				
			}
			else 
			{
				// More than 3 points scored for player, only advantage or deuce
				// situations left or player has 40
				if(p1Score > p2Score)	
					playerSit = "Advantage";				
				if(p1Score < p2Score)
					playerSit = "40";				
			}
		}
		else 
		{
				// Handle the tennis scoring 4 actual points
				switch(p1Score)			 
				{					
					case 0: playerSit = "Love"; break;
					case 1: playerSit = "15"; break;
					case 2: playerSit = "30"; break;
					case 3: playerSit = "40"; break;
				}
		}		
		
		// More than 3 points and even
		if(p1Score == p2Score && (p1Score > 2 && p2Score > 2))
			playerSit = "Deuce";
		
		return playerSit;
	}
	
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TennisGame game = new TennisGame();	
		
		// Test first set game, ends to p1 win
		game.ScorePlayer1();
		game.ScorePlayer2();		
		game.ScorePlayer1();
		game.ScorePlayer1();
		game.ScorePlayer1();
		System.out.println(game.getGameStatus());

		System.out.println("New Game");		
		// Second set game, ends to deuce
		game = new TennisGame();
		game.ScorePlayer1();
		game.ScorePlayer2();
		game.ScorePlayer1();
		game.ScorePlayer1();
		game.ScorePlayer2();
		game.ScorePlayer2();		
		System.out.println(game.getGameStatus());
		

		// 3rd test game
		System.out.println("New Game");
		game = new TennisGame();
		game.setScorePlayer1(2);
		game.setScorePlayer2(2);
		
		System.out.println(game.getGameStatus());
		game.ScorePlayer1();
		System.out.println(game.getGameStatus());
		game.ScorePlayer2();		
		System.out.println(game.getGameStatus());
		game.ScorePlayer1();
		System.out.println(game.getGameStatus());

	}
}


