/**
 * 
 * Tennis Player
 *
 */
public class Player {
	private Score score;
	
	private static int count = 0;
	private int id = 0;
	
	private Player()
	{
		count++;
		id = count;
	}
	
	public Player( Score score ) throws InvalidScoreException
	{
		this();
		setScore( score );
	}

	public Score getScore() {
		return score;
	}

	public void setScore( Score score ) throws InvalidScoreException {
		if( score == null ){
			throw new InvalidScoreException();
		}
		
		this.score = score;
	}
	
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
