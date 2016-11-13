/**
 * 
 * Tennis Point
 *
 */
public class Match {
	private Player player1;
	private Player player2;

	/**
	 * single matches won by player 1
	 */
	private int winnerPointsPlayer1 = 0;
	/**
	 * single matches won by player 2
	 */
	private int winnerPointsPlayer2 = 0;
	
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
		
		if( player1.getScore() != null && player2.getScore() != null ){
			setWinnerPoints();		//players have already played a match
		}
	}

	/**
	 * set a match played by player1 and player2
	 * @param score1
	 * @param score2
	 * @throws InvalidScoreException
	 * @throws MatchAlreadyWonException
	 */
	public void setScoring( Score score1, Score score2 ) throws InvalidScoreException, MatchAlreadyWonException
	{
		if( isWon == true ){
			throw new MatchAlreadyWonException();
		}
		
		setPlayerScore( score1, score2 );
		setWinnerPoints();
		isWon = isWon();
	}
	
	/**
	 * set single scores to players
	 * @param score1
	 * @param score2
	 * @throws InvalidScoreException
	 */
	private void setPlayerScore( Score score1, Score score2 ) throws InvalidScoreException
	{
		if( score1 == null || score2 == null ){
			throw new InvalidScoreException();
		}

		player1.setScore( score1 );
		player2.setScore( score2 );
	}

	/**
	 * set a point to player who has won the match
	 */
	private void setWinnerPoints()
	{
		if( player1.getScore().compareTo( player2.getScore() ) > 0 ){
			winnerPointsPlayer1++;
		}
		else if( player1.getScore().compareTo( player2.getScore() ) < 0 ){
			winnerPointsPlayer2++;
		}
	}

	/**
	 * check if the match is finished
	 * @return true if the match is finished
	 */
	public boolean isWon()
	{
		if( ! (winnerPointsPlayer1 >= 4 || winnerPointsPlayer2 >= 4) ){
			return false;
		}
		if( ! ( winnerPointsPlayer1 >= (winnerPointsPlayer2 + 2) ||
				winnerPointsPlayer2 >= (winnerPointsPlayer1 + 2))) {
			return false;
		}

		return true;
	}
	
	/**
	 * 
	 * @return number of points won by player 1
	 */
	public int getWinnerPointsPlayer1() {
		return winnerPointsPlayer1;
	}

	/**
	 * 
	 * @return number of points won by player 2
	 */
	public int getWinnerPointsPlayer2() {
		return winnerPointsPlayer2;
	}
	
	
	public String getMatchState()
	{
		return null;
	}



}
