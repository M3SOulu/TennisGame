/**
 * 
 * Tennis single Score
 *
 */
public class Score {
	private int score;
	
	private final static int MIN_SCORE = 0;
	private final static int MAX_SCORE = 3;
	
	public Score( int score ) throws InvalidScoreException
	{
		if( score < MIN_SCORE || score > MAX_SCORE ){
			throw new InvalidScoreException();
		}
		
		this.score = score;
	}

	public int getScore() {
		return score;
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

	
}
