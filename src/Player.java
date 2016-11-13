/**
 * 
 * Tennis Player
 *
 */
public class Player {
	private Score score;
	
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
	 * @param score
	 * @throws InvalidScoreException
	 */
	public Player( Score score ) throws InvalidScoreException
	{
		this();
		setScore( score );
	}

	/**
	 * 
	 * @return player score
	 */
	public Score getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 * @throws InvalidScoreException
	 */
	public void setScore( Score score ) throws InvalidScoreException {
		if( score == null ){
			throw new InvalidScoreException();
		}
		
		this.score = score;
	}
	
	@Override
	public String toString(){
		return "Player" + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals( Object obj ) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Player other = (Player) obj;
		if ( id != other.id )
			return false;
		return true;
	}
	
	
	
	
}
