/**
 * 
 * Tennis Point
 *
 */
public class Point {
	private Player player1;
	private Player player2;
	
	public Point( Player player1, Player player2 ) throws InvalidPlayerException
	{
		if( player1 == null || player2 == null ){
			throw new InvalidPlayerException();
		}
		
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public Player getWinner()
	{
		if( (player1.getScoreInt() - player2.getScoreInt()) > 0 ){
			return player1;
		}
		else if( (player1.getScoreInt() - player2.getScoreInt()) < 0 ){
			return player2;
		}
		else{
			return null;
		}
	}
	
	
	
	
}
