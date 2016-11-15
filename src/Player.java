/**
 * 
 * Tennis Player
 *
 */
public class Player {
	private Score score;
	private static int count = 0;
	private int id = 0;

	
	public Player()
	{
		count++;
		id = count;
	}
	
	
	public Player( Score score ) throws InvalidScoreException
	{
		this();
		setScore( score );
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
	
	public int getId(){
		return id;
	}
	
	public Score getScore(){
		return score;
	}


	
	
}
