/**
 * 
 * Tennis Player
 *
 */
public class Player {
	private Score score;
	private static int ID = 0;
	
	public Player()
	{
		ID++;
	}
	
	public Player( Score score ) throws InvalidScoreException
	{
		setScore( score );
		ID++;
	}

	public int getScoreInt() {
		return score.getScore();
	}

	public void setScore( Score score ) throws InvalidScoreException {
		if( score == null ){
			throw new InvalidScoreException();
		}
		
		this.score = score;
	}
	
	
}
