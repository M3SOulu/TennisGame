/**
 * 
 * Tennis Point
 *
 */
public class Match {
	private Player player1;
	private Player player2;

	private int winnerPointPlayer1 = 0;
	private int winnerPointPlayer2 = 0;

	public Match( Player player1, Player player2 ) throws InvalidPlayerException
	{
		if( player1 == null || player2 == null ){
			throw new InvalidPlayerException();
		}

		this.player1 = player1;
		this.player2 = player2;
	}

	public void setScores( Score score1, Score score2 ) throws InvalidScoreException
	{
		if( score1 == null || score2 == null ){
			throw new InvalidScoreException();
		}

		player1.setScore( score1 );
		player2.setScore( score2 );
	}

	public Player getWinner()
	{
		if( player1.getScore().compareTo( player2.getScore() ) > 0 ){
			return player1;
		}
		else if( player1.getScore().compareTo( player2.getScore() ) < 0 ){
			return player2;
		}
		else{
			return null;
		}
	}

//		public void addPoint( Point p ){
//		if( p.getWinner().getId() == 1 ){
//			this.winnerPointPlayer1++;
//		}
//		else{
//			this.winnerPointPlayer2++;
//		}
//	}
//
//
//	public boolean isWon()
//	{
//		if( ! (winnerPointPlayer1 == 4 || winnerPointPlayer2 == 4) ){
//			return false;
//		}
//		if( ! ( winnerPointPlayer1 >= (winnerPointPlayer2 + 2) ||
//				winnerPointPlayer2 >= (winnerPointPlayer1 + 2))) {
//			return false;
//		}
//
//		return true;
//	}



}
