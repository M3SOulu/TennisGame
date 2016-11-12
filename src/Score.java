/**
 * 
 * Tennis single Score
 *
 */
public class Score implements Comparable<Score>{
	private int score;
	
	private final static int MIN_SCORE = 0;
	private final static int MAX_SCORE = 3;
	
	public Score( int score ) throws InvalidScoreException
	{
		setScore(score);
	}

	public int getScore() {
		return score;
	}
	
	public void setScore( int score ) throws InvalidScoreException
	{
		if( score < MIN_SCORE || score > MAX_SCORE ){
			throw new InvalidScoreException();
		}
		
		this.score = score;
	}
	
	public String toString()
	{
		String stringScore = "";
		
		if( score == 0 ){
			stringScore = "love";
		}
		else if( score == 1 ){
			stringScore = "15";
		}
		else if( score == 2 ){
			stringScore = "30";
		}
		else if( score == 3 ){
			stringScore = "40";
		}
		
		return stringScore;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		if (score != other.score)
			return false;
		return true;
	}

	@Override
	public int compareTo( Score score2 ) {
		// TODO Auto-generated method stub
		if( score > score2.getScore() ){
			return 1;
		}
		else if( score == score2.getScore() ){
			return 0;
		}
		else{
			return -1;
		}
	}

	
}
