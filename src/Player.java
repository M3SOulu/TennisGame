/**
 * 
 * Tennis Player
 *
 */
public class Player {
	private Score score = new Score();
	
	private static int count = 0;
	private int id = 0;
	
	/**
	 * set an incremental id to player
	 */
	public Player()
	{
		count++;
		id = count;
	}
	
	/**
	 * 
	 * @return score
	 */
	public int getScore()
	{
		return score.getScore();
	}
	
	/**
	 * 
	 * @return player id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * increment player score
	 */
	public void incrementScore() {
		score.incrementScore();
	}
	
	/**
	 * 
	 * @return string score
	 */
	public String getScoreString()
	{
		return score.toString();
	}
	
	
	@Override
	public String toString(){
		return "Player" + id;
	}

		
	
}
