/**
 * 
 * Tennis Match
 *
 */
public class Match {
	private int winnerPointPlayer1 = 0;
	private int winnerPointPlayer2 = 0;
	
	/**
	 *
	 * @param p point
	 */
	public void addPoint( Point p ){
		if( p.getWinner().getId() == 1 ){
			this.winnerPointPlayer1++;
		}
		else{
			this.winnerPointPlayer2++;
		}
	}
	
//	public int getWinnerPointPlayer1(){
//		
//	}
//	
//	public int getWinnerPointPlayer2(){
//		
//	}
	
	public boolean isWon()
	{
		if( ! (winnerPointPlayer1 == 4 || winnerPointPlayer2 == 4) ){
			return false;
		}
		if( ! ( winnerPointPlayer1 >= (winnerPointPlayer2 + 2) ||
				 winnerPointPlayer2 >= (winnerPointPlayer1 + 2))) {
			return false;
		}
		
		return true;
	}
	
	
	
}
