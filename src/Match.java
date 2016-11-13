/**
 * 
 * Tennis Point
 *
 */
public class Match {
	private Player player1;
	private Player player2;

	/**
	 * if true the match is finished
	 */
	public boolean isWon = false;

	/**
	 * 
	 * @param player1
	 * @param player2
	 * @throws InvalidPlayerException
	 */
	public Match( Player player1, Player player2 ) throws InvalidPlayerException
	{
		if( player1 == null || player2 == null ){
			throw new InvalidPlayerException();
		}

		this.player1 = player1;
		this.player2 = player2;
	}

	/**
	 * set scoring player1 and player2
	 * @param s1 if true player1 winned
	 * @param s2 if true player2 winned
	 * @throws MatchAlreadyWonException
	 */
	public void setScoring( boolean s1, boolean s2 ) throws MatchAlreadyWonException
	{
		if( isWon == true ){
			throw new MatchAlreadyWonException();
		}

		setPlayerScore( s1, s2 );
		isWon = isWon();
	}

	/**
	 * set scoring player1 and player2
	 * @param s1
	 * @param s2
	 */
	private void setPlayerScore( boolean s1, boolean s2 )
	{
		if( s1 == true ){
			player1.incrementScore();
		}
		else if( s2 == true ){
			player2.incrementScore();
		}
	}

	/**
	 * check if the match is finished
	 * @return true if the match is finished
	 */
	public boolean isWon()
	{
		int s1 = player1.getScore();
		int s2 = player2.getScore();

		if( s1 < 4 && s2 < 4 ){
			return false;
		}
		if( ( s1 - 2 ) >= s2 ){
			return true;
		}
		if( ( s2 - 2 ) >= s1 ) {
			return true;
		}

		return false;
	}

	/**
	 * 
	 * @return player1 and player2 score
	 */
	public int[] getScoring()
	{
		int[] scoring = { player1.getScore(), player2.getScore() };
		return scoring;
	}

	/**
	 * 
	 * @return winner player
	 */
	private Player getWinner()
	{
		if( isWon == false ){
			return null;
		}
		if( player1.getScore() > player2.getScore() ){
			return player1;
		}
		else{
			return player2;
		}
	}

	/**
	 * 
	 * @return match state
	 */
	public String getMatchState()
	{
		if( player1.getScore() == 0 && player2.getScore() == 0 ){
			return "Initial " + player1.getScoreString() + " - " + player2.getScoreString();
		}
		else if( player1.getScore() >= 3 && player2.getScore() >= 3 && player1.getScore() == player2.getScore() ){
			return "Score: deuce";
		}
		else if( player1.getScore() >= 3 && player2.getScore() >= 3 && player1.getScore() == (player2.getScore() + 1) ){
			return "Score: advantage - " + player2.getScoreString();
		}
		else if( player1.getScore() >= 3 && player2.getScore() >= 3 && player2.getScore() == (player1.getScore() + 1) ){
			return "Score: " + player1.getScoreString() + " - advantage";
		}
		else if( isWon() ){
			return "Score: " + getWinner().toString() + " wins";
		}
		else{
			return "Score: " + player1.getScoreString() + " - " + player2.getScoreString();
		}
	}



}
